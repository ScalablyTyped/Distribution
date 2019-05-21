organization := "org.scalablytyped"
name := "react-sortable-tree-theme-file-explorer"
version := "0.0-dt-20181210Z-d433e1"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "csstype" % "2.6.3-225f24",
  "org.scalablytyped" %%% "dnd-core" % "7.4.4-d28181",
  "org.scalablytyped" %%% "hoist-non-react-statics" % "3.3-dt-20190402Z-efdb34",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190417Z-ff94fb",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190508Z-56dde3",
  "org.scalablytyped" %%% "react-dnd" % "7.4.5-4d438e",
  "org.scalablytyped" %%% "react-sortable-tree" % "0.3-dt-20190318Z-bdd34a",
  "org.scalablytyped" %%% "react-virtualized" % "9.21-dt-20190403Z-07b68a",
  "org.scalablytyped" %%% "std" % "3.4-8a92b2")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        