organization := "org.scalablytyped"
name := "redux-little-router"
version := "15.1.2-9a0988"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "csstype" % "2.5.8-b451f0",
  "org.scalablytyped" %%% "history" % "4.7.2-dt-20181018Z-3c1144",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20181204Z-e3741e",
  "org.scalablytyped" %%% "lodash_dot_assign" % "4.2-dt-20180910Z-e9f001",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181203Z-646a31",
  "org.scalablytyped" %%% "prop-types" % "15.5-dt-20181208Z-87c4ee",
  "org.scalablytyped" %%% "query-string" % "6.1-dt-20181013Z-982b7b",
  "org.scalablytyped" %%% "react" % "16.7-dt-20181203Z-d83ef6",
  "org.scalablytyped" %%% "react-dom" % "16.0-dt-20181122Z-d04ae5",
  "org.scalablytyped" %%% "react-redux" % "6.0-dt-20181208Z-bf27c3",
  "org.scalablytyped" %%% "recompose" % "0.30-dt-20181120Z-4dd8bf",
  "org.scalablytyped" %%% "redux" % "4.0.1-580107",
  "org.scalablytyped" %%% "std" % "3.2.2-edfe2b",
  "org.scalablytyped" %%% "symbol-observable" % "1.2.0-e3ebb0",
  "org.scalablytyped" %%% "url-pattern" % "1.0.3-b6316c")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        