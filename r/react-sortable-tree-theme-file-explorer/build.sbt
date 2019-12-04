organization := "org.scalablytyped"
name := "react-sortable-tree-theme-file-explorer"
version := "0.0-dt-20190717Z-bd9c58"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "csstype" % "2.6.6-a93afc",
  "org.scalablytyped" %%% "dnd-core" % "9.5.1-312f29",
  "org.scalablytyped" %%% "hoist-non-react-statics" % "3.3-dt-20190402Z-bdd097",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190924Z-5cddf8",
  "org.scalablytyped" %%% "react" % "16.9-dt-20191126Z-3d1d47",
  "org.scalablytyped" %%% "react-dnd" % "9.5.1-3c4de6",
  "org.scalablytyped" %%% "react-sortable-tree" % "0.3-dt-20191024Z-91110c",
  "org.scalablytyped" %%% "react-virtualized" % "9.21-dt-20191126Z-425453",
  "org.scalablytyped" %%% "redux" % "4.0.4-507b3f",
  "org.scalablytyped" %%% "std" % "3.7-1d724d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        