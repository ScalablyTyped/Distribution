organization := "org.scalablytyped"
name := "samchon-framework"
version := "2.1.4-2f2525"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "ecol" % "1.0.4-bfb0d5",
  "org.scalablytyped" %%% "node" % "10.12-dt-20190129Z-7cfc00",
  "org.scalablytyped" %%% "samchon" % "2.1.4-04042a",
  "org.scalablytyped" %%% "std" % "3.3-0ec965",
  "org.scalablytyped" %%% "sxml" % "1.0.3-f70d8f",
  "org.scalablytyped" %%% "tstl" % "2.1.1-333b86",
  "org.scalablytyped" %%% "url-variables" % "1.0.2-957e16",
  "org.scalablytyped" %%% "websocket" % "0.0-unknown-dt-20180823Z-4a2883")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        