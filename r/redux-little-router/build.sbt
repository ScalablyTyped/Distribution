organization := "org.scalablytyped"
name := "redux-little-router"
version := "15.1.2-1c66f8"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "csstype" % "2.5.8-939493",
  "org.scalablytyped" %%% "history" % "4.7.2-dt-20181018Z-7053ae",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20181204Z-93340d",
  "org.scalablytyped" %%% "lodash_dot_assign" % "4.2-dt-20180910Z-b6d8e4",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181214Z-21ad57",
  "org.scalablytyped" %%% "prop-types" % "15.5-dt-20181212Z-7481e3",
  "org.scalablytyped" %%% "query-string" % "6.1-dt-20181013Z-747e0e",
  "org.scalablytyped" %%% "react" % "16.7-dt-20181213Z-296d60",
  "org.scalablytyped" %%% "react-dom" % "16.0-dt-20181122Z-0f3c05",
  "org.scalablytyped" %%% "react-redux" % "6.0-dt-20181208Z-54ca8c",
  "org.scalablytyped" %%% "recompose" % "0.30-dt-20181214Z-da5d3c",
  "org.scalablytyped" %%% "redux" % "4.0.1-7c9b0b",
  "org.scalablytyped" %%% "std" % "3.2.2-04ea79",
  "org.scalablytyped" %%% "symbol-observable" % "1.2.0-343133",
  "org.scalablytyped" %%% "url-pattern" % "1.0.3-3345ba")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        