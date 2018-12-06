organization := "org.scalablytyped"
name := "read-config-file"
version := "3.2.0-f84899"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "ajv" % "6.6.1-eb2454",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20180910Z-3eb23e",
  "org.scalablytyped" %%% "bluebird-lst" % "1.0.6-edd0bc",
  "org.scalablytyped" %%% "dotenv" % "6.1-dt-20181109Z-d1e013",
  "org.scalablytyped" %%% "dotenv-expand" % "4.2.0-01c745",
  "org.scalablytyped" %%% "fast-deep-equal" % "2.0.1-3455dd",
  "org.scalablytyped" %%% "fs-extra" % "5.0-dt-20180910Z-2e2a60",
  "org.scalablytyped" %%% "fs-extra-p" % "7.0.0-cc8eb7",
  "org.scalablytyped" %%% "js-yaml" % "3.11-dt-20180910Z-948572",
  "org.scalablytyped" %%% "json5" % "0.0-unknown-dt-20180910Z-49ddfd",
  "org.scalablytyped" %%% "lazy-val" % "1.0.3-c2b0d7",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181203Z-d9c01e",
  "org.scalablytyped" %%% "std" % "3.2.1-edfe2b",
  "org.scalablytyped" %%% "uri-js" % "4.2.2-dbeda5")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        