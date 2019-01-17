organization := "org.scalablytyped"
name := "realm"
version := "2.22.0-d62aab"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "caseless" % "0.12-dt-20180214Z-ca4bc1",
  "org.scalablytyped" %%% "command-line-args" % "5.0-dt-20180503Z-9c2317",
  "org.scalablytyped" %%% "decompress" % "4.2-dt-20180610Z-fb7270",
  "org.scalablytyped" %%% "deepmerge" % "3.1.0-627e6b",
  "org.scalablytyped" %%% "form-data" % "2.2-dt-20181119Z-efd843",
  "org.scalablytyped" %%% "fs-extra" % "5.0-dt-20180706Z-95ed7f",
  "org.scalablytyped" %%% "ini" % "v1.3.3-dt-20181121Z-a469f4",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-2be335",
  "org.scalablytyped" %%% "node-fetch" % "2.1-dt-20181119Z-ba4b99",
  "org.scalablytyped" %%% "node-machine-id" % "1.1.10-19e4bf",
  "org.scalablytyped" %%% "progress" % "2.0-dt-20181213Z-d4c14b",
  "org.scalablytyped" %%% "prop-types" % "15.5-dt-20181212Z-692895",
  "org.scalablytyped" %%% "request" % "2.48-dt-20181105Z-d2b9fb",
  "org.scalablytyped" %%% "std" % "3.2.2-2926f1",
  "org.scalablytyped" %%% "tough-cookie" % "2.3-dt-20181015Z-a404a3",
  "org.scalablytyped" %%% "url-parse" % "1.4-dt-20190104Z-1944d8")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        