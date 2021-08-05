organization := "org.scalablytyped"
name := "redux-socket_dot_io"
version := "1.4-dt-20200515Z-615b02"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "redux" % "4.0.5-3039e4",
  "org.scalablytyped" %%% "socket_dot_io-client" % "1.4.5-dt-20201002Z-55e9f5",
  "org.scalablytyped" %%% "std" % "4.1-2f6855")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
