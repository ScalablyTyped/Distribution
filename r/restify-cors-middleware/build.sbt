organization := "org.scalablytyped"
name := "restify-cors-middleware"
version := "1.0-dt-20180214Z-2a0e01"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "bunyan" % "1.8-dt-20190311Z-24f004",
  "org.scalablytyped" %%% "formidable" % "1.0.16-dt-20190322Z-c49bd4",
  "org.scalablytyped" %%% "node" % "12.12-dt-20191210Z-b5c359",
  "org.scalablytyped" %%% "restify" % "8.4-dt-20191119Z-3395f2",
  "org.scalablytyped" %%% "spdy" % "3.4-dt-20181121Z-b951c8",
  "org.scalablytyped" %%% "std" % "3.7-1d724d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        