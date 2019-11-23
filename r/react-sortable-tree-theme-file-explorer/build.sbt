organization := "org.scalablytyped"
name := "react-sortable-tree-theme-file-explorer"
version := "0.0-dt-20190717Z-01f708"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "csstype" % "2.6.6-3eaa6f",
  "org.scalablytyped" %%% "dnd-core" % "9.4.0-2b6252",
  "org.scalablytyped" %%% "hoist-non-react-statics" % "3.3-dt-20190402Z-202a38",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190924Z-8b44d5",
  "org.scalablytyped" %%% "react" % "16.9-dt-20191122Z-caf4d8",
  "org.scalablytyped" %%% "react-dnd" % "9.4.0-684f8a",
  "org.scalablytyped" %%% "react-sortable-tree" % "0.3-dt-20191024Z-863661",
  "org.scalablytyped" %%% "react-virtualized" % "9.21-dt-20191022Z-836d3e",
  "org.scalablytyped" %%% "std" % "3.7-1c17cf")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        