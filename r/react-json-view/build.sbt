organization := "org.scalablytyped"
name := "react-json-view"
version := "1.19.1-716e63"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "csstype" % "2.6.2-522be0",
  "org.scalablytyped" %%% "fbemitter" % "2.0.0-dt-20180315Z-52c3c5",
  "org.scalablytyped" %%% "flux" % "3.1-dt-20180803Z-ade0a7",
  "org.scalablytyped" %%% "node" % "10.12-dt-20190129Z-7cfc00",
  "org.scalablytyped" %%% "prop-types" % "15.5-dt-20181212Z-8cdf18",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190201Z-f7085e",
  "org.scalablytyped" %%% "react-dom" % "16.0-dt-20181127Z-830073",
  "org.scalablytyped" %%% "react-lifecycles-compat" % "3.0-dt-20190116Z-fdc198",
  "org.scalablytyped" %%% "react-textarea-autosize" % "4.3.0-dt-20180806Z-75bce2",
  "org.scalablytyped" %%% "std" % "3.3-0ec965")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        