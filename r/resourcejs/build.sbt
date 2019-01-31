organization := "org.scalablytyped"
name := "resourcejs"
version := "1.9-dt-20180214Z-86394b"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20180425Z-b38537",
  "org.scalablytyped" %%% "bson" % "1.0.6-dt-20180721Z-a650f4",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20180417Z-c7658c",
  "org.scalablytyped" %%% "express" % "4.16-dt-20190122Z-02bf23",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20190122Z-7910af",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20180214Z-2342ad",
  "org.scalablytyped" %%% "mongodb" % "v3.1-dt-20190110Z-817064",
  "org.scalablytyped" %%% "mongoose" % "5.3.4-dt-20190130Z-7231e8",
  "org.scalablytyped" %%% "node" % "10.12-dt-20190129Z-40209e",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-a57469",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20180428Z-195cb6",
  "org.scalablytyped" %%% "std" % "3.2.4-2926f1")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        