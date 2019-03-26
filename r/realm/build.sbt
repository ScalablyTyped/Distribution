organization := "org.scalablytyped"
name := "realm"
version := "2.25.0-0cb577"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "caseless" % "0.12-dt-20190311Z-bfb77c",
  "org.scalablytyped" %%% "deepmerge" % "3.2.0-76b51b",
  "org.scalablytyped" %%% "form-data" % "2.2-dt-20181119Z-7e85a9",
  "org.scalablytyped" %%% "node" % "11.11-dt-20190325Z-000e7b",
  "org.scalablytyped" %%% "node-fetch" % "2.1-dt-20190319Z-207e80",
  "org.scalablytyped" %%% "node-machine-id" % "1.1.10-73eeff",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190226Z-1549d2",
  "org.scalablytyped" %%% "request" % "2.48-dt-20190117Z-b714b2",
  "org.scalablytyped" %%% "std" % "3.3-14e863",
  "org.scalablytyped" %%% "tough-cookie" % "2.3-dt-20190117Z-a689e5",
  "org.scalablytyped" %%% "url-parse" % "1.4-dt-20190205Z-d041e4")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        