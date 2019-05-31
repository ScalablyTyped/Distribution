organization := "org.scalablytyped"
name := "sc-framework-health-check"
version := "2.0-dt-20181218Z-3d5279"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20180425Z-8931e7",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20190322Z-85ff12",
  "org.scalablytyped" %%% "express" % "4.16-dt-20190122Z-ba6df1",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20190524Z-1f48f2",
  "org.scalablytyped" %%% "jsonwebtoken" % "8.3-dt-20190304Z-062f73",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-49fefe",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190530Z-a47442",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-374f35",
  "org.scalablytyped" %%% "sc-auth" % "5.0-dt-20181130Z-c884c2",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190322Z-20ad05",
  "org.scalablytyped" %%% "socketcluster" % "14.0-dt-20190212Z-4272fd",
  "org.scalablytyped" %%% "std" % "3.5-f010ac")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        