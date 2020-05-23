organization := "org.scalablytyped"
name := "react-sortable-tree-theme-file-explorer"
version := "0.0-dt-20200515Z-493e7c"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "csstype" % "2.6.9-03f85a",
  "org.scalablytyped" %%% "dnd-core" % "10.0.2-2ee6a5",
  "org.scalablytyped" %%% "hoist-non-react-statics" % "3.3-dt-20190402Z-25ab82",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20200515Z-4fb81d",
  "org.scalablytyped" %%% "react" % "16.9-dt-20200515Z-0f8114",
  "org.scalablytyped" %%% "react-dnd" % "10.0.2-f039a9",
  "org.scalablytyped" %%% "react-sortable-tree" % "0.3-dt-20200515Z-ad0519",
  "org.scalablytyped" %%% "react-virtualized" % "9.21-dt-20200515Z-e8f23b",
  "org.scalablytyped" %%% "redux" % "4.0.5-f72eee",
  "org.scalablytyped" %%% "std" % "3.9-18cbeb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
