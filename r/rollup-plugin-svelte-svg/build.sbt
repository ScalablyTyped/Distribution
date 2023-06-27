organization := "org.scalablytyped"
name := "rollup-plugin-svelte-svg"
version := "1.0-dt-20221025Z-af92fa"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "rollup" % "3.25.3-6095cd",
  "org.scalablytyped" %%% "std" % "5.1-9d5ad2",
  "org.scalablytyped" %%% "svelte" % "3.59.2-03a610")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
