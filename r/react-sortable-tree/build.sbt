organization := "org.scalablytyped"
name := "react-sortable-tree"
version := "0.3-dt-20191001Z-3323c3"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "csstype" % "2.6.6-1967d7",
  "org.scalablytyped" %%% "dnd-core" % "9.4.0-08d700",
  "org.scalablytyped" %%% "hoist-non-react-statics" % "3.3-dt-20190402Z-5d4d91",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190924Z-e54803",
  "org.scalablytyped" %%% "react" % "16.9-dt-20191003Z-cca292",
  "org.scalablytyped" %%% "react-dnd" % "9.4.0-b8d57d",
  "org.scalablytyped" %%% "react-virtualized" % "9.21-dt-20190930Z-e4487d",
  "org.scalablytyped" %%% "std" % "3.6-abb6d3")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        