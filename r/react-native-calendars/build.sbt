organization := "org.scalablytyped"
name := "react-native-calendars"
version := "1.20-dt-20190627Z-9d0581"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "csstype" % "2.6.6-ffacbb",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190924Z-05a52c",
  "org.scalablytyped" %%% "react" % "16.9-dt-20200122Z-b17eee",
  "org.scalablytyped" %%% "react-native" % "0.61-dt-20200214Z-8d1cb4",
  "org.scalablytyped" %%% "std" % "3.7-1b8369",
  "org.scalablytyped" %%% "xdate" % "0.8-dt-20190322Z-0a678e")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
