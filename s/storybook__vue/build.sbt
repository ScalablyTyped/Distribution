organization := "org.scalablytyped"
name := "storybook__vue"
version := "3.3-dt-20181018Z-147d61"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181203Z-646a31",
  "org.scalablytyped" %%% "std" % "3.2.2-edfe2b",
  "org.scalablytyped" %%% "vue" % "2.5.18-cadcf2",
  "org.scalablytyped" %%% "webpack-env" % "1.13-dt-20180910Z-ba9bbf")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        