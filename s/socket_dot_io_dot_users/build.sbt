organization := "org.scalablytyped"
name := "socket_dot_io_dot_users"
version := "0.0-unknown-dt-20220818Z-265f4d"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "cors" % "2.8-dt-20211202Z-43e3d6",
  "org.scalablytyped" %%% "engine_dot_io" % "6.2.0-e11843",
  "org.scalablytyped" %%% "engine_dot_io-parser" % "5.0.4-fd3f86",
  "org.scalablytyped" %%% "express" % "4.17-dt-20220913Z-318396",
  "org.scalablytyped" %%% "express-serve-static-core" % "0.1.1-9fa163",
  "org.scalablytyped" %%% "express-session" % "1.17-dt-20220707Z-a32c90",
  "org.scalablytyped" %%% "mime" % "3.0-dt-20220804Z-9884c6",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221018Z-1e532a",
  "org.scalablytyped" %%% "qs" % "6.9-dt-20220913Z-76627f",
  "org.scalablytyped" %%% "serve-static" % "1.15-dt-20220729Z-3bb8ca",
  "org.scalablytyped" %%% "socket_dot_io" % "4.5.3-6d969e",
  "org.scalablytyped" %%% "socket_dot_io-adapter" % "2.4.0-3085bc",
  "org.scalablytyped" %%% "socket_dot_io-parser" % "4.2.1-f369df",
  "org.scalablytyped" %%% "socket_dot_io__component-emitter" % "3.1.0-7d06e5",
  "org.scalablytyped" %%% "std" % "4.8-3c7765")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
