organization := "org.scalablytyped"
name := "react-sortable-tree-theme-file-explorer"
version := "0.0-dt-20181210Z-4bca4b"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "csstype" % "2.6.5-e47d18",
  "org.scalablytyped" %%% "dnd-core" % "7.7.0-4102da",
  "org.scalablytyped" %%% "hoist-non-react-statics" % "3.3-dt-20190402Z-adf80b",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190417Z-2a42a7",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190621Z-9e424f",
  "org.scalablytyped" %%% "react-dnd" % "7.7.0-0c3f4c",
  "org.scalablytyped" %%% "react-sortable-tree" % "0.3-dt-20190318Z-e65d5d",
  "org.scalablytyped" %%% "react-virtualized" % "9.21-dt-20190528Z-329644",
  "org.scalablytyped" %%% "std" % "3.5-d4a303")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        