organization := "org.scalablytyped"
name := "socket_dot_io"
version := "4.5.3-99a6c5"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "cors" % "2.8-dt-20221103Z-d598d6",
  "org.scalablytyped" %%% "engine_dot_io" % "6.2.0-88e9ed",
  "org.scalablytyped" %%% "engine_dot_io-parser" % "5.0.4-7592f4",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-def929",
  "org.scalablytyped" %%% "socket_dot_io-adapter" % "2.4.0-2a7d11",
  "org.scalablytyped" %%% "socket_dot_io-parser" % "4.2.1-272d95",
  "org.scalablytyped" %%% "socket_dot_io__component-emitter" % "3.1.0-f95008",
  "org.scalablytyped" %%% "std" % "4.9-5f989f")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
