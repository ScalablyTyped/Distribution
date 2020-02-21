organization := "org.scalablytyped"
name := "restify-cors-middleware"
version := "1.0-dt-20180214Z-d7482b"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "bunyan" % "1.8-dt-20190311Z-7d7d13",
  "org.scalablytyped" %%% "formidable" % "1.0.16-dt-20190322Z-2adee2",
  "org.scalablytyped" %%% "node" % "13.7-dt-20200211Z-d6af7e",
  "org.scalablytyped" %%% "restify" % "8.4-dt-20191119Z-1b7e80",
  "org.scalablytyped" %%% "spdy" % "3.4-dt-20181121Z-7137d4",
  "org.scalablytyped" %%% "std" % "3.7-1b8369")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
