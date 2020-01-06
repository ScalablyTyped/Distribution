organization := "org.scalablytyped"
name := "react-map-gl"
version := "5.1-dt-20200102Z-98d55a"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "csstype" % "2.6.6-fd5644",
  "org.scalablytyped" %%% "geojson" % "7946.0-dt-20190925Z-871c5b",
  "org.scalablytyped" %%% "gl-matrix" % "2.4-dt-20190322Z-4beeed",
  "org.scalablytyped" %%% "mapbox-gl" % "1.6-dt-20191213Z-f9247c",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190924Z-b24434",
  "org.scalablytyped" %%% "react" % "16.9-dt-20191220Z-22d23f",
  "org.scalablytyped" %%% "std" % "3.7-b6d959",
  "org.scalablytyped" %%% "viewport-mercator-project" % "6.1-dt-20190313Z-631747")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        