organization := "org.scalablytyped"
name := "react-router-navigation"
version := "1.0-dt-20190212Z-cbd753"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "csstype" % "2.6.6-f980df",
  "org.scalablytyped" %%% "history" % "4.7.2-dt-20190822Z-c13957",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190417Z-fd4af0",
  "org.scalablytyped" %%% "react" % "16.9-dt-20190815Z-6dcbc8",
  "org.scalablytyped" %%% "react-native" % "0.60-dt-20190902Z-b1ede5",
  "org.scalablytyped" %%% "react-navigation" % "3.0-dt-20190805Z-c93af2",
  "org.scalablytyped" %%% "react-router" % "5.0-dt-20190702Z-8dee85",
  "org.scalablytyped" %%% "react-router-navigation-core" % "1.0-dt-20181017Z-c86122",
  "org.scalablytyped" %%% "std" % "3.6-c16502")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        