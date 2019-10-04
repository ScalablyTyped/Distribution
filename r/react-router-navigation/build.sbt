organization := "org.scalablytyped"
name := "react-router-navigation"
version := "1.0-dt-20190212Z-b7c03b"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "csstype" % "2.6.6-f980df",
  "org.scalablytyped" %%% "history" % "4.7.2-dt-20190822Z-c13957",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190924Z-06c3ac",
  "org.scalablytyped" %%% "react" % "16.9-dt-20191003Z-b3917f",
  "org.scalablytyped" %%% "react-native" % "0.60-dt-20190930Z-0fb035",
  "org.scalablytyped" %%% "react-navigation" % "3.0-dt-20190805Z-88cbf6",
  "org.scalablytyped" %%% "react-router" % "5.1-dt-20190930Z-06da54",
  "org.scalablytyped" %%% "react-router-navigation-core" % "1.0-dt-20190930Z-2bcc51",
  "org.scalablytyped" %%% "std" % "3.6-c16502")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        