organization := "org.scalablytyped"
name := "samchon"
version := "2.1.4-b65a2c"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "ecol" % "1.0.4-b6ae72",
  "org.scalablytyped" %%% "node" % "10.12-dt-20190129Z-8da1df",
  "org.scalablytyped" %%% "std" % "3.3.1-6e0314",
  "org.scalablytyped" %%% "sxml" % "1.0.3-9efb79",
  "org.scalablytyped" %%% "tstl" % "2.1.1-a262b6",
  "org.scalablytyped" %%% "url-variables" % "1.0.2-1bc44f",
  "org.scalablytyped" %%% "websocket" % "0.0-unknown-dt-20180823Z-97afde")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        