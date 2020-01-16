organization := "org.scalablytyped"
name := "redux-saga__core"
version := "1.1.3-7babe2"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "node" % "13.1-dt-20200115Z-14f523",
  "org.scalablytyped" %%% "redux" % "4.0.5-eabae9",
  "org.scalablytyped" %%% "std" % "3.7-b6d959",
  "org.scalablytyped" %%% "typescript-compare" % "0.0.2-bf0d3b",
  "org.scalablytyped" %%% "typescript-logic" % "0.0.0-0a98a9",
  "org.scalablytyped" %%% "typescript-tuple" % "2.2.1-ce311f")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        