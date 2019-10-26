organization := "org.scalablytyped"
name := "redux-first-router-link"
version := "1.4-dt-20180806Z-10aa2b"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "csstype" % "2.6.6-550e52",
  "org.scalablytyped" %%% "history" % "4.7.2-dt-20190822Z-2fbebe",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190924Z-08cc8a",
  "org.scalablytyped" %%% "react" % "16.9-dt-20191025Z-9e835e",
  "org.scalablytyped" %%% "redux" % "4.0.4-783f8a",
  "org.scalablytyped" %%% "redux-first-router" % "2.1-dt-20190730Z-4a8f69",
  "org.scalablytyped" %%% "std" % "3.6-b80e7a")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        