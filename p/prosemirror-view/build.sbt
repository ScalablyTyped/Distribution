organization := "org.scalablytyped"
name := "prosemirror-view"
version := "1.9-dt-20190715Z-666a61"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "orderedmap" % "1.0-dt-20180214Z-ba8c18",
  "org.scalablytyped" %%% "prosemirror-model" % "1.7-dt-20190628Z-9bf599",
  "org.scalablytyped" %%% "prosemirror-transform" % "1.1-dt-20180621Z-4367a4",
  "org.scalablytyped" %%% "std" % "3.5-cd493c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        