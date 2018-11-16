organization := "com.scalablytyped"
name := "redux-first-routing"
version := "0.3-dt-20181102Z-f87391"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "history" % "4.7.2-dt-20181102Z-806809",
  "com.scalablytyped" %%% "redux" % "4.0.1-f538df",
  "com.scalablytyped" %%% "std" % "3.1.6-34214f",
  "com.scalablytyped" %%% "symbol-observable" % "1.2.0-998bd5",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        