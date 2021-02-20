organization := "org.scalablytyped"
name := "react-three-fiber"
version := "5.3.1-bfc618"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.0",
  "org.scalablytyped" %%% "csstype" % "2.6.14-b4f267",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20200515Z-7dc507",
  "org.scalablytyped" %%% "react" % "17.0-dt-20201121Z-9253ae",
  "org.scalablytyped" %%% "react-native" % "0.63-dt-20201120Z-b3b69c",
  "org.scalablytyped" %%% "react-reconciler" % "0.18-dt-20190109Z-053211",
  "org.scalablytyped" %%% "react-use-measure" % "2.0.3-eb5dec",
  "org.scalablytyped" %%% "std" % "4.1-40053c",
  "org.scalablytyped" %%% "three" % "0.122.0-f7f9ba",
  "org.scalablytyped" %%% "tiny-emitter" % "2.1.0-774731")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
