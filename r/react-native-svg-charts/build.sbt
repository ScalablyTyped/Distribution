organization := "org.scalablytyped"
name := "react-native-svg-charts"
version := "5.0-dt-20201104Z-3f8752"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.0",
  "org.scalablytyped" %%% "csstype" % "2.6.14-b4f267",
  "org.scalablytyped" %%% "d3-path" % "2.0-dt-20201002Z-f8c6f6",
  "org.scalablytyped" %%% "d3-scale" % "3.2-dt-20201104Z-3567e5",
  "org.scalablytyped" %%% "d3-shape" % "2.0-dt-20201028Z-44996d",
  "org.scalablytyped" %%% "d3-time" % "2.0-dt-20201002Z-9a0554",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20200515Z-7dc507",
  "org.scalablytyped" %%% "react" % "17.0-dt-20201121Z-9253ae",
  "org.scalablytyped" %%% "react-native" % "0.63-dt-20201120Z-b3b69c",
  "org.scalablytyped" %%% "react-native-svg" % "12.1.0-ead4bc",
  "org.scalablytyped" %%% "std" % "4.1-40053c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
