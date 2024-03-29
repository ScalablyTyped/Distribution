organization := "org.scalablytyped"
name := "rollup-plugin-node-resolve"
version := "5.2.0-9d7108"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "resolve" % "1.20.0-dt-20220818Z-cb4ab6",
  "org.scalablytyped" %%% "rollup" % "3.25.3-6095cd",
  "org.scalablytyped" %%% "std" % "5.1-9d5ad2")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
