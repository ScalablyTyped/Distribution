organization := "com.scalablytyped"
name := "read-config-file"
version := "3.2.0-bccb8c"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "ajv" % "6.6.1-b44699",
  "com.scalablytyped" %%% "bluebird" % "3.5-dt-20180910Z-7bd99a",
  "com.scalablytyped" %%% "bluebird-lst" % "1.0.6-98debd",
  "com.scalablytyped" %%% "dotenv" % "6.1-dt-20181109Z-1140a4",
  "com.scalablytyped" %%% "dotenv-expand" % "4.2.0-daa748",
  "com.scalablytyped" %%% "fast-deep-equal" % "2.0.1-892599",
  "com.scalablytyped" %%% "fs-extra" % "5.0-dt-20180910Z-2537fe",
  "com.scalablytyped" %%% "fs-extra-p" % "7.0.0-b7d992",
  "com.scalablytyped" %%% "js-yaml" % "3.11-dt-20180910Z-2da08f",
  "com.scalablytyped" %%% "json5" % "0.0-unknown-dt-20180910Z-1bb86e",
  "com.scalablytyped" %%% "lazy-val" % "1.0.3-d82200",
  "com.scalablytyped" %%% "node" % "10.12-dt-20181203Z-7004b3",
  "com.scalablytyped" %%% "std" % "3.2.1-4b40fd",
  "com.scalablytyped" %%% "uri-js" % "4.2.2-56439b",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        