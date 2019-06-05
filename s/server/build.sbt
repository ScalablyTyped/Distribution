organization := "org.scalablytyped"
name := "server"
version := "1.0-dt-20190522Z-f0c388"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20180425Z-8931e7",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20190322Z-85ff12",
  "org.scalablytyped" %%% "csurf" % "1.9.0-dt-20190322Z-947216",
  "org.scalablytyped" %%% "express" % "4.17-dt-20190604Z-1a5daf",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20190524Z-1f48f2",
  "org.scalablytyped" %%% "express-session" % "1.15-dt-20190212Z-406dd5",
  "org.scalablytyped" %%% "formidable" % "1.0.16-dt-20190322Z-892c18",
  "org.scalablytyped" %%% "helmet" % "0.0-unknown-dt-20190322Z-1951a0",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-49fefe",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190530Z-a47442",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-374f35",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190322Z-20ad05",
  "org.scalablytyped" %%% "std" % "3.5-f010ac")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        