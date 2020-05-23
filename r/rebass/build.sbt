organization := "org.scalablytyped"
name := "rebass"
version := "4.0-dt-20200514Z-2b0d87"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "csstype" % "2.6.9-03f85a",
  "org.scalablytyped" %%% "hoist-non-react-statics" % "3.3-dt-20190402Z-25ab82",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20200515Z-4fb81d",
  "org.scalablytyped" %%% "react" % "16.9-dt-20200515Z-0f8114",
  "org.scalablytyped" %%% "react-native" % "0.62-dt-20200515Z-139570",
  "org.scalablytyped" %%% "std" % "3.9-18cbeb",
  "org.scalablytyped" %%% "styled-components" % "5.1-dt-20200515Z-cc0cc0",
  "org.scalablytyped" %%% "styled-system" % "5.1-dt-20200309Z-951f62",
  "org.scalablytyped" %%% "styled-system__css" % "5.0-dt-20200515Z-2cbffd")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
