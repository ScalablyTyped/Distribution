organization := "org.scalablytyped"
name := "rebass"
version := "4.0-dt-20200108Z-5c2b3f"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "csstype" % "2.6.6-dcd929",
  "org.scalablytyped" %%% "hoist-non-react-statics" % "3.3-dt-20190402Z-67e02d",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190924Z-78233f",
  "org.scalablytyped" %%% "react" % "16.9-dt-20191220Z-0e1ae9",
  "org.scalablytyped" %%% "react-native" % "0.61-dt-20200117Z-abf5f4",
  "org.scalablytyped" %%% "std" % "3.7-96076c",
  "org.scalablytyped" %%% "styled-components" % "4.4-dt-20200107Z-c2a003",
  "org.scalablytyped" %%% "styled-system" % "5.1-dt-20191118Z-5f6bc0",
  "org.scalablytyped" %%% "styled-system__css" % "5.0-dt-20191115Z-786b0c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        