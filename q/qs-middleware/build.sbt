organization := "org.scalablytyped"
name := "qs-middleware"
version := "1.0-dt-20190819Z-a2c78b"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20190819Z-d915df",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20190322Z-6c5fc3",
  "org.scalablytyped" %%% "express" % "4.17-dt-20190819Z-84e4a5",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20191015Z-847ee7",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-8e1e66",
  "org.scalablytyped" %%% "node" % "12.11-dt-20191022Z-f18ffd",
  "org.scalablytyped" %%% "qs" % "6.5-dt-20190409Z-01d7b9",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-c44ea2",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190819Z-0ea21e",
  "org.scalablytyped" %%% "std" % "3.6-b80e7a")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        