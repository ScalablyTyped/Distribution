organization := "org.scalablytyped"
name := "redux-bootstrap"
version := "1.3.0-9ddacd"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "csstype" % "2.6.3-29f798",
  "org.scalablytyped" %%% "history" % "4.7.2-dt-20190226Z-61c40c",
  "org.scalablytyped" %%% "hoist-non-react-statics" % "3.3-dt-20190304Z-b5b495",
  "org.scalablytyped" %%% "immutable" % "4.0.0-rc.12-39169f",
  "org.scalablytyped" %%% "node" % "11.11-dt-20190319Z-4635bc",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190226Z-f878d0",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190314Z-6f0f1a",
  "org.scalablytyped" %%% "react-dom" % "16.8-dt-20190320Z-188abf",
  "org.scalablytyped" %%% "react-redux" % "7.0-dt-20190318Z-be2f73",
  "org.scalablytyped" %%% "react-router" % "4.4-dt-20190228Z-0ab6c6",
  "org.scalablytyped" %%% "react-router-redux" % "5.0-dt-20190212Z-895598",
  "org.scalablytyped" %%% "redux" % "4.0.1-18f3a8",
  "org.scalablytyped" %%% "redux-immutable" % "v4.0.0-dt-20190124Z-a1070c",
  "org.scalablytyped" %%% "reselect" % "4.0.0-be7d69",
  "org.scalablytyped" %%% "std" % "3.3-ec2942",
  "org.scalablytyped" %%% "symbol-observable" % "1.2.0-5b665c")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        