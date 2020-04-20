organization := "org.scalablytyped"
name := "prosemirror-schema-list"
version := "1.0-dt-20181017Z-001524"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "orderedmap" % "1.0-dt-20180214Z-1c1d85",
  "org.scalablytyped" %%% "prosemirror-model" % "1.7-dt-20190628Z-31a58c",
  "org.scalablytyped" %%% "prosemirror-state" % "1.2-dt-20200225Z-00a72d",
  "org.scalablytyped" %%% "prosemirror-transform" % "1.1-dt-20191101Z-01700f",
  "org.scalablytyped" %%% "prosemirror-view" % "1.11-dt-20200416Z-ad1559",
  "org.scalablytyped" %%% "std" % "3.8-9b2470")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
