organization := "org.scalablytyped"
name := "react-router-navigation"
version := "1.0-dt-20190212Z-08fb2d"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "csstype" % "2.6.6-550e52",
  "org.scalablytyped" %%% "history" % "4.7.2-dt-20190822Z-2fbebe",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190924Z-08cc8a",
  "org.scalablytyped" %%% "react" % "16.9-dt-20191003Z-965e98",
  "org.scalablytyped" %%% "react-native" % "0.60-dt-20191007Z-76b392",
  "org.scalablytyped" %%% "react-navigation" % "3.0-dt-20190805Z-ede97d",
  "org.scalablytyped" %%% "react-router" % "5.1-dt-20190930Z-bac3bf",
  "org.scalablytyped" %%% "react-router-navigation-core" % "1.0-dt-20190930Z-4ea2fa",
  "org.scalablytyped" %%% "std" % "3.6-b80e7a")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        