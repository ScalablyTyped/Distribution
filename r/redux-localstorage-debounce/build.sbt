organization := "org.scalablytyped"
name := "redux-localstorage-debounce"
version := "0.1-dt-20180214Z-f8c73e"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "redux" % "4.0.1-914cdc",
  "org.scalablytyped" %%% "redux-localstorage" % "1.0-dt-20180214Z-e25a43",
  "org.scalablytyped" %%% "std" % "3.4-6f75bc")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        