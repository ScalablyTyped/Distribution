organization := "org.scalablytyped"
name := "rebass"
version := "4.0-dt-20200406Z-e705fb"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "csstype" % "2.6.9-313239",
  "org.scalablytyped" %%% "hoist-non-react-statics" % "3.3-dt-20190402Z-878ffb",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190924Z-11830c",
  "org.scalablytyped" %%% "react" % "16.9-dt-20200409Z-0bc722",
  "org.scalablytyped" %%% "react-native" % "0.62-dt-20200407Z-1131d6",
  "org.scalablytyped" %%% "std" % "3.8-9b2470",
  "org.scalablytyped" %%% "styled-components" % "5.1-dt-20200413Z-c4e584",
  "org.scalablytyped" %%% "styled-system" % "5.1-dt-20200309Z-3ffbb1",
  "org.scalablytyped" %%% "styled-system__css" % "5.0-dt-20200331Z-e6a132")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
