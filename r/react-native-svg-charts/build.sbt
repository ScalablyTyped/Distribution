organization := "org.scalablytyped"
name := "react-native-svg-charts"
version := "5.0-dt-20181105Z-4e1faa"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "csstype" % "2.6.3-908b0a",
  "org.scalablytyped" %%% "d3-path" % "1.0-dt-20190212Z-f6c341",
  "org.scalablytyped" %%% "d3-scale" % "2.1-dt-20190212Z-079587",
  "org.scalablytyped" %%% "d3-shape" % "1.3-dt-20190212Z-1e3cff",
  "org.scalablytyped" %%% "d3-time" % "1.0-dt-20190212Z-d2c68c",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190417Z-e0e6aa",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190429Z-aae4f0",
  "org.scalablytyped" %%% "react-native" % "0.57-dt-20190429Z-947d92",
  "org.scalablytyped" %%% "react-native-svg" % "9.4.0-0757a8",
  "org.scalablytyped" %%% "std" % "3.4-495f93")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        