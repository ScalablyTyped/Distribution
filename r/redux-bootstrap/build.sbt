organization := "com.scalablytyped"
name := "redux-bootstrap"
version := "1.3.0-9ad634"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "csstype" % "2.5.7-eccde3",
  "com.scalablytyped" %%% "events" % "1.2-dt-20180910Z-abe6d1",
  "com.scalablytyped" %%% "history" % "4.7.2-dt-20181018Z-c0d74d",
  "com.scalablytyped" %%% "immutable" % "3.8.2-2cc47a",
  "com.scalablytyped" %%% "node" % "10.12-dt-20181121Z-913134",
  "com.scalablytyped" %%% "prop-types" % "15.5-dt-20180927Z-7b533e",
  "com.scalablytyped" %%% "react" % "16.7-dt-20181122Z-2ddd12",
  "com.scalablytyped" %%% "react-dom" % "16.0-dt-20181122Z-3c408d",
  "com.scalablytyped" %%% "react-redux" % "6.0-dt-20181121Z-bf3be2",
  "com.scalablytyped" %%% "react-router" % "4.4-dt-20181109Z-1ad10b",
  "com.scalablytyped" %%% "react-router-redux" % "5.0-dt-20180915Z-dbfe40",
  "com.scalablytyped" %%% "redux" % "4.0.1-d3681d",
  "com.scalablytyped" %%% "redux-immutable" % "v4.0.0-dt-20181009Z-57b659",
  "com.scalablytyped" %%% "reselect" % "4.0.0-c2ed2f",
  "com.scalablytyped" %%% "std" % "3.1.3-0b55f4",
  "com.scalablytyped" %%% "symbol-observable" % "1.2.0-e6336c",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        