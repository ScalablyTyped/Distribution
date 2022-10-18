organization := "org.scalablytyped"
name := "socketio-wildcard"
version := "2.0-dt-20220519Z-390a9e"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "cors" % "2.8-dt-20211202Z-2dd2b5",
  "org.scalablytyped" %%% "engine_dot_io" % "6.2.0-a6e891",
  "org.scalablytyped" %%% "engine_dot_io-parser" % "5.0.4-fd3f86",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221015Z-0a42ca",
  "org.scalablytyped" %%% "socket_dot_io" % "4.5.3-535975",
  "org.scalablytyped" %%% "socket_dot_io-adapter" % "2.4.0-f1ffc2",
  "org.scalablytyped" %%% "socket_dot_io-parser" % "4.2.1-f369df",
  "org.scalablytyped" %%% "socket_dot_io__component-emitter" % "3.1.0-7d06e5",
  "org.scalablytyped" %%% "std" % "4.8-3c7765")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
