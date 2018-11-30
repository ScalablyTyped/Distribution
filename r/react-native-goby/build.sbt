organization := "com.scalablytyped"
name := "react-native-goby"
version := "0.0.5-1ccfe9"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "csstype" % "2.5.7-d075d3",
  "com.scalablytyped" %%% "glob" % "7.1-dt-20180927Z-8a7f1f",
  "com.scalablytyped" %%% "inquirer" % "0.0-unknown-dt-20180910Z-a9c9e6",
  "com.scalablytyped" %%% "minimatch" % "3.0-dt-20180910Z-5ec0b9",
  "com.scalablytyped" %%% "node" % "10.12-dt-20181129Z-9f7a18",
  "com.scalablytyped" %%% "plist" % "3.0-dt-20181031Z-8dce11",
  "com.scalablytyped" %%% "prop-types" % "15.5-dt-20180927Z-c5aad4",
  "com.scalablytyped" %%% "react" % "16.7-dt-20181129Z-4e32c2",
  "com.scalablytyped" %%% "react-native" % "0.57-dt-20181130Z-28b117",
  "com.scalablytyped" %%% "rx" % "4.1-dt-20180910Z-49bd7e",
  "com.scalablytyped" %%% "rx-core" % "4.0-dt-20180910Z-b87bbc",
  "com.scalablytyped" %%% "rx-core-binding" % "4.0-dt-20180910Z-df7bfe",
  "com.scalablytyped" %%% "rx-lite" % "4.0-dt-20181018Z-3db92b",
  "com.scalablytyped" %%% "rx-lite-aggregates" % "4.0-dt-20180910Z-64ff54",
  "com.scalablytyped" %%% "rx-lite-async" % "4.0-dt-20181120Z-b0352d",
  "com.scalablytyped" %%% "rx-lite-backpressure" % "4.0-dt-20180910Z-5d5ac6",
  "com.scalablytyped" %%% "rx-lite-coincidence" % "4.0-dt-20180910Z-4964ae",
  "com.scalablytyped" %%% "rx-lite-experimental" % "4.0-dt-20180910Z-00859c",
  "com.scalablytyped" %%% "rx-lite-joinpatterns" % "4.0-dt-20180910Z-e3a076",
  "com.scalablytyped" %%% "rx-lite-testing" % "4.0-dt-20180910Z-4b1e9f",
  "com.scalablytyped" %%% "rx-lite-time" % "4.0-dt-20180910Z-7f8ab3",
  "com.scalablytyped" %%% "rx-lite-virtualtime" % "4.0-dt-20180910Z-d01234",
  "com.scalablytyped" %%% "std" % "3.2.1-4b40fd",
  "com.scalablytyped" %%% "through" % "0.0-unknown-dt-20180910Z-312c0e",
  "com.scalablytyped" %%% "xmlbuilder" % "0.0-unknown-dt-20180927Z-89312f",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        