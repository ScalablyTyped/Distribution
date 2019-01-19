organization := "org.scalablytyped"
name := "react-router-navigation"
version := "1.0-dt-20181017Z-b477c1"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "csstype" % "2.5.8-36deb1",
  "org.scalablytyped" %%% "history" % "4.7.2-dt-20181017Z-ee6730",
  "org.scalablytyped" %%% "prop-types" % "15.5-dt-20181212Z-e51e1e",
  "org.scalablytyped" %%% "react" % "16.7-dt-20190116Z-73addc",
  "org.scalablytyped" %%% "react-native" % "0.57-dt-20190115Z-c293a8",
  "org.scalablytyped" %%% "react-navigation" % "3.0-dt-20181219Z-f9df8a",
  "org.scalablytyped" %%% "react-router" % "4.4-dt-20190103Z-2e3673",
  "org.scalablytyped" %%% "react-router-navigation-core" % "1.0-dt-20181017Z-cb52d6",
  "org.scalablytyped" %%% "std" % "3.2.4-2926f1")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        