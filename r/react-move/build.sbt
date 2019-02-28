organization := "org.scalablytyped"
name := "react-move"
version := "5.2.0-938209"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "csstype" % "2.6.2-522be0",
  "org.scalablytyped" %%% "d3-timer" % "1.0-dt-20190212Z-09fe77",
  "org.scalablytyped" %%% "kapellmeister" % "2.0.0-3db3ee",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190226Z-3f7dd7",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190225Z-3dd766",
  "org.scalablytyped" %%% "react-lifecycles-compat" % "3.0-dt-20190116Z-21a4d4",
  "org.scalablytyped" %%% "std" % "3.3-0ec965")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        