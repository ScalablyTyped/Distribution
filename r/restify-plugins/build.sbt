organization := "org.scalablytyped"
name := "restify-plugins"
version := "1.5-dt-20181015Z-a4d91e"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "bunyan" % "1.8-dt-20190311Z-a9a851",
  "org.scalablytyped" %%% "formidable" % "1.0.16-dt-20190322Z-ec0a27",
  "org.scalablytyped" %%% "node" % "12.12-dt-20191126Z-959704",
  "org.scalablytyped" %%% "restify" % "8.4-dt-20191119Z-1659be",
  "org.scalablytyped" %%% "spdy" % "3.4-dt-20181121Z-819067",
  "org.scalablytyped" %%% "std" % "3.7-1d724d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        