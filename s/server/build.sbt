organization := "org.scalablytyped"
name := "server"
version := "1.0-dt-20191126Z-04ea70"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20190819Z-b0b0d9",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20191217Z-f02e41",
  "org.scalablytyped" %%% "csurf" % "1.9.0-dt-20191022Z-4e5053",
  "org.scalablytyped" %%% "express" % "4.17-dt-20191101Z-92e6db",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.17-dt-20191220Z-1ddd6d",
  "org.scalablytyped" %%% "express-session" % "1.15-dt-20191118Z-4258a7",
  "org.scalablytyped" %%% "formidable" % "1.0.16-dt-20190322Z-6c7504",
  "org.scalablytyped" %%% "helmet" % "0.0-unknown-dt-20191029Z-7da5b9",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20191126Z-d3b7b2",
  "org.scalablytyped" %%% "node" % "13.1-dt-20191226Z-155d58",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-a681e2",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190819Z-a1ed43",
  "org.scalablytyped" %%% "std" % "3.7-953338")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        