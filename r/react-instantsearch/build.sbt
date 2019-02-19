organization := "org.scalablytyped"
name := "react-instantsearch"
version := "5.2-dt-20190212Z-c96a29"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "csstype" % "2.6.2-522be0",
  "org.scalablytyped" %%% "prop-types" % "15.5-dt-20190212Z-8cdf18",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190212Z-6f64c6",
  "org.scalablytyped" %%% "react-instantsearch-core" % "5.2-dt-20181206Z-d56712",
  "org.scalablytyped" %%% "react-instantsearch-dom" % "5.2-dt-20181205Z-722c0a",
  "org.scalablytyped" %%% "react-instantsearch-native" % "5.3-dt-20190212Z-c41000",
  "org.scalablytyped" %%% "std" % "3.3-0ec965")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        