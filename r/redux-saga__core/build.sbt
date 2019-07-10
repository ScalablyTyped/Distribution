organization := "org.scalablytyped"
name := "redux-saga__core"
version := "1.0.3-e74298"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "redux" % "4.0.3-d7698e",
  "org.scalablytyped" %%% "redux-saga__types" % "1.0.2-ac558c",
  "org.scalablytyped" %%% "std" % "3.5-983486",
  "org.scalablytyped" %%% "typescript-compare" % "0.0.2-1330bf",
  "org.scalablytyped" %%% "typescript-logic" % "0.0.0-2d9f5e",
  "org.scalablytyped" %%% "typescript-tuple" % "2.2.1-bab260")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        