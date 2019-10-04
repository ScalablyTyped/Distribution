organization := "org.scalablytyped"
name := "react-sortable-tree"
version := "0.3-dt-20191001Z-347714"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "csstype" % "2.6.6-f980df",
  "org.scalablytyped" %%% "dnd-core" % "9.4.0-2f03d2",
  "org.scalablytyped" %%% "hoist-non-react-statics" % "3.3-dt-20190402Z-66aa13",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190924Z-06c3ac",
  "org.scalablytyped" %%% "react" % "16.9-dt-20191003Z-b3917f",
  "org.scalablytyped" %%% "react-dnd" % "9.4.0-303c51",
  "org.scalablytyped" %%% "react-virtualized" % "9.21-dt-20190930Z-019bbc",
  "org.scalablytyped" %%% "std" % "3.6-c16502")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        