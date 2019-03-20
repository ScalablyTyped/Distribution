organization := "org.scalablytyped"
name := "react-json-view"
version := "1.19.1-62345e"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "csstype" % "2.6.3-29f798",
  "org.scalablytyped" %%% "fbemitter" % "2.0.0-dt-20180315Z-3b29b3",
  "org.scalablytyped" %%% "flux" % "3.1-dt-20180803Z-35d86f",
  "org.scalablytyped" %%% "node" % "11.11-dt-20190319Z-4635bc",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190226Z-f878d0",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190314Z-6f0f1a",
  "org.scalablytyped" %%% "react-dom" % "16.8-dt-20190213Z-430451",
  "org.scalablytyped" %%% "react-lifecycles-compat" % "3.0-dt-20190116Z-10a570",
  "org.scalablytyped" %%% "react-textarea-autosize" % "4.3.0-dt-20180806Z-9d9953",
  "org.scalablytyped" %%% "std" % "3.3-ec2942")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        