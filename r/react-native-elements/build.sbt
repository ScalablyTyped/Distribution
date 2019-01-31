organization := "org.scalablytyped"
name := "react-native-elements"
version := "1.0.0-36afd2"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "color" % "3.0-dt-20180214Z-c780a1",
  "org.scalablytyped" %%% "color-convert" % "1.9-dt-20180214Z-f2e3de",
  "org.scalablytyped" %%% "color-name" % "1.1-dt-20180214Z-786ea5",
  "org.scalablytyped" %%% "csstype" % "2.5.8-36deb1",
  "org.scalablytyped" %%% "hoist-non-react-statics" % "3.0-dt-20180806Z-4bf295",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20190116Z-c48db4",
  "org.scalablytyped" %%% "lodash_dot_merge" % "4.6-dt-20180723Z-86c6a0",
  "org.scalablytyped" %%% "prop-types" % "15.5-dt-20181212Z-e51e1e",
  "org.scalablytyped" %%% "react" % "16.7-dt-20190128Z-cfd22c",
  "org.scalablytyped" %%% "react-native" % "0.57-dt-20190130Z-5379e5",
  "org.scalablytyped" %%% "react-native-ratings" % "6.3.0-8ed8eb",
  "org.scalablytyped" %%% "react-native-status-bar-height" % "2.1-dt-20181024Z-2c234c",
  "org.scalablytyped" %%% "react-native-vector-icons" % "4.6-dt-20181108Z-c6fb5f",
  "org.scalablytyped" %%% "std" % "3.2.4-2926f1")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        