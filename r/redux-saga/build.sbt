organization := "org.scalablytyped"
name := "redux-saga"
version := "1.0.2-398295"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "redux" % "4.0.1-cd375e",
  "org.scalablytyped" %%% "redux-saga__core" % "1.0.2-f3f9cf",
  "org.scalablytyped" %%% "redux-saga__types" % "1.0.2-8e4759",
  "org.scalablytyped" %%% "std" % "3.5-f010ac",
  "org.scalablytyped" %%% "typescript-compare" % "0.0.2-6bf322",
  "org.scalablytyped" %%% "typescript-logic" % "0.0.0-619847",
  "org.scalablytyped" %%% "typescript-tuple" % "2.2.1-3d623e")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        