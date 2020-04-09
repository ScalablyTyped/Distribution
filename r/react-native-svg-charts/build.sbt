organization := "org.scalablytyped"
name := "react-native-svg-charts"
version := "5.0-dt-20200225Z-cd5015"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "csstype" % "2.6.9-2d2033",
  "org.scalablytyped" %%% "d3-path" % "1.0-dt-20190212Z-ab650c",
  "org.scalablytyped" %%% "d3-scale" % "2.2-dt-20200305Z-d830ae",
  "org.scalablytyped" %%% "d3-shape" % "1.3-dt-20200225Z-a31c9d",
  "org.scalablytyped" %%% "d3-time" % "1.0-dt-20190212Z-47ca5e",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190924Z-ece683",
  "org.scalablytyped" %%% "react" % "16.9-dt-20200402Z-6f4338",
  "org.scalablytyped" %%% "react-native" % "0.62-dt-20200407Z-401c8f",
  "org.scalablytyped" %%% "react-native-svg" % "11.0.1-0b8670",
  "org.scalablytyped" %%% "std" % "3.8-a0108c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
