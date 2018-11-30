organization := "com.scalablytyped"
name := "react-router-navigation"
version := "1.0-dt-20181018Z-0f32ea"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "csstype" % "2.5.7-d075d3",
  "com.scalablytyped" %%% "history" % "4.7.2-dt-20181018Z-07fae9",
  "com.scalablytyped" %%% "prop-types" % "15.5-dt-20180927Z-c5aad4",
  "com.scalablytyped" %%% "react" % "16.7-dt-20181129Z-4e32c2",
  "com.scalablytyped" %%% "react-native" % "0.57-dt-20181130Z-28b117",
  "com.scalablytyped" %%% "react-navigation" % "2.13-dt-20181130Z-a12342",
  "com.scalablytyped" %%% "react-router" % "4.4-dt-20181109Z-752ace",
  "com.scalablytyped" %%% "react-router-navigation-core" % "1.0-dt-20181018Z-ef85c7",
  "com.scalablytyped" %%% "std" % "3.2.1-4b40fd",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        