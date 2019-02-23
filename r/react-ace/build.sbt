organization := "org.scalablytyped"
name := "react-ace"
version := "6.4.0-08ad4a"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "brace" % "0.11.1-4f424d",
  "org.scalablytyped" %%% "csstype" % "2.6.2-522be0",
  "org.scalablytyped" %%% "diff-match-patch" % "1.0-dt-20180214Z-f15b27",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20190212Z-cf3a73",
  "org.scalablytyped" %%% "lodash_dot_get" % "4.4-dt-20190212Z-15dee8",
  "org.scalablytyped" %%% "lodash_dot_isequal" % "4.5-dt-20190212Z-613e1b",
  "org.scalablytyped" %%% "node" % "11.9-dt-20190215Z-604ea6",
  "org.scalablytyped" %%% "prop-types" % "15.5-dt-20190212Z-8cdf18",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190220Z-16f783",
  "org.scalablytyped" %%% "react-dom" % "16.8-dt-20190213Z-4334cf",
  "org.scalablytyped" %%% "std" % "3.3-0ec965")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        