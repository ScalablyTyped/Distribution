organization := "org.scalablytyped"
name := "redux-saga"
version := "1.0.5-dda378"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "redux" % "4.0.4-a121b5",
  "org.scalablytyped" %%% "redux-saga__core" % "1.0.3-c41764",
  "org.scalablytyped" %%% "redux-saga__types" % "1.0.2-e392a1",
  "org.scalablytyped" %%% "std" % "3.6-c16502",
  "org.scalablytyped" %%% "typescript-compare" % "0.0.2-2279fc",
  "org.scalablytyped" %%% "typescript-logic" % "0.0.0-0f6b07",
  "org.scalablytyped" %%% "typescript-tuple" % "2.2.1-833ceb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        