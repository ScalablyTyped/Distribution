organization := "org.scalablytyped"
name := "realm"
version := "2.23.0-3ab56f"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "caseless" % "0.12-dt-20180214Z-bde245",
  "org.scalablytyped" %%% "command-line-args" % "5.0-dt-20180503Z-a2771a",
  "org.scalablytyped" %%% "decompress" % "4.2-dt-20180610Z-e6ff2d",
  "org.scalablytyped" %%% "deepmerge" % "3.2.0-30afb2",
  "org.scalablytyped" %%% "form-data" % "2.2-dt-20181119Z-28155d",
  "org.scalablytyped" %%% "fs-extra" % "5.0-dt-20190212Z-d12a02",
  "org.scalablytyped" %%% "ini" % "v1.3.3-dt-20181121Z-60a0af",
  "org.scalablytyped" %%% "node" % "11.9-dt-20190215Z-604ea6",
  "org.scalablytyped" %%% "node-fetch" % "2.1-dt-20190205Z-4a070f",
  "org.scalablytyped" %%% "node-machine-id" % "1.1.10-a6ed03",
  "org.scalablytyped" %%% "progress" % "2.0-dt-20181213Z-ca662e",
  "org.scalablytyped" %%% "prop-types" % "15.5-dt-20190212Z-8cdf18",
  "org.scalablytyped" %%% "request" % "2.48-dt-20190117Z-c8dda0",
  "org.scalablytyped" %%% "std" % "3.3-0ec965",
  "org.scalablytyped" %%% "tough-cookie" % "2.3-dt-20190117Z-9af261",
  "org.scalablytyped" %%% "url-parse" % "1.4-dt-20190205Z-6320a9")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        