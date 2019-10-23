organization := "org.scalablytyped"
name := "redux-saga__core"
version := "1.1.1-7d53f0"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "node" % "12.11-dt-20191022Z-f18ffd",
  "org.scalablytyped" %%% "redux" % "4.0.4-8412ae",
  "org.scalablytyped" %%% "std" % "3.6-b80e7a",
  "org.scalablytyped" %%% "typescript-compare" % "0.0.2-31336b",
  "org.scalablytyped" %%% "typescript-logic" % "0.0.0-e12f0b",
  "org.scalablytyped" %%% "typescript-tuple" % "2.2.1-9f2982")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        