organization := "org.scalablytyped"
name := "react-sortable-tree"
version := "0.3-dt-20190318Z-7cb59a"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "csstype" % "2.6.4-b274af",
  "org.scalablytyped" %%% "dnd-core" % "7.4.4-d28181",
  "org.scalablytyped" %%% "hoist-non-react-statics" % "3.3-dt-20190402Z-2f61f0",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190417Z-ff94fb",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190520Z-9d1c81",
  "org.scalablytyped" %%% "react-dnd" % "7.4.5-45589d",
  "org.scalablytyped" %%% "react-virtualized" % "9.21-dt-20190403Z-6b10da",
  "org.scalablytyped" %%% "std" % "3.4-8a92b2")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        