organization := "org.scalablytyped"
name := "react-instantsearch"
version := "5.2-dt-20181206Z-17419a"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "csstype" % "2.5.8-ae54dc",
  "org.scalablytyped" %%% "prop-types" % "15.5-dt-20181212Z-d610b9",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190131Z-997ec6",
  "org.scalablytyped" %%% "react-instantsearch-core" % "5.2-dt-20181206Z-3a441d",
  "org.scalablytyped" %%% "react-instantsearch-dom" % "5.2-dt-20181205Z-47d0c9",
  "org.scalablytyped" %%% "react-instantsearch-native" % "5.3-dt-20181024Z-9a2ec0",
  "org.scalablytyped" %%% "std" % "3.3.1-6e0314")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        