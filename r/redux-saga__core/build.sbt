organization := "org.scalablytyped"
name := "redux-saga__core"
version := "1.0.2-4d8efd"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "redux" % "4.0.1-14a8b8",
  "org.scalablytyped" %%% "redux-saga__types" % "1.0.2-3d57cb",
  "org.scalablytyped" %%% "std" % "3.4-ef47bb",
  "org.scalablytyped" %%% "typescript-compare" % "0.0.2-6bf322",
  "org.scalablytyped" %%% "typescript-logic" % "0.0.0-619847",
  "org.scalablytyped" %%% "typescript-tuple" % "2.2.1-76c0c5")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        