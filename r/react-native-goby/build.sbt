organization := "org.scalablytyped"
name := "react-native-goby"
version := "0.0.5-cba87e"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "csstype" % "2.5.8-28635b",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20180920Z-790699",
  "org.scalablytyped" %%% "inquirer" % "0.0-unknown-dt-20180808Z-f1754f",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180214Z-7791d7",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-e45326",
  "org.scalablytyped" %%% "plist" % "3.0-dt-20181029Z-b6dbcd",
  "org.scalablytyped" %%% "prop-types" % "15.5-dt-20181212Z-3109dd",
  "org.scalablytyped" %%% "react" % "16.7-dt-20181220Z-b38950",
  "org.scalablytyped" %%% "react-native" % "0.57-dt-20181224Z-252615",
  "org.scalablytyped" %%% "rx" % "4.1-dt-20180214Z-01fdde",
  "org.scalablytyped" %%% "rx-core" % "4.0-dt-20180214Z-88559c",
  "org.scalablytyped" %%% "rx-core-binding" % "4.0-dt-20180214Z-75edf5",
  "org.scalablytyped" %%% "rx-lite" % "4.0-dt-20181017Z-156ef4",
  "org.scalablytyped" %%% "rx-lite-aggregates" % "4.0-dt-20180214Z-0cf36e",
  "org.scalablytyped" %%% "rx-lite-async" % "4.0-dt-20181116Z-f2dc56",
  "org.scalablytyped" %%% "rx-lite-backpressure" % "4.0-dt-20180214Z-82424d",
  "org.scalablytyped" %%% "rx-lite-coincidence" % "4.0-dt-20180214Z-98aef3",
  "org.scalablytyped" %%% "rx-lite-experimental" % "4.0-dt-20180214Z-c0541d",
  "org.scalablytyped" %%% "rx-lite-joinpatterns" % "4.0-dt-20180214Z-550f0b",
  "org.scalablytyped" %%% "rx-lite-testing" % "4.0-dt-20180214Z-4ba582",
  "org.scalablytyped" %%% "rx-lite-time" % "4.0-dt-20180214Z-ab7a65",
  "org.scalablytyped" %%% "rx-lite-virtualtime" % "4.0-dt-20180214Z-695e85",
  "org.scalablytyped" %%% "std" % "3.2.2-669a73",
  "org.scalablytyped" %%% "through" % "0.0-unknown-dt-20180214Z-894b7b",
  "org.scalablytyped" %%% "xmlbuilder" % "0.0-unknown-dt-20180925Z-906edd")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        