organization := "org.scalablytyped"
name := "shpjs"
version := "3.4-dt-20181119Z-a4be12"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "geojson" % "7946.0-dt-20190319Z-854a0c",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190606Z-b7fe68",
  "org.scalablytyped" %%% "std" % "3.5-f010ac")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        