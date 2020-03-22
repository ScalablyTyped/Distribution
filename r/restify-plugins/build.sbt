organization := "org.scalablytyped"
name := "restify-plugins"
version := "1.5-dt-20181015Z-c9711e"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "bunyan" % "1.8-dt-20190311Z-e09edc",
  "org.scalablytyped" %%% "formidable" % "1.0.16-dt-20190322Z-2c4b5d",
  "org.scalablytyped" %%% "node" % "13.7-dt-20200211Z-b30bde",
  "org.scalablytyped" %%% "restify" % "8.4-dt-20191119Z-cb2c91",
  "org.scalablytyped" %%% "spdy" % "3.4-dt-20181121Z-2cd8ae",
  "org.scalablytyped" %%% "std" % "3.8-a0108c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
