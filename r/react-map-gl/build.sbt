organization := "org.scalablytyped"
name := "react-map-gl"
version := "5.2-dt-20200218Z-ea15a0"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "csstype" % "2.6.9-2d2033",
  "org.scalablytyped" %%% "geojson" % "7946.0-dt-20190925Z-8ecd0a",
  "org.scalablytyped" %%% "gl-matrix" % "2.4-dt-20200225Z-0d9ae4",
  "org.scalablytyped" %%% "mapbox-gl" % "1.8-dt-20200314Z-e13392",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190924Z-ece683",
  "org.scalablytyped" %%% "react" % "16.9-dt-20200320Z-629467",
  "org.scalablytyped" %%% "std" % "3.8-a0108c",
  "org.scalablytyped" %%% "viewport-mercator-project" % "6.1-dt-20190313Z-4f6d81")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
