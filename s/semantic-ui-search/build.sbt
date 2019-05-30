organization := "org.scalablytyped"
name := "semantic-ui-search"
version := "2.2-dt-20180214Z-1acf70"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "jquery" % "3.3-dt-20190108Z-a823da",
  "org.scalablytyped" %%% "semantic-ui-api" % "2.2-dt-20180214Z-75e1b8",
  "org.scalablytyped" %%% "sizzle" % "2.3-dt-20181006Z-0995ad",
  "org.scalablytyped" %%% "std" % "3.5-f010ac")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        