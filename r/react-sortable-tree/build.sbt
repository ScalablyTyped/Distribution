organization := "org.scalablytyped"
name := "react-sortable-tree"
version := "0.3-dt-20190318Z-9e2c72"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "csstype" % "2.6.4-a0e5c1",
  "org.scalablytyped" %%% "dnd-core" % "7.4.4-bdefad",
  "org.scalablytyped" %%% "hoist-non-react-statics" % "3.3-dt-20190402Z-4c5137",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190417Z-b94c72",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190528Z-1cea03",
  "org.scalablytyped" %%% "react-dnd" % "7.4.5-549470",
  "org.scalablytyped" %%% "react-virtualized" % "9.21-dt-20190528Z-462c4c",
  "org.scalablytyped" %%% "std" % "3.4-ef47bb")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        