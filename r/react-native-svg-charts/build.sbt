organization := "org.scalablytyped"
name := "react-native-svg-charts"
version := "5.0-dt-20200515Z-e64d7f"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "csstype" % "2.6.9-03f85a",
  "org.scalablytyped" %%% "d3-path" % "1.0-dt-20200515Z-80eb11",
  "org.scalablytyped" %%% "d3-scale" % "2.2-dt-20200515Z-926a7d",
  "org.scalablytyped" %%% "d3-shape" % "1.3-dt-20200515Z-788163",
  "org.scalablytyped" %%% "d3-time" % "1.0-dt-20200515Z-8b0cdd",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20200515Z-4fb81d",
  "org.scalablytyped" %%% "react" % "16.9-dt-20200515Z-0f8114",
  "org.scalablytyped" %%% "react-native" % "0.62-dt-20200515Z-139570",
  "org.scalablytyped" %%% "react-native-svg" % "11.0.1-b1007f",
  "org.scalablytyped" %%% "std" % "3.9-18cbeb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
