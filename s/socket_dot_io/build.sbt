organization := "org.scalablytyped"
name := "socket_dot_io"
version := "4.5.2-997d6d"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "cors" % "2.8-dt-20211202Z-e65c64",
  "org.scalablytyped" %%% "engine_dot_io" % "6.2.0-fb5eed",
  "org.scalablytyped" %%% "engine_dot_io-parser" % "5.0.4-b5b88b",
  "org.scalablytyped" %%% "node" % "18.7-dt-20220913Z-77cc8d",
  "org.scalablytyped" %%% "socket_dot_io-adapter" % "2.4.0-62c5ea",
  "org.scalablytyped" %%% "socket_dot_io-parser" % "4.2.1-bfd427",
  "org.scalablytyped" %%% "socket_dot_io__component-emitter" % "3.1.0-a5c1c6",
  "org.scalablytyped" %%% "std" % "4.8-958c79")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
