organization := "org.scalablytyped"
name := "redux-localstorage-debounce"
version := "0.1-dt-20180214Z-9a4de5"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "redux" % "4.0.1-14a8b8",
  "org.scalablytyped" %%% "redux-localstorage" % "1.0-dt-20180214Z-9fafe7",
  "org.scalablytyped" %%% "std" % "3.4-ef47bb")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        