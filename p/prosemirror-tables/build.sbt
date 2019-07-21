organization := "org.scalablytyped"
name := "prosemirror-tables"
version := "0.8-dt-20190514Z-98cddc"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "orderedmap" % "1.0-dt-20180214Z-3ffdee",
  "org.scalablytyped" %%% "prosemirror-model" % "1.7-dt-20190628Z-499849",
  "org.scalablytyped" %%% "prosemirror-state" % "1.2-dt-20190222Z-50e234",
  "org.scalablytyped" %%% "prosemirror-transform" % "1.1-dt-20180621Z-5f26b9",
  "org.scalablytyped" %%% "prosemirror-view" % "1.9-dt-20190715Z-64389a",
  "org.scalablytyped" %%% "std" % "3.5-983486")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        