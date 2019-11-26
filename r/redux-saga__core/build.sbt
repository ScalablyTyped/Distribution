organization := "org.scalablytyped"
name := "redux-saga__core"
version := "1.1.3-f9bd09"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "node" % "12.12-dt-20191125Z-959704",
  "org.scalablytyped" %%% "redux" % "4.0.4-c08a69",
  "org.scalablytyped" %%% "std" % "3.7-1d724d",
  "org.scalablytyped" %%% "typescript-compare" % "0.0.2-5179b0",
  "org.scalablytyped" %%% "typescript-logic" % "0.0.0-7b7a60",
  "org.scalablytyped" %%% "typescript-tuple" % "2.2.1-166a32")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        