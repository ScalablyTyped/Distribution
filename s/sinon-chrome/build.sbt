organization := "org.scalablytyped"
name := "sinon-chrome"
version := "v2.2.4-dt-20190322Z-2c0d09"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "chrome" % "0.0-unknown-dt-20190520Z-d713be",
  "org.scalablytyped" %%% "filesystem" % "0.0-unknown-dt-20190322Z-e2d085",
  "org.scalablytyped" %%% "filewriter" % "0.0-unknown-dt-20190322Z-3bcb1c",
  "org.scalablytyped" %%% "sinon" % "7.0-dt-20190612Z-07f2e9",
  "org.scalablytyped" %%% "std" % "3.5-983486")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        