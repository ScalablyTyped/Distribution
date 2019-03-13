organization := "org.scalablytyped"
name := "react-router-navigation"
version := "1.0-dt-20190212Z-569123"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "csstype" % "2.6.3-9f8404",
  "org.scalablytyped" %%% "history" % "4.7.2-dt-20190226Z-61c40c",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190226Z-f878d0",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190312Z-24375e",
  "org.scalablytyped" %%% "react-native" % "0.57-dt-20190312Z-652784",
  "org.scalablytyped" %%% "react-navigation" % "3.0-dt-20190305Z-224dcf",
  "org.scalablytyped" %%% "react-router" % "4.4-dt-20190228Z-436fde",
  "org.scalablytyped" %%% "react-router-navigation-core" % "1.0-dt-20181017Z-a8f386",
  "org.scalablytyped" %%% "std" % "3.3-ec2942")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        