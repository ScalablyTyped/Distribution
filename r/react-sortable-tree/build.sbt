organization := "org.scalablytyped"
name := "react-sortable-tree"
version := "0.3-dt-20190318Z-2a8dd9"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "csstype" % "2.6.3-908b0a",
  "org.scalablytyped" %%% "dnd-core" % "7.4.4-52ed54",
  "org.scalablytyped" %%% "hoist-non-react-statics" % "3.3-dt-20190402Z-9b4f7e",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190417Z-e0e6aa",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190429Z-aae4f0",
  "org.scalablytyped" %%% "react-dnd" % "7.4.5-7c306e",
  "org.scalablytyped" %%% "react-virtualized" % "9.21-dt-20190403Z-1f3702",
  "org.scalablytyped" %%% "std" % "3.4-495f93")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        