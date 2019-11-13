organization := "org.scalablytyped"
name := "react-map-gl"
version := "5.0-dt-20191003Z-ceb753"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "csstype" % "2.6.6-3eaa6f",
  "org.scalablytyped" %%% "geojson" % "7946.0-dt-20190925Z-a51fd7",
  "org.scalablytyped" %%% "gl-matrix" % "2.4-dt-20190322Z-33a70a",
  "org.scalablytyped" %%% "mapbox-gl" % "1.5-dt-20191112Z-93d0a9",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190924Z-8b44d5",
  "org.scalablytyped" %%% "react" % "16.9-dt-20191025Z-132fef",
  "org.scalablytyped" %%% "std" % "3.7-1c17cf",
  "org.scalablytyped" %%% "viewport-mercator-project" % "6.1-dt-20190313Z-47b8d0")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        