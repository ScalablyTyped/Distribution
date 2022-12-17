organization := "org.scalablytyped"
name := "socket_dot_io_dot_users"
version := "0.0-unknown-dt-20220818Z-78e614"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "cors" % "2.8-dt-20221103Z-d598d6",
  "org.scalablytyped" %%% "engine_dot_io" % "6.2.0-88e9ed",
  "org.scalablytyped" %%% "engine_dot_io-parser" % "5.0.4-7592f4",
  "org.scalablytyped" %%% "express" % "4.17-dt-20220913Z-cb1e35",
  "org.scalablytyped" %%% "express-serve-static-core" % "0.1.1-5f1c10",
  "org.scalablytyped" %%% "express-session" % "1.17-dt-20220707Z-4960bc",
  "org.scalablytyped" %%% "mime" % "3.0-dt-20220804Z-85c9dc",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-def929",
  "org.scalablytyped" %%% "qs" % "6.9-dt-20220913Z-137229",
  "org.scalablytyped" %%% "serve-static" % "1.15-dt-20220729Z-d3379f",
  "org.scalablytyped" %%% "socket_dot_io" % "4.5.3-99a6c5",
  "org.scalablytyped" %%% "socket_dot_io-adapter" % "2.4.0-2a7d11",
  "org.scalablytyped" %%% "socket_dot_io-parser" % "4.2.1-272d95",
  "org.scalablytyped" %%% "socket_dot_io__component-emitter" % "3.1.0-f95008",
  "org.scalablytyped" %%% "std" % "4.9-5f989f")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
