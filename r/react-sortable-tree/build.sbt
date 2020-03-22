organization := "org.scalablytyped"
name := "react-sortable-tree"
version := "0.3-dt-20191024Z-9456db"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "csstype" % "2.6.9-2d2033",
  "org.scalablytyped" %%% "dnd-core" % "10.0.2-b4497d",
  "org.scalablytyped" %%% "hoist-non-react-statics" % "3.3-dt-20190402Z-df39db",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190924Z-ece683",
  "org.scalablytyped" %%% "react" % "16.9-dt-20200122Z-fc5268",
  "org.scalablytyped" %%% "react-dnd" % "10.0.2-a3be46",
  "org.scalablytyped" %%% "react-virtualized" % "9.21-dt-20200210Z-02dc9b",
  "org.scalablytyped" %%% "redux" % "4.0.5-c5ba7d",
  "org.scalablytyped" %%% "std" % "3.8-a0108c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
