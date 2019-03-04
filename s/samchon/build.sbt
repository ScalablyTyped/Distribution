organization := "org.scalablytyped"
name := "samchon"
version := "2.1.4-284dc9"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "ecol" % "1.0.4-00a480",
  "org.scalablytyped" %%% "node" % "11.10-dt-20190228Z-fd0a52",
  "org.scalablytyped" %%% "std" % "3.3-05be79",
  "org.scalablytyped" %%% "sxml" % "1.0.3-726a70",
  "org.scalablytyped" %%% "tstl" % "2.1.2-f30ebc",
  "org.scalablytyped" %%% "url-variables" % "1.0.2-28e2eb",
  "org.scalablytyped" %%% "websocket" % "0.0-unknown-dt-20180823Z-968cc4")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        