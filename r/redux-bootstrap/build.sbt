organization := "org.scalablytyped"
name := "redux-bootstrap"
version := "1.3.0-8bc32b"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "csstype" % "2.6.3-9dec0a",
  "org.scalablytyped" %%% "history" % "4.7.2-dt-20190322Z-d9c94d",
  "org.scalablytyped" %%% "hoist-non-react-statics" % "3.3-dt-20190304Z-f5f764",
  "org.scalablytyped" %%% "immutable" % "4.0.0-rc.12-720e71",
  "org.scalablytyped" %%% "node" % "11.11-dt-20190325Z-000e7b",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190226Z-1549d2",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190322Z-acd0bd",
  "org.scalablytyped" %%% "react-dom" % "16.8-dt-20190322Z-84fa90",
  "org.scalablytyped" %%% "react-redux" % "7.0-dt-20190318Z-c7b49f",
  "org.scalablytyped" %%% "react-router" % "4.4-dt-20190228Z-6dd31f",
  "org.scalablytyped" %%% "react-router-redux" % "5.0-dt-20190212Z-a1be7c",
  "org.scalablytyped" %%% "redux" % "4.0.1-436f26",
  "org.scalablytyped" %%% "redux-immutable" % "v4.0.0-dt-20190322Z-05abcc",
  "org.scalablytyped" %%% "reselect" % "4.0.0-2ffe21",
  "org.scalablytyped" %%% "std" % "3.3-14e863",
  "org.scalablytyped" %%% "symbol-observable" % "1.2.0-1f290b")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        