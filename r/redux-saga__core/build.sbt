organization := "org.scalablytyped"
name := "redux-saga__core"
version := "1.1.3-47a341"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "node" % "13.13-dt-20200417Z-f3d81d",
  "org.scalablytyped" %%% "redux" % "4.0.5-069469",
  "org.scalablytyped" %%% "std" % "3.8-9b2470",
  "org.scalablytyped" %%% "typescript-compare" % "0.0.2-f1a338",
  "org.scalablytyped" %%% "typescript-logic" % "0.0.0-6717ad",
  "org.scalablytyped" %%% "typescript-tuple" % "2.2.1-90c161")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
