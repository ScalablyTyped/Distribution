organization := "com.scalablytyped"
name := "socketio-wildcard"
version := "2.0-dt-20180910Z-9f8fe1"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "node" % "10.12-dt-20181116Z-cadd20",
  "com.scalablytyped" %%% "socket_dot_io" % "2.1-dt-20181104Z-f9faf5",
  "com.scalablytyped" %%% "socket_dot_io-client" % "1.4.5-dt-20180910Z-2e5410",
  "com.scalablytyped" %%% "std" % "3.1.3-0b55f4",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        