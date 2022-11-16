organization := "org.scalablytyped"
name := "sass-loader"
version := "8.0-dt-20220102Z-d422c9"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "immutable" % "4.1.0-282ce3",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-4346d8",
  "org.scalablytyped" %%% "node-sass" % "4.11-dt-20220630Z-7ca9b4",
  "org.scalablytyped" %%% "sass" % "1.56.1-5389e5",
  "org.scalablytyped" %%% "source-map-js" % "1.0.2-ebadc8",
  "org.scalablytyped" %%% "std" % "4.9-c133ce")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
