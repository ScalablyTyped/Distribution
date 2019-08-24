organization := "org.scalablytyped"
name := "react-map-gl"
version := "5.0-dt-20190619Z-64b47f"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "csstype" % "2.6.6-c240ab",
  "org.scalablytyped" %%% "geojson" % "7946.0-dt-20190319Z-84cce8",
  "org.scalablytyped" %%% "gl-matrix" % "2.4-dt-20190322Z-eff79d",
  "org.scalablytyped" %%% "mapbox-gl" % "v0.54.0-dt-20190823Z-2f5536",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190417Z-f929bc",
  "org.scalablytyped" %%% "react" % "16.9-dt-20190815Z-847c1a",
  "org.scalablytyped" %%% "std" % "3.5-cd493c",
  "org.scalablytyped" %%% "viewport-mercator-project" % "6.1-dt-20190313Z-3d6b35")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        