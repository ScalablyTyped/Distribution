organization := "org.scalablytyped"
name := "storybook__addon-jest"
version := "3.4-dt-20180910Z-f98e0c"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "csstype" % "2.5.8-939493",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181213Z-bd3349",
  "org.scalablytyped" %%% "prop-types" % "15.5-dt-20181212Z-7481e3",
  "org.scalablytyped" %%% "react" % "16.7-dt-20181213Z-296d60",
  "org.scalablytyped" %%% "std" % "3.2.2-04ea79",
  "org.scalablytyped" %%% "storybook__react" % "4.0-dt-20181109Z-3ec093",
  "org.scalablytyped" %%% "webpack-env" % "1.13-dt-20180910Z-29a548")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        