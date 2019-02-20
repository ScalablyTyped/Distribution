organization := "org.scalablytyped"
name := "samchon-framework"
version := "2.1.4-e2a1b0"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "ecol" % "1.0.4-87cb41",
  "org.scalablytyped" %%% "node" % "11.9-dt-20190213Z-604ea6",
  "org.scalablytyped" %%% "samchon" % "2.1.4-0c1c5d",
  "org.scalablytyped" %%% "std" % "3.3-0ec965",
  "org.scalablytyped" %%% "sxml" % "1.0.3-656b6d",
  "org.scalablytyped" %%% "tstl" % "2.1.2-8e638c",
  "org.scalablytyped" %%% "url-variables" % "1.0.2-ac0721",
  "org.scalablytyped" %%% "websocket" % "0.0-unknown-dt-20180823Z-78f353")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        