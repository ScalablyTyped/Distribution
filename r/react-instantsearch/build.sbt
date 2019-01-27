organization := "org.scalablytyped"
name := "react-instantsearch"
version := "5.2-dt-20181206Z-a9b001"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "csstype" % "2.5.8-36deb1",
  "org.scalablytyped" %%% "prop-types" % "15.5-dt-20181212Z-e51e1e",
  "org.scalablytyped" %%% "react" % "16.7-dt-20190126Z-a37585",
  "org.scalablytyped" %%% "react-instantsearch-core" % "5.2-dt-20181206Z-d427e2",
  "org.scalablytyped" %%% "react-instantsearch-dom" % "5.2-dt-20181205Z-872469",
  "org.scalablytyped" %%% "react-instantsearch-native" % "5.3-dt-20181024Z-c9b42b",
  "org.scalablytyped" %%% "std" % "3.2.4-2926f1")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        