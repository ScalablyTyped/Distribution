organization := "org.scalablytyped"
name := "server"
version := "1.0-dt-20190522Z-843727"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20190819Z-651b1b",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20190322Z-025d27",
  "org.scalablytyped" %%% "csurf" % "1.9.0-dt-20191022Z-6cd0b8",
  "org.scalablytyped" %%% "express" % "4.17-dt-20191101Z-e9b754",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.17-dt-20191115Z-5f40d1",
  "org.scalablytyped" %%% "express-session" % "1.15-dt-20191118Z-c19675",
  "org.scalablytyped" %%% "formidable" % "1.0.16-dt-20190322Z-9e235e",
  "org.scalablytyped" %%% "helmet" % "0.0-unknown-dt-20191029Z-1417bb",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-301fe0",
  "org.scalablytyped" %%% "node" % "12.12-dt-20191119Z-94c257",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-6ebcbf",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190819Z-aab1df",
  "org.scalablytyped" %%% "std" % "3.7-1c17cf")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        