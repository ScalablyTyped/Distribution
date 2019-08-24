organization := "org.scalablytyped"
name := "redux-saga__core"
version := "1.0.3-3c3f33"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "redux" % "4.0.4-64bc3e",
  "org.scalablytyped" %%% "redux-saga__types" % "1.0.2-8514a0",
  "org.scalablytyped" %%% "std" % "3.5-cd493c",
  "org.scalablytyped" %%% "typescript-compare" % "0.0.2-2279fc",
  "org.scalablytyped" %%% "typescript-logic" % "0.0.0-0f6b07",
  "org.scalablytyped" %%% "typescript-tuple" % "2.2.1-2cb181")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        