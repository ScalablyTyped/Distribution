organization := "org.scalablytyped"
name := "socket_dot_io-client"
version := "4.5.2-b3ffa4"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "engine_dot_io-client" % "6.2.2-89dce0",
  "org.scalablytyped" %%% "engine_dot_io-parser" % "5.0.4-78b511",
  "org.scalablytyped" %%% "node" % "18.7-dt-20220926Z-d201ab",
  "org.scalablytyped" %%% "socket_dot_io-parser" % "4.2.1-806962",
  "org.scalablytyped" %%% "socket_dot_io__component-emitter" % "3.1.0-2698ce",
  "org.scalablytyped" %%% "std" % "4.8-9f8efb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
