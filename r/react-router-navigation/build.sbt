organization := "org.scalablytyped"
name := "react-router-navigation"
version := "1.0-dt-20190212Z-5a7ceb"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "csstype" % "2.6.2-522be0",
  "org.scalablytyped" %%% "history" % "4.7.2-dt-20181017Z-bd3077",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190226Z-3f7dd7",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190225Z-3dd766",
  "org.scalablytyped" %%% "react-native" % "0.57-dt-20190221Z-4695b7",
  "org.scalablytyped" %%% "react-navigation" % "3.0-dt-20190224Z-3c8287",
  "org.scalablytyped" %%% "react-router" % "4.4-dt-20190212Z-f5daea",
  "org.scalablytyped" %%% "react-router-navigation-core" % "1.0-dt-20181017Z-75e232",
  "org.scalablytyped" %%% "std" % "3.3-0ec965")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        