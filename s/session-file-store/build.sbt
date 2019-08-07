organization := "org.scalablytyped"
name := "session-file-store"
version := "1.2-dt-20180214Z-70ff86"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20180425Z-e3bdb7",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20190322Z-515b96",
  "org.scalablytyped" %%% "express" % "4.17-dt-20190604Z-364f17",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20190717Z-78fca5",
  "org.scalablytyped" %%% "express-session" % "1.15-dt-20190619Z-bb5065",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-85a68c",
  "org.scalablytyped" %%% "node" % "12.7-dt-20190806Z-18826b",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-223eff",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190322Z-3dc604",
  "org.scalablytyped" %%% "std" % "3.5-65dbfc")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        