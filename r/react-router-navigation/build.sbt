organization := "org.scalablytyped"
name := "react-router-navigation"
version := "1.0-dt-20190212Z-706a4a"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "csstype" % "2.6.6-f01b27",
  "org.scalablytyped" %%% "history" % "4.7.2-dt-20190322Z-404965",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190417Z-f929bc",
  "org.scalablytyped" %%% "react" % "16.9-dt-20190815Z-93079a",
  "org.scalablytyped" %%% "react-native" % "0.60-dt-20190819Z-b760a5",
  "org.scalablytyped" %%% "react-navigation" % "3.0-dt-20190805Z-11267e",
  "org.scalablytyped" %%% "react-router" % "5.0-dt-20190702Z-30f88e",
  "org.scalablytyped" %%% "react-router-navigation-core" % "1.0-dt-20181017Z-78fe8b",
  "org.scalablytyped" %%% "std" % "3.5-cd493c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        