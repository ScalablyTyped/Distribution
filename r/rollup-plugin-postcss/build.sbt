organization := "org.scalablytyped"
name := "rollup-plugin-postcss"
version := "2.0-dt-20200830Z-b9f5a2"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "cssnano" % "4.0-dt-20180802Z-2ed10d",
  "org.scalablytyped" %%% "postcss" % "7.0.35-7d3225",
  "org.scalablytyped" %%% "rollup" % "2.33.3-779c1f",
  "org.scalablytyped" %%% "source-map" % "0.7.3-081b8e",
  "org.scalablytyped" %%% "std" % "4.1-f7e8ab")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
