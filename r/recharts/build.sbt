organization := "org.scalablytyped"
name := "recharts"
version := "1.1-dt-20190326Z-c1b472"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "csstype" % "2.6.3-908b0a",
  "org.scalablytyped" %%% "d3-path" % "1.0-dt-20190212Z-f6c341",
  "org.scalablytyped" %%% "d3-shape" % "1.3-dt-20190212Z-1e3cff",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190417Z-e0e6aa",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190429Z-aae4f0",
  "org.scalablytyped" %%% "std" % "3.4-495f93")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        