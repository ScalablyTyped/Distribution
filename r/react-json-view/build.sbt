organization := "org.scalablytyped"
name := "react-json-view"
version := "1.19.1-1d11f0"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "csstype" % "2.6.2-49af40",
  "org.scalablytyped" %%% "fbemitter" % "2.0.0-dt-20180315Z-848fbb",
  "org.scalablytyped" %%% "flux" % "3.1-dt-20180803Z-fb69dd",
  "org.scalablytyped" %%% "node" % "11.10-dt-20190228Z-fd0a52",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190226Z-0b0b5e",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190226Z-7328c8",
  "org.scalablytyped" %%% "react-dom" % "16.8-dt-20190213Z-1a5d56",
  "org.scalablytyped" %%% "react-lifecycles-compat" % "3.0-dt-20190116Z-5d7ac8",
  "org.scalablytyped" %%% "react-textarea-autosize" % "4.3.0-dt-20180806Z-68ad18",
  "org.scalablytyped" %%% "std" % "3.3-05be79")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        