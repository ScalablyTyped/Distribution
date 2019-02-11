organization := "org.scalablytyped"
name := "react-json-view"
version := "1.19.1-33dca0"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "csstype" % "2.6.2-522be0",
  "org.scalablytyped" %%% "fbemitter" % "2.0.0-dt-20180315Z-52c3c5",
  "org.scalablytyped" %%% "flux" % "3.1-dt-20180803Z-2e40d9",
  "org.scalablytyped" %%% "node" % "10.12-dt-20190206Z-3468e4",
  "org.scalablytyped" %%% "prop-types" % "15.5-dt-20181212Z-8cdf18",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190206Z-d66e8f",
  "org.scalablytyped" %%% "react-dom" % "16.8-dt-20190206Z-1163ea",
  "org.scalablytyped" %%% "react-lifecycles-compat" % "3.0-dt-20190116Z-9b947d",
  "org.scalablytyped" %%% "react-textarea-autosize" % "4.3.0-dt-20180806Z-8e88ba",
  "org.scalablytyped" %%% "std" % "3.3-0ec965")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        