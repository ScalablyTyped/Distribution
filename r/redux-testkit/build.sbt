organization := "org.scalablytyped"
name := "redux-testkit"
version := "1.0-dt-20181020Z-864ba6"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "redux" % "4.0.1-914cdc",
  "org.scalablytyped" %%% "redux-thunk" % "2.3.0-ccf22f",
  "org.scalablytyped" %%% "std" % "3.4-6f75bc")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        