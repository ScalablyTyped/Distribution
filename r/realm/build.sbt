organization := "com.scalablytyped"
name := "realm"
version := "2.18.0-33be67"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "caseless" % "0.12-dt-20181102Z-5bb15d",
  "com.scalablytyped" %%% "command-line-args" % "5.0-dt-20181102Z-ef250d",
  "com.scalablytyped" %%% "decompress" % "4.2-dt-20181102Z-1681ce",
  "com.scalablytyped" %%% "deepmerge" % "2.2.1-9c60bf",
  "com.scalablytyped" %%% "form-data" % "2.2-dt-20181116Z-a46e60",
  "com.scalablytyped" %%% "fs-extra" % "5.0-dt-20181102Z-49c518",
  "com.scalablytyped" %%% "ini" % "v1.3.3-dt-20181102Z-12c85a",
  "com.scalablytyped" %%% "node" % "10.12-dt-20181116Z-806eaf",
  "com.scalablytyped" %%% "node-fetch" % "2.1-dt-20181116Z-b7ed5a",
  "com.scalablytyped" %%% "progress" % "v2.0.0-dt-20181102Z-92dac9",
  "com.scalablytyped" %%% "prop-types" % "15.5-dt-20181102Z-3c49da",
  "com.scalablytyped" %%% "request" % "2.48-dt-20181105Z-64050c",
  "com.scalablytyped" %%% "std" % "3.1.6-34214f",
  "com.scalablytyped" %%% "tough-cookie" % "2.3-dt-20181102Z-a43730",
  "com.scalablytyped" %%% "url-parse" % "1.4-dt-20181102Z-868aa3",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        