organization := "org.scalablytyped"
name := "react-router-navigation"
version := "1.0-dt-20181017Z-fb6874"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "csstype" % "2.6.2-522be0",
  "org.scalablytyped" %%% "history" % "4.7.2-dt-20181017Z-bd3077",
  "org.scalablytyped" %%% "prop-types" % "15.5-dt-20181212Z-8cdf18",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190206Z-d66e8f",
  "org.scalablytyped" %%% "react-native" % "0.57-dt-20190211Z-df1f7f",
  "org.scalablytyped" %%% "react-navigation" % "3.0-dt-20181219Z-17b59d",
  "org.scalablytyped" %%% "react-router" % "4.4-dt-20190103Z-28d5ae",
  "org.scalablytyped" %%% "react-router-navigation-core" % "1.0-dt-20181017Z-6e8260",
  "org.scalablytyped" %%% "std" % "3.3-0ec965")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        