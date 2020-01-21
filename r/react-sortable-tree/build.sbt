organization := "org.scalablytyped"
name := "react-sortable-tree"
version := "0.3-dt-20191024Z-681fe8"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "csstype" % "2.6.6-dcd929",
  "org.scalablytyped" %%% "dnd-core" % "9.5.1-b1f07b",
  "org.scalablytyped" %%% "hoist-non-react-statics" % "3.3-dt-20190402Z-67e02d",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190924Z-78233f",
  "org.scalablytyped" %%% "react" % "16.9-dt-20191220Z-0e1ae9",
  "org.scalablytyped" %%% "react-dnd" % "9.5.1-099b30",
  "org.scalablytyped" %%% "react-virtualized" % "9.21-dt-20191218Z-2ab29c",
  "org.scalablytyped" %%% "redux" % "4.0.5-79fdb5",
  "org.scalablytyped" %%% "std" % "3.7-96076c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        