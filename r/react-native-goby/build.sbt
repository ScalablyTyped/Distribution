organization := "org.scalablytyped"
name := "react-native-goby"
version := "0.0.5-b1710a"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "csstype" % "2.5.8-61e37d",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20180920Z-e3598d",
  "org.scalablytyped" %%% "inquirer" % "0.0-unknown-dt-20180808Z-7125d2",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180214Z-696dbe",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-2be335",
  "org.scalablytyped" %%% "plist" % "3.0-dt-20181029Z-a29dd6",
  "org.scalablytyped" %%% "prop-types" % "15.5-dt-20181212Z-692895",
  "org.scalablytyped" %%% "react" % "16.7-dt-20190116Z-334a51",
  "org.scalablytyped" %%% "react-native" % "0.57-dt-20190115Z-3fac8a",
  "org.scalablytyped" %%% "rx" % "4.1-dt-20180214Z-ab4c1e",
  "org.scalablytyped" %%% "rx-core" % "4.0-dt-20180214Z-42cbcd",
  "org.scalablytyped" %%% "rx-core-binding" % "4.0-dt-20180214Z-390e4d",
  "org.scalablytyped" %%% "rx-lite" % "4.0-dt-20181017Z-30a111",
  "org.scalablytyped" %%% "rx-lite-aggregates" % "4.0-dt-20180214Z-e6c363",
  "org.scalablytyped" %%% "rx-lite-async" % "4.0-dt-20181116Z-f57cf9",
  "org.scalablytyped" %%% "rx-lite-backpressure" % "4.0-dt-20180214Z-f9f5e1",
  "org.scalablytyped" %%% "rx-lite-coincidence" % "4.0-dt-20180214Z-221d8f",
  "org.scalablytyped" %%% "rx-lite-experimental" % "4.0-dt-20180214Z-d00d43",
  "org.scalablytyped" %%% "rx-lite-joinpatterns" % "4.0-dt-20180214Z-d5b6cc",
  "org.scalablytyped" %%% "rx-lite-testing" % "4.0-dt-20180214Z-2ebb12",
  "org.scalablytyped" %%% "rx-lite-time" % "4.0-dt-20180214Z-8c9e58",
  "org.scalablytyped" %%% "rx-lite-virtualtime" % "4.0-dt-20180214Z-44e374",
  "org.scalablytyped" %%% "std" % "3.2.2-2926f1",
  "org.scalablytyped" %%% "through" % "0.0-unknown-dt-20180214Z-48a958",
  "org.scalablytyped" %%% "xmlbuilder" % "0.0-unknown-dt-20180925Z-f4d178")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        