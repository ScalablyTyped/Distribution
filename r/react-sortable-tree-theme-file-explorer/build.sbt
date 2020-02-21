organization := "org.scalablytyped"
name := "react-sortable-tree-theme-file-explorer"
version := "0.0-dt-20190717Z-de6005"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "csstype" % "2.6.6-ffacbb",
  "org.scalablytyped" %%% "dnd-core" % "9.5.1-c0815a",
  "org.scalablytyped" %%% "hoist-non-react-statics" % "3.3-dt-20190402Z-ee4622",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190924Z-05a52c",
  "org.scalablytyped" %%% "react" % "16.9-dt-20200122Z-b17eee",
  "org.scalablytyped" %%% "react-dnd" % "9.5.1-299898",
  "org.scalablytyped" %%% "react-sortable-tree" % "0.3-dt-20191024Z-b0e8db",
  "org.scalablytyped" %%% "react-virtualized" % "9.21-dt-20200210Z-9cc11a",
  "org.scalablytyped" %%% "redux" % "4.0.5-d8211d",
  "org.scalablytyped" %%% "std" % "3.7-1b8369")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
