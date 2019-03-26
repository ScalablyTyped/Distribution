organization := "org.scalablytyped"
name := "snazzy-info-window"
version := "1.1-dt-20190306Z-2d85fd"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "googlemaps" % "3.30-dt-20190322Z-001207",
  "org.scalablytyped" %%% "handlebars" % "4.1.1-e49c7d",
  "org.scalablytyped" %%% "optimist" % "0.0-unknown-dt-20190322Z-66e386",
  "org.scalablytyped" %%% "source-map" % "0.7.3-aac742",
  "org.scalablytyped" %%% "std" % "3.3-14e863")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        