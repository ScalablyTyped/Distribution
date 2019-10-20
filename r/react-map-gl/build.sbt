organization := "org.scalablytyped"
name := "react-map-gl"
version := "5.0-dt-20191003Z-228945"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "csstype" % "2.6.6-550e52",
  "org.scalablytyped" %%% "geojson" % "7946.0-dt-20190925Z-714d92",
  "org.scalablytyped" %%% "gl-matrix" % "2.4-dt-20190322Z-5042cb",
  "org.scalablytyped" %%% "mapbox-gl" % "v0.54.0-dt-20190924Z-89fd6e",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190924Z-08cc8a",
  "org.scalablytyped" %%% "react" % "16.9-dt-20191016Z-462cf8",
  "org.scalablytyped" %%% "std" % "3.6-b80e7a",
  "org.scalablytyped" %%% "viewport-mercator-project" % "6.1-dt-20190313Z-e39fb0")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        