organization := "com.scalablytyped"
name := "react-native-goby"
version := "0.0.5-c4d9ac"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "csstype" % "2.5.7-eccde3",
  "com.scalablytyped" %%% "glob" % "7.1-dt-20180927Z-1b2f14",
  "com.scalablytyped" %%% "inquirer" % "0.0-unknown-dt-20180910Z-b04c4c",
  "com.scalablytyped" %%% "minimatch" % "3.0-dt-20180910Z-298c87",
  "com.scalablytyped" %%% "node" % "10.12-dt-20181116Z-cadd20",
  "com.scalablytyped" %%% "plist" % "3.0-dt-20181031Z-a7a17a",
  "com.scalablytyped" %%% "prop-types" % "15.5-dt-20180927Z-7b533e",
  "com.scalablytyped" %%% "react" % "16.7-dt-20181116Z-44bb36",
  "com.scalablytyped" %%% "react-native" % "0.57-dt-20181120Z-aca396",
  "com.scalablytyped" %%% "rx" % "4.1-dt-20180910Z-0ece3b",
  "com.scalablytyped" %%% "rx-core" % "4.0-dt-20180910Z-861271",
  "com.scalablytyped" %%% "rx-core-binding" % "4.0-dt-20180910Z-7c2f3d",
  "com.scalablytyped" %%% "rx-lite" % "4.0-dt-20181018Z-5eb8cf",
  "com.scalablytyped" %%% "rx-lite-aggregates" % "4.0-dt-20180910Z-3d9ec8",
  "com.scalablytyped" %%% "rx-lite-async" % "4.0-dt-20181120Z-7032f9",
  "com.scalablytyped" %%% "rx-lite-backpressure" % "4.0-dt-20180910Z-215596",
  "com.scalablytyped" %%% "rx-lite-coincidence" % "4.0-dt-20180910Z-de0144",
  "com.scalablytyped" %%% "rx-lite-experimental" % "4.0-dt-20180910Z-ee1416",
  "com.scalablytyped" %%% "rx-lite-joinpatterns" % "4.0-dt-20180910Z-9547f5",
  "com.scalablytyped" %%% "rx-lite-testing" % "4.0-dt-20180910Z-ff0b5b",
  "com.scalablytyped" %%% "rx-lite-time" % "4.0-dt-20180910Z-4b69c6",
  "com.scalablytyped" %%% "rx-lite-virtualtime" % "4.0-dt-20180910Z-bb1b39",
  "com.scalablytyped" %%% "std" % "3.1.3-0b55f4",
  "com.scalablytyped" %%% "through" % "0.0-unknown-dt-20180910Z-5a4c16",
  "com.scalablytyped" %%% "xmlbuilder" % "0.0-unknown-dt-20180927Z-7c80c2",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        