organization := "org.scalablytyped"
name := "redux-saga__core"
version := "1.1.3-cfd84a"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "node" % "12.12-dt-20191108Z-6cbaae",
  "org.scalablytyped" %%% "redux" % "4.0.4-ae4e73",
  "org.scalablytyped" %%% "std" % "3.7-1c17cf",
  "org.scalablytyped" %%% "typescript-compare" % "0.0.2-31336b",
  "org.scalablytyped" %%% "typescript-logic" % "0.0.0-e12f0b",
  "org.scalablytyped" %%% "typescript-tuple" % "2.2.1-6d3094")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        