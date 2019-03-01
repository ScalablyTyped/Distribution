organization := "org.scalablytyped"
name := "samchon"
version := "2.1.4-4583ed"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "ecol" % "1.0.4-838fd2",
  "org.scalablytyped" %%% "node" % "11.9-dt-20190222Z-99335f",
  "org.scalablytyped" %%% "std" % "3.3-6e4388",
  "org.scalablytyped" %%% "sxml" % "1.0.3-827ab1",
  "org.scalablytyped" %%% "tstl" % "2.1.2-5790fb",
  "org.scalablytyped" %%% "url-variables" % "1.0.2-09c5bf",
  "org.scalablytyped" %%% "websocket" % "0.0-unknown-dt-20180823Z-990d98")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        