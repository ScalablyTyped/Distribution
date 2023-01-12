organization := "org.scalablytyped"
name := "sc-channel"
version := "2.0-dt-20211202Z-f601f1"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "async-iterable-stream" % "3.0-dt-20211202Z-ef4e17",
  "org.scalablytyped" %%% "consumable-stream" % "2.0-dt-20220215Z-8ba726",
  "org.scalablytyped" %%% "std" % "4.9-ecb5eb",
  "org.scalablytyped" %%% "stream-demux" % "8.0-dt-20220215Z-eceeb6",
  "org.scalablytyped" %%% "writable-consumable-stream" % "2.0-dt-20220215Z-987f4d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
