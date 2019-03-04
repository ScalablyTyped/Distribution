organization := "org.scalablytyped"
name := "rc-editor-core"
version := "0.8.9-10e17a"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "classnames" % "2.2-dt-20181230Z-3f1c68",
  "org.scalablytyped" %%% "csstype" % "2.6.2-49af40",
  "org.scalablytyped" %%% "draft-js" % "v0.10.5-dt-20190212Z-fa386c",
  "org.scalablytyped" %%% "immutable" % "4.0.0-rc.12-8a518d",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20190212Z-2e7712",
  "org.scalablytyped" %%% "node" % "11.10-dt-20190228Z-fd0a52",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190226Z-0b0b5e",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190226Z-7328c8",
  "org.scalablytyped" %%% "react-dom" % "16.8-dt-20190213Z-1a5d56",
  "org.scalablytyped" %%% "std" % "3.3-05be79")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        