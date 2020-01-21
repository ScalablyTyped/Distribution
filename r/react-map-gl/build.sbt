organization := "org.scalablytyped"
name := "react-map-gl"
version := "5.1-dt-20200117Z-2b0cca"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "csstype" % "2.6.6-dcd929",
  "org.scalablytyped" %%% "geojson" % "7946.0-dt-20190925Z-718f2b",
  "org.scalablytyped" %%% "gl-matrix" % "2.4-dt-20190322Z-849da3",
  "org.scalablytyped" %%% "mapbox-gl" % "1.6-dt-20200116Z-e4929f",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190924Z-78233f",
  "org.scalablytyped" %%% "react" % "16.9-dt-20191220Z-0e1ae9",
  "org.scalablytyped" %%% "std" % "3.7-96076c",
  "org.scalablytyped" %%% "viewport-mercator-project" % "6.1-dt-20190313Z-0ff0e2")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        