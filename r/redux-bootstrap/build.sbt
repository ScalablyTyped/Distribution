organization := "org.scalablytyped"
name := "redux-bootstrap"
version := "1.3.0-a42c38"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "csstype" % "2.6.3-60f3ea",
  "org.scalablytyped" %%% "history" % "4.7.2-dt-20190226Z-e317ff",
  "org.scalablytyped" %%% "immutable" % "4.0.0-rc.12-8a518d",
  "org.scalablytyped" %%% "node" % "11.10-dt-20190228Z-fd0a52",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190226Z-0b0b5e",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190226Z-f7f3c1",
  "org.scalablytyped" %%% "react-dom" % "16.8-dt-20190213Z-502e31",
  "org.scalablytyped" %%% "react-redux" % "7.0-dt-20190124Z-063f96",
  "org.scalablytyped" %%% "react-router" % "4.4-dt-20190212Z-33c2a4",
  "org.scalablytyped" %%% "react-router-redux" % "5.0-dt-20190212Z-f816bb",
  "org.scalablytyped" %%% "redux" % "4.0.1-03a2e6",
  "org.scalablytyped" %%% "redux-immutable" % "v4.0.0-dt-20190124Z-256d1d",
  "org.scalablytyped" %%% "reselect" % "4.0.0-0f457f",
  "org.scalablytyped" %%% "std" % "3.3-05be79",
  "org.scalablytyped" %%% "symbol-observable" % "1.2.0-bfac6c")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        