organization := "com.scalablytyped"
name := "react-virtualized-select"
version := "3.0-dt-20180910Z-53d170"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "csstype" % "2.5.7-d075d3",
  "com.scalablytyped" %%% "node" % "10.12-dt-20181129Z-9f7a18",
  "com.scalablytyped" %%% "prop-types" % "15.5-dt-20180927Z-c5aad4",
  "com.scalablytyped" %%% "react" % "16.7-dt-20181129Z-4e32c2",
  "com.scalablytyped" %%% "react-dom" % "16.0-dt-20181122Z-40dc87",
  "com.scalablytyped" %%% "react-select" % "2.0-dt-20181013Z-4cd5c7",
  "com.scalablytyped" %%% "react-transition-group" % "2.0-dt-20180910Z-10bd45",
  "com.scalablytyped" %%% "react-virtualized" % "9.18-dt-20181116Z-a2ea4f",
  "com.scalablytyped" %%% "std" % "3.2.1-4b40fd",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        