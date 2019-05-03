organization := "org.scalablytyped"
name := "sc-framework-health-check"
version := "2.0-dt-20181218Z-06b1a3"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20180425Z-babc1e",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20190322Z-db9829",
  "org.scalablytyped" %%% "express" % "4.16-dt-20190122Z-4760bf",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20190429Z-5e3ea9",
  "org.scalablytyped" %%% "jsonwebtoken" % "8.3-dt-20190304Z-aa4650",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-169399",
  "org.scalablytyped" %%% "node" % "11.13-dt-20190502Z-84ec9f",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-acf35f",
  "org.scalablytyped" %%% "sc-auth" % "5.0-dt-20181130Z-55c1a0",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190322Z-a9f802",
  "org.scalablytyped" %%% "socketcluster" % "14.0-dt-20190212Z-592490",
  "org.scalablytyped" %%% "std" % "3.4-8a92b2")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        