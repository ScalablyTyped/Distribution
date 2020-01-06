organization := "org.scalablytyped"
name := "restify-plugins"
version := "1.5-dt-20181015Z-80fc55"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "bunyan" % "1.8-dt-20190311Z-bbdab0",
  "org.scalablytyped" %%% "formidable" % "1.0.16-dt-20190322Z-297afc",
  "org.scalablytyped" %%% "node" % "13.1-dt-20200103Z-b9f880",
  "org.scalablytyped" %%% "restify" % "8.4-dt-20191119Z-b05959",
  "org.scalablytyped" %%% "spdy" % "3.4-dt-20181121Z-5adca2",
  "org.scalablytyped" %%% "std" % "3.7-b6d959")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        