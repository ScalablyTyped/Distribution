organization := "org.scalablytyped"
name := "restify-plugins"
version := "1.5-dt-20181015Z-8182da"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "bunyan" % "1.8-dt-20190311Z-85a236",
  "org.scalablytyped" %%% "formidable" % "1.0.16-dt-20190322Z-fc6429",
  "org.scalablytyped" %%% "node" % "13.1-dt-20200115Z-14f523",
  "org.scalablytyped" %%% "restify" % "8.4-dt-20191119Z-6040f0",
  "org.scalablytyped" %%% "spdy" % "3.4-dt-20181121Z-e9bec4",
  "org.scalablytyped" %%% "std" % "3.7-b6d959")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        