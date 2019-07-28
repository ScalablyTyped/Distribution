organization := "org.scalablytyped"
name := "prosemirror-keymap"
version := "1.0-dt-20180420Z-3d83fc"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "orderedmap" % "1.0-dt-20180214Z-c5661d",
  "org.scalablytyped" %%% "prosemirror-model" % "1.7-dt-20190628Z-d4e894",
  "org.scalablytyped" %%% "prosemirror-state" % "1.2-dt-20190222Z-023052",
  "org.scalablytyped" %%% "prosemirror-transform" % "1.1-dt-20180621Z-d686c5",
  "org.scalablytyped" %%% "prosemirror-view" % "1.9-dt-20190715Z-0e26e5",
  "org.scalablytyped" %%% "std" % "3.5-65dbfc")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        