organization := "org.scalablytyped"
name := "restify-cors-middleware"
version := "1.0-dt-20180214Z-09510a"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "bunyan" % "1.8-dt-20200226Z-2bfcf6",
  "org.scalablytyped" %%% "formidable" % "1.0.16-dt-20200225Z-8a5756",
  "org.scalablytyped" %%% "node" % "13.13-dt-20200417Z-f3d81d",
  "org.scalablytyped" %%% "restify" % "8.4-dt-20200225Z-34ccd1",
  "org.scalablytyped" %%% "spdy" % "3.4-dt-20200227Z-03d70f",
  "org.scalablytyped" %%% "std" % "3.8-9b2470")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
