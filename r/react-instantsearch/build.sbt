organization := "org.scalablytyped"
name := "react-instantsearch"
version := "5.2-dt-20181206Z-e1364f"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "csstype" % "2.5.8-28635b",
  "org.scalablytyped" %%% "prop-types" % "15.5-dt-20181212Z-3109dd",
  "org.scalablytyped" %%% "react" % "16.7-dt-20181220Z-b38950",
  "org.scalablytyped" %%% "react-instantsearch-core" % "5.2-dt-20181206Z-d6e257",
  "org.scalablytyped" %%% "react-instantsearch-dom" % "5.2-dt-20181205Z-c33fb3",
  "org.scalablytyped" %%% "react-instantsearch-native" % "5.3-dt-20181024Z-a633b9",
  "org.scalablytyped" %%% "std" % "3.2.2-669a73")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        