organization := "org.scalablytyped"
name := "realm"
version := "2.21.0-bc6571"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "caseless" % "0.12-dt-20180910Z-88463f",
  "org.scalablytyped" %%% "command-line-args" % "5.0-dt-20180910Z-348321",
  "org.scalablytyped" %%% "decompress" % "4.2-dt-20180910Z-f6414f",
  "org.scalablytyped" %%% "deepmerge" % "3.0.0-cbfb94",
  "org.scalablytyped" %%% "form-data" % "2.2-dt-20181120Z-961b6c",
  "org.scalablytyped" %%% "fs-extra" % "5.0-dt-20180910Z-2e2a60",
  "org.scalablytyped" %%% "ini" % "v1.3.3-dt-20181129Z-9253c2",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181203Z-d9c01e",
  "org.scalablytyped" %%% "node-fetch" % "2.1-dt-20181120Z-dbcdca",
  "org.scalablytyped" %%% "node-machine-id" % "1.1.10-c9fce7",
  "org.scalablytyped" %%% "progress" % "v2.0.0-dt-20180910Z-c58db2",
  "org.scalablytyped" %%% "prop-types" % "15.5-dt-20181208Z-000ab2",
  "org.scalablytyped" %%% "request" % "2.48-dt-20181105Z-2b1e0f",
  "org.scalablytyped" %%% "std" % "3.2.1-edfe2b",
  "org.scalablytyped" %%% "tough-cookie" % "2.3-dt-20181104Z-171ce9",
  "org.scalablytyped" %%% "url-parse" % "1.4-dt-20180910Z-cc8743")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        