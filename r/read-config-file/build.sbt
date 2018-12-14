organization := "org.scalablytyped"
name := "read-config-file"
version := "3.2.0-aa9bf9"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "ajv" % "6.6.1-5904fe",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20181214Z-21934a",
  "org.scalablytyped" %%% "bluebird-lst" % "1.0.6-28c29e",
  "org.scalablytyped" %%% "dotenv" % "6.1-dt-20181109Z-897c8b",
  "org.scalablytyped" %%% "dotenv-expand" % "4.2.0-a42b6d",
  "org.scalablytyped" %%% "fast-deep-equal" % "2.0.1-55b1a8",
  "org.scalablytyped" %%% "fs-extra" % "5.0-dt-20180910Z-624f1c",
  "org.scalablytyped" %%% "fs-extra-p" % "7.0.0-b30a1d",
  "org.scalablytyped" %%% "js-yaml" % "3.11-dt-20180910Z-816787",
  "org.scalablytyped" %%% "json5" % "0.0-unknown-dt-20180910Z-d92217",
  "org.scalablytyped" %%% "lazy-val" % "1.0.3-06d10e",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181214Z-702cdc",
  "org.scalablytyped" %%% "punycode" % "2.1-dt-20181208Z-06df8d",
  "org.scalablytyped" %%% "std" % "3.2.2-beaa2f",
  "org.scalablytyped" %%% "uri-js" % "4.2.2-535255")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        