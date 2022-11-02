organization := "org.scalablytyped"
name := "socketio-wildcard"
version := "2.0-dt-20220519Z-a286b3"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "cors" % "2.8-dt-20211202Z-534f18",
  "org.scalablytyped" %%% "engine_dot_io" % "6.2.0-4c88eb",
  "org.scalablytyped" %%% "engine_dot_io-parser" % "5.0.4-984bad",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-d0f137",
  "org.scalablytyped" %%% "socket_dot_io" % "4.5.3-897a6d",
  "org.scalablytyped" %%% "socket_dot_io-adapter" % "2.4.0-abb7e4",
  "org.scalablytyped" %%% "socket_dot_io-parser" % "4.2.1-fda131",
  "org.scalablytyped" %%% "socket_dot_io__component-emitter" % "3.1.0-a999fd",
  "org.scalablytyped" %%% "std" % "4.8-837c43")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
