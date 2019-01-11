organization := "org.scalablytyped"
name := "react-native-goby"
version := "0.0.5-ca1cf7"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "csstype" % "2.5.8-61e37d",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20180920Z-e3598d",
  "org.scalablytyped" %%% "inquirer" % "0.0-unknown-dt-20180808Z-606d9c",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180214Z-696dbe",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-2be335",
  "org.scalablytyped" %%% "plist" % "3.0-dt-20181029Z-a29dd6",
  "org.scalablytyped" %%% "prop-types" % "15.5-dt-20181212Z-692895",
  "org.scalablytyped" %%% "react" % "16.7-dt-20181220Z-e34099",
  "org.scalablytyped" %%% "react-native" % "0.57-dt-20190108Z-90d027",
  "org.scalablytyped" %%% "rx" % "4.1-dt-20180214Z-086244",
  "org.scalablytyped" %%% "rx-core" % "4.0-dt-20180214Z-42cbcd",
  "org.scalablytyped" %%% "rx-core-binding" % "4.0-dt-20180214Z-cdb3c2",
  "org.scalablytyped" %%% "rx-lite" % "4.0-dt-20181017Z-1260d1",
  "org.scalablytyped" %%% "rx-lite-aggregates" % "4.0-dt-20180214Z-b1f075",
  "org.scalablytyped" %%% "rx-lite-async" % "4.0-dt-20181116Z-1fbb16",
  "org.scalablytyped" %%% "rx-lite-backpressure" % "4.0-dt-20180214Z-e2cf26",
  "org.scalablytyped" %%% "rx-lite-coincidence" % "4.0-dt-20180214Z-87fe4d",
  "org.scalablytyped" %%% "rx-lite-experimental" % "4.0-dt-20180214Z-f9c88d",
  "org.scalablytyped" %%% "rx-lite-joinpatterns" % "4.0-dt-20180214Z-16f3d4",
  "org.scalablytyped" %%% "rx-lite-testing" % "4.0-dt-20180214Z-0a1d61",
  "org.scalablytyped" %%% "rx-lite-time" % "4.0-dt-20180214Z-9b4b54",
  "org.scalablytyped" %%% "rx-lite-virtualtime" % "4.0-dt-20180214Z-55048f",
  "org.scalablytyped" %%% "std" % "3.2.2-2926f1",
  "org.scalablytyped" %%% "through" % "0.0-unknown-dt-20180214Z-48a958",
  "org.scalablytyped" %%% "xmlbuilder" % "0.0-unknown-dt-20180925Z-f4d178")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        