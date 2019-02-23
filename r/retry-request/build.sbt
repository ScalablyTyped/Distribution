organization := "org.scalablytyped"
name := "retry-request"
version := "4.0.0-30b89c"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "caseless" % "0.12-dt-20180214Z-bde245",
  "org.scalablytyped" %%% "form-data" % "2.2-dt-20181119Z-28155d",
  "org.scalablytyped" %%% "node" % "11.9-dt-20190215Z-604ea6",
  "org.scalablytyped" %%% "request" % "2.48-dt-20190117Z-c8dda0",
  "org.scalablytyped" %%% "std" % "3.3-0ec965",
  "org.scalablytyped" %%% "through2" % "2.0-dt-20180906Z-bafec4",
  "org.scalablytyped" %%% "tough-cookie" % "2.3-dt-20190117Z-9af261")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        