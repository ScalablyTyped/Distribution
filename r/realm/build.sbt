organization := "org.scalablytyped"
name := "realm"
version := "2.23.0-8d122d"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "caseless" % "0.12-dt-20180214Z-0334cd",
  "org.scalablytyped" %%% "command-line-args" % "5.0-dt-20180503Z-d21dac",
  "org.scalablytyped" %%% "decompress" % "4.2-dt-20180610Z-474814",
  "org.scalablytyped" %%% "deepmerge" % "3.1.0-11ec61",
  "org.scalablytyped" %%% "form-data" % "2.2-dt-20181119Z-7c0763",
  "org.scalablytyped" %%% "fs-extra" % "5.0-dt-20180706Z-585a5f",
  "org.scalablytyped" %%% "ini" % "v1.3.3-dt-20181121Z-4ce0d5",
  "org.scalablytyped" %%% "node" % "10.12-dt-20190129Z-8da1df",
  "org.scalablytyped" %%% "node-fetch" % "2.1-dt-20190130Z-351386",
  "org.scalablytyped" %%% "node-machine-id" % "1.1.10-8f95d9",
  "org.scalablytyped" %%% "progress" % "2.0-dt-20181213Z-eada3c",
  "org.scalablytyped" %%% "prop-types" % "15.5-dt-20181212Z-d610b9",
  "org.scalablytyped" %%% "request" % "2.48-dt-20190117Z-c301e1",
  "org.scalablytyped" %%% "std" % "3.3.1-6e0314",
  "org.scalablytyped" %%% "tough-cookie" % "2.3-dt-20190117Z-3631a3",
  "org.scalablytyped" %%% "url-parse" % "1.4-dt-20190104Z-4fdf5c")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        