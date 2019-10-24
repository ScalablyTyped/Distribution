organization := "org.scalablytyped"
name := "server"
version := "1.0-dt-20190522Z-186fc7"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20190819Z-6b1423",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20190322Z-5c770f",
  "org.scalablytyped" %%% "csurf" % "1.9.0-dt-20191022Z-6acec9",
  "org.scalablytyped" %%% "express" % "4.17-dt-20190819Z-64180e",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20191015Z-8fd375",
  "org.scalablytyped" %%% "express-session" % "1.15-dt-20191017Z-b9aacb",
  "org.scalablytyped" %%% "formidable" % "1.0.16-dt-20190322Z-503461",
  "org.scalablytyped" %%% "helmet" % "0.0-unknown-dt-20190819Z-f172cc",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-8e1e66",
  "org.scalablytyped" %%% "node" % "12.11-dt-20191023Z-ebe9d8",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-c44ea2",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190819Z-827e1a",
  "org.scalablytyped" %%% "std" % "3.6-b80e7a")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        