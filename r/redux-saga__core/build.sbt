organization := "org.scalablytyped"
name := "redux-saga__core"
version := "1.1.3-208c64"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "node" % "13.1-dt-20200117Z-4be21b",
  "org.scalablytyped" %%% "redux" % "4.0.5-79fdb5",
  "org.scalablytyped" %%% "std" % "3.7-96076c",
  "org.scalablytyped" %%% "typescript-compare" % "0.0.2-b1ef17",
  "org.scalablytyped" %%% "typescript-logic" % "0.0.0-c3f137",
  "org.scalablytyped" %%% "typescript-tuple" % "2.2.1-4ba1d4")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        