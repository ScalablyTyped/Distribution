organization := "org.scalablytyped"
name := "sc-framework-health-check"
version := "2.0-dt-20181218Z-74d7af"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20180425Z-723780",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20190322Z-7c6e52",
  "org.scalablytyped" %%% "express" % "4.17-dt-20190604Z-f87cbc",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20190717Z-257a4f",
  "org.scalablytyped" %%% "jsonwebtoken" % "8.3-dt-20190304Z-940956",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-85a68c",
  "org.scalablytyped" %%% "node" % "12.6-dt-20190801Z-3c70c3",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-223eff",
  "org.scalablytyped" %%% "sc-auth" % "5.0-dt-20181130Z-06563d",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190322Z-42b281",
  "org.scalablytyped" %%% "socketcluster" % "14.0-dt-20190212Z-4c13f4",
  "org.scalablytyped" %%% "std" % "3.5-65dbfc")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        