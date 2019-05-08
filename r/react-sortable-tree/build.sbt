organization := "org.scalablytyped"
name := "react-sortable-tree"
version := "0.3-dt-20190318Z-e58ded"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "csstype" % "2.6.3-225f24",
  "org.scalablytyped" %%% "dnd-core" % "7.4.4-a0d0ae",
  "org.scalablytyped" %%% "hoist-non-react-statics" % "3.3-dt-20190402Z-12f327",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190417Z-66be5f",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190508Z-c1645f",
  "org.scalablytyped" %%% "react-dnd" % "7.4.5-fbe784",
  "org.scalablytyped" %%% "react-virtualized" % "9.21-dt-20190403Z-f83760",
  "org.scalablytyped" %%% "std" % "3.4-8a92b2")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        