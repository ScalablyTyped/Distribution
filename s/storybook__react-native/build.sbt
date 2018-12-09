organization := "org.scalablytyped"
name := "storybook__react-native"
version := "3.0-dt-20181203Z-8d1171"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "csstype" % "2.5.8-939493",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181203Z-df5d12",
  "org.scalablytyped" %%% "prop-types" % "15.5-dt-20181208Z-c640d3",
  "org.scalablytyped" %%% "react" % "16.7-dt-20181203Z-df71a8",
  "org.scalablytyped" %%% "std" % "3.2.2-04ea79",
  "org.scalablytyped" %%% "storybook__react" % "4.0-dt-20181109Z-cec65c",
  "org.scalablytyped" %%% "webpack-env" % "1.13-dt-20180910Z-3291aa")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        