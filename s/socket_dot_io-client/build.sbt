organization := "org.scalablytyped"
name := "socket_dot_io-client"
version := "4.6.1-25ff3c"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "engine_dot_io-client" % "6.4.0-735b5e",
  "org.scalablytyped" %%% "engine_dot_io-parser" % "5.0.6-7db265",
  "org.scalablytyped" %%% "node" % "20.1-dt-20230511Z-0320fc",
  "org.scalablytyped" %%% "socket_dot_io-parser" % "4.2.2-e1b854",
  "org.scalablytyped" %%% "socket_dot_io__component-emitter" % "4.0.0-7185bd",
  "org.scalablytyped" %%% "std" % "5.0-e63739")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
