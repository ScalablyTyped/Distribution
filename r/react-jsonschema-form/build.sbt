organization := "org.scalablytyped"
name := "react-jsonschema-form"
version := "1.0.1-dt-20181129Z-77f2c4"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "csstype" % "2.5.8-bb2c56",
  "org.scalablytyped" %%% "json-schema" % "7.0-dt-20180920Z-016b8b",
  "org.scalablytyped" %%% "prop-types" % "15.5-dt-20181208Z-000ab2",
  "org.scalablytyped" %%% "react" % "16.7-dt-20181203Z-1b8e7c",
  "org.scalablytyped" %%% "std" % "3.2.1-edfe2b")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        