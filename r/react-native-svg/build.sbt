organization := "org.scalablytyped"
name := "react-native-svg"
version := "9.0.0-049bc8"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "color" % "3.0-dt-20180214Z-2064c6",
  "org.scalablytyped" %%% "color-convert" % "1.9-dt-20180214Z-ab03b2",
  "org.scalablytyped" %%% "color-name" % "1.1-dt-20180214Z-528543",
  "org.scalablytyped" %%% "csstype" % "2.5.8-61e37d",
  "org.scalablytyped" %%% "prop-types" % "15.5-dt-20181212Z-692895",
  "org.scalablytyped" %%% "react" % "16.7-dt-20190116Z-334a51",
  "org.scalablytyped" %%% "react-native" % "0.57-dt-20190115Z-3fac8a",
  "org.scalablytyped" %%% "std" % "3.2.2-2926f1")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        