organization := "org.scalablytyped"
name := "react-native-goby"
version := "0.0.5-08606a"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "csstype" % "2.6.2-522be0",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20180920Z-48cb89",
  "org.scalablytyped" %%% "inquirer" % "0.0-unknown-dt-20180808Z-75839c",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180214Z-029f0e",
  "org.scalablytyped" %%% "node" % "11.9-dt-20190215Z-604ea6",
  "org.scalablytyped" %%% "plist" % "3.0-dt-20181029Z-d349ff",
  "org.scalablytyped" %%% "prop-types" % "15.5-dt-20190212Z-8cdf18",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190225Z-abf012",
  "org.scalablytyped" %%% "react-native" % "0.57-dt-20190221Z-f82265",
  "org.scalablytyped" %%% "rx" % "4.1-dt-20180214Z-df5b71",
  "org.scalablytyped" %%% "rx-core" % "4.0-dt-20180214Z-604f43",
  "org.scalablytyped" %%% "rx-core-binding" % "4.0-dt-20180214Z-7bea92",
  "org.scalablytyped" %%% "rx-lite" % "4.0-dt-20181017Z-e126f2",
  "org.scalablytyped" %%% "rx-lite-aggregates" % "4.0-dt-20180214Z-9d3a33",
  "org.scalablytyped" %%% "rx-lite-async" % "4.0-dt-20181116Z-712703",
  "org.scalablytyped" %%% "rx-lite-backpressure" % "4.0-dt-20180214Z-dc77ef",
  "org.scalablytyped" %%% "rx-lite-coincidence" % "4.0-dt-20180214Z-a2afba",
  "org.scalablytyped" %%% "rx-lite-experimental" % "4.0-dt-20180214Z-f49bdb",
  "org.scalablytyped" %%% "rx-lite-joinpatterns" % "4.0-dt-20180214Z-810f55",
  "org.scalablytyped" %%% "rx-lite-testing" % "4.0-dt-20180214Z-71b5f3",
  "org.scalablytyped" %%% "rx-lite-time" % "4.0-dt-20180214Z-b8b22f",
  "org.scalablytyped" %%% "rx-lite-virtualtime" % "4.0-dt-20180214Z-c96529",
  "org.scalablytyped" %%% "std" % "3.3-0ec965",
  "org.scalablytyped" %%% "through" % "0.0-unknown-dt-20180214Z-08cbe6",
  "org.scalablytyped" %%% "xmlbuilder" % "0.0-unknown-dt-20180925Z-b7a701")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        