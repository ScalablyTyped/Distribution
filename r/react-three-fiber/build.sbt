organization := "org.scalablytyped"
name := "react-three-fiber"
version := "5.3.1-0f9ec6"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "csstype" % "2.6.14-b8d190",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20200515Z-a12f9a",
  "org.scalablytyped" %%% "react" % "17.0-dt-20201121Z-c80121",
  "org.scalablytyped" %%% "react-native" % "0.63-dt-20201120Z-adb02e",
  "org.scalablytyped" %%% "react-reconciler" % "0.18-dt-20190109Z-3d6b59",
  "org.scalablytyped" %%% "react-use-measure" % "2.0.3-6e32c9",
  "org.scalablytyped" %%% "std" % "4.1-044efb",
  "org.scalablytyped" %%% "three" % "0.122.0-33a8c7",
  "org.scalablytyped" %%% "tiny-emitter" % "2.1.0-32e317")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
