organization := "org.scalablytyped"
name := "sc-framework-health-check"
version := "2.0-dt-20181218Z-204cda"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20190819Z-1b4f69",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20191217Z-b60015",
  "org.scalablytyped" %%% "express" % "4.17-dt-20191101Z-56f2e3",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.17-dt-20191220Z-8b81e3",
  "org.scalablytyped" %%% "jsonwebtoken" % "8.3-dt-20200113Z-c73e01",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20191126Z-03061a",
  "org.scalablytyped" %%% "node" % "13.1-dt-20200117Z-4be21b",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-b58a9e",
  "org.scalablytyped" %%% "sc-auth" % "5.0-dt-20181130Z-afb37e",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190819Z-314389",
  "org.scalablytyped" %%% "socketcluster" % "14.0-dt-20191126Z-f4f1bd",
  "org.scalablytyped" %%% "std" % "3.7-96076c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        