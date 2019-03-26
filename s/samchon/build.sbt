organization := "org.scalablytyped"
name := "samchon"
version := "2.1.4-1519a4"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "ecol" % "1.0.4-9d1fd7",
  "org.scalablytyped" %%% "node" % "11.11-dt-20190325Z-000e7b",
  "org.scalablytyped" %%% "std" % "3.3-14e863",
  "org.scalablytyped" %%% "sxml" % "1.0.3-6a9c8e",
  "org.scalablytyped" %%% "tstl" % "2.1.2-20c42b",
  "org.scalablytyped" %%% "url-variables" % "1.0.2-3e3be1",
  "org.scalablytyped" %%% "websocket" % "0.0-unknown-dt-20190322Z-1cabc1")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        