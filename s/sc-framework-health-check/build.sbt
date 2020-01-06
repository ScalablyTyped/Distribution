organization := "org.scalablytyped"
name := "sc-framework-health-check"
version := "2.0-dt-20181218Z-211e28"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20190819Z-23cf38",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20191217Z-003b73",
  "org.scalablytyped" %%% "express" % "4.17-dt-20191101Z-e86cd1",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.17-dt-20191220Z-f5dd1c",
  "org.scalablytyped" %%% "jsonwebtoken" % "8.3-dt-20191015Z-802145",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20191126Z-e32d86",
  "org.scalablytyped" %%% "node" % "13.1-dt-20200103Z-b9f880",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-166e61",
  "org.scalablytyped" %%% "sc-auth" % "5.0-dt-20181130Z-639002",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190819Z-454481",
  "org.scalablytyped" %%% "socketcluster" % "14.0-dt-20191126Z-ae997b",
  "org.scalablytyped" %%% "std" % "3.7-b6d959")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        