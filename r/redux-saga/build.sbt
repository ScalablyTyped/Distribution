organization := "org.scalablytyped"
name := "redux-saga"
version := "1.0.5-3d02a7"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "redux" % "4.0.4-567508",
  "org.scalablytyped" %%% "redux-saga__core" % "1.0.3-04022b",
  "org.scalablytyped" %%% "redux-saga__types" % "1.0.2-c3f503",
  "org.scalablytyped" %%% "std" % "3.5-65dbfc",
  "org.scalablytyped" %%% "typescript-compare" % "0.0.2-59ba38",
  "org.scalablytyped" %%% "typescript-logic" % "0.0.0-547e59",
  "org.scalablytyped" %%% "typescript-tuple" % "2.2.1-0795ed")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        