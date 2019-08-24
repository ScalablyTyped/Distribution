organization := "org.scalablytyped"
name := "react-sortable-tree-theme-file-explorer"
version := "0.0-dt-20190717Z-7a181c"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "csstype" % "2.6.6-c240ab",
  "org.scalablytyped" %%% "dnd-core" % "9.3.4-e8b2bf",
  "org.scalablytyped" %%% "hoist-non-react-statics" % "3.3-dt-20190402Z-40d3fd",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190417Z-f929bc",
  "org.scalablytyped" %%% "react" % "16.9-dt-20190815Z-847c1a",
  "org.scalablytyped" %%% "react-dnd" % "9.3.4-c3118e",
  "org.scalablytyped" %%% "react-sortable-tree" % "0.3-dt-20190802Z-c95779",
  "org.scalablytyped" %%% "react-virtualized" % "9.21-dt-20190722Z-ad9c43",
  "org.scalablytyped" %%% "std" % "3.5-cd493c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        