organization := "org.scalablytyped"
name := "realm"
version := "2.21.1-9d831d"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "caseless" % "0.12-dt-20180910Z-4e4989",
  "org.scalablytyped" %%% "command-line-args" % "5.0-dt-20180910Z-e30d30",
  "org.scalablytyped" %%% "decompress" % "4.2-dt-20180910Z-fe8232",
  "org.scalablytyped" %%% "deepmerge" % "3.0.0-b7a925",
  "org.scalablytyped" %%% "form-data" % "2.2-dt-20181120Z-a7959e",
  "org.scalablytyped" %%% "fs-extra" % "5.0-dt-20180910Z-f3b2ad",
  "org.scalablytyped" %%% "ini" % "v1.3.3-dt-20181129Z-251b37",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181213Z-bd3349",
  "org.scalablytyped" %%% "node-fetch" % "2.1-dt-20181120Z-4dc81b",
  "org.scalablytyped" %%% "node-machine-id" % "1.1.10-714ec8",
  "org.scalablytyped" %%% "progress" % "v2.0.0-dt-20181211Z-f0466a",
  "org.scalablytyped" %%% "prop-types" % "15.5-dt-20181212Z-7481e3",
  "org.scalablytyped" %%% "request" % "2.48-dt-20181105Z-0007d0",
  "org.scalablytyped" %%% "std" % "3.2.2-04ea79",
  "org.scalablytyped" %%% "tough-cookie" % "2.3-dt-20181104Z-ecb515",
  "org.scalablytyped" %%% "url-parse" % "1.4-dt-20180910Z-fa2b26")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        