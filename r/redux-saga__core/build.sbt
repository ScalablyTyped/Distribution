organization := "org.scalablytyped"
name := "redux-saga__core"
version := "1.0.3-8289c4"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "redux" % "4.0.1-2e6d53",
  "org.scalablytyped" %%% "redux-saga__types" % "1.0.2-a8a206",
  "org.scalablytyped" %%% "std" % "3.5-c5d119",
  "org.scalablytyped" %%% "typescript-compare" % "0.0.2-6bf322",
  "org.scalablytyped" %%% "typescript-logic" % "0.0.0-619847",
  "org.scalablytyped" %%% "typescript-tuple" % "2.2.1-00662f")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        