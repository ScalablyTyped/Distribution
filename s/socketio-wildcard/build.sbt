organization := "org.scalablytyped"
name := "socketio-wildcard"
version := "2.0-dt-20220519Z-05d8ef"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "cors" % "2.8-dt-20221103Z-31839f",
  "org.scalablytyped" %%% "engine_dot_io" % "6.2.0-c712a9",
  "org.scalablytyped" %%% "engine_dot_io-parser" % "5.0.4-5ebbd6",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-86f548",
  "org.scalablytyped" %%% "socket_dot_io" % "4.5.3-5a7b07",
  "org.scalablytyped" %%% "socket_dot_io-adapter" % "2.4.0-e623e9",
  "org.scalablytyped" %%% "socket_dot_io-parser" % "4.2.1-b088b4",
  "org.scalablytyped" %%% "socket_dot_io__component-emitter" % "3.1.0-4aa18c",
  "org.scalablytyped" %%% "std" % "4.8-686d1d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
