organization := "org.scalablytyped"
name := "prosemirror-view"
version := "1.3-dt-20190222Z-2f2597"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "orderedmap" % "1.0-dt-20180214Z-a9a4b7",
  "org.scalablytyped" %%% "prosemirror-model" % "1.7-dt-20190130Z-d740c8",
  "org.scalablytyped" %%% "prosemirror-transform" % "1.1-dt-20180621Z-bbadbc",
  "org.scalablytyped" %%% "std" % "3.4-8a92b2")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        