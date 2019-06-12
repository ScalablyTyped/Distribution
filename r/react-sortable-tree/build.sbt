organization := "org.scalablytyped"
name := "react-sortable-tree"
version := "0.3-dt-20190318Z-750858"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "csstype" % "2.6.5-3bfbc5",
  "org.scalablytyped" %%% "dnd-core" % "7.6.0-b77160",
  "org.scalablytyped" %%% "hoist-non-react-statics" % "3.3-dt-20190402Z-79091c",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190417Z-4b3bf2",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190528Z-62c565",
  "org.scalablytyped" %%% "react-dnd" % "7.6.0-2eaba6",
  "org.scalablytyped" %%% "react-virtualized" % "9.21-dt-20190528Z-949803",
  "org.scalablytyped" %%% "std" % "3.5-c5d119")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        