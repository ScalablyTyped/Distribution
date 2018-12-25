organization := "org.scalablytyped"
name := "react-virtual-keyboard"
version := "1.0-dt-20180806Z-315f58"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "csstype" % "2.5.8-28635b",
  "org.scalablytyped" %%% "jquery" % "3.3-dt-20181219Z-c4ac04",
  "org.scalablytyped" %%% "prop-types" % "15.5-dt-20181212Z-3109dd",
  "org.scalablytyped" %%% "react" % "16.7-dt-20181220Z-b38950",
  "org.scalablytyped" %%% "sizzle" % "2.3-dt-20181006Z-3a6abd",
  "org.scalablytyped" %%% "std" % "3.2.2-669a73",
  "org.scalablytyped" %%% "virtual-keyboard" % "1.26-dt-20180214Z-c254b0")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        