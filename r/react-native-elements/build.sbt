organization := "org.scalablytyped"
name := "react-native-elements"
version := "0.19.1-35d1bf"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "csstype" % "2.5.8-61e37d",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20181203Z-5a27ec",
  "org.scalablytyped" %%% "lodash_dot_isempty" % "4.4-dt-20180723Z-9647a5",
  "org.scalablytyped" %%% "lodash_dot_times" % "4.3-dt-20180723Z-48c997",
  "org.scalablytyped" %%% "prop-types" % "15.5-dt-20181212Z-692895",
  "org.scalablytyped" %%% "react" % "16.7-dt-20190116Z-334a51",
  "org.scalablytyped" %%% "react-native" % "0.57-dt-20190115Z-3fac8a",
  "org.scalablytyped" %%% "react-native-vector-icons" % "4.6-dt-20181108Z-7a73d0",
  "org.scalablytyped" %%% "std" % "3.2.2-2926f1")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        