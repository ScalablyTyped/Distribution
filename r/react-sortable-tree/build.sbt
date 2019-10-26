organization := "org.scalablytyped"
name := "react-sortable-tree"
version := "0.3-dt-20191024Z-b7cac9"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "csstype" % "2.6.6-550e52",
  "org.scalablytyped" %%% "dnd-core" % "9.4.0-10a778",
  "org.scalablytyped" %%% "hoist-non-react-statics" % "3.3-dt-20190402Z-df4379",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190924Z-08cc8a",
  "org.scalablytyped" %%% "react" % "16.9-dt-20191025Z-9e835e",
  "org.scalablytyped" %%% "react-dnd" % "9.4.0-dab3ea",
  "org.scalablytyped" %%% "react-virtualized" % "9.21-dt-20191022Z-52c291",
  "org.scalablytyped" %%% "std" % "3.6-b80e7a")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        