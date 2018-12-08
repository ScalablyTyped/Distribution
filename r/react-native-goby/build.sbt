organization := "org.scalablytyped"
name := "react-native-goby"
version := "0.0.5-310938"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "csstype" % "2.5.8-bb2c56",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20180927Z-63ba70",
  "org.scalablytyped" %%% "inquirer" % "0.0-unknown-dt-20180910Z-fcdff1",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180910Z-4563df",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181203Z-d9c01e",
  "org.scalablytyped" %%% "plist" % "3.0-dt-20181031Z-112dcf",
  "org.scalablytyped" %%% "prop-types" % "15.5-dt-20181208Z-000ab2",
  "org.scalablytyped" %%% "react" % "16.7-dt-20181203Z-1b8e7c",
  "org.scalablytyped" %%% "react-native" % "0.57-dt-20181208Z-3d0fe7",
  "org.scalablytyped" %%% "rx" % "4.1-dt-20180910Z-fa4250",
  "org.scalablytyped" %%% "rx-core" % "4.0-dt-20180910Z-45a578",
  "org.scalablytyped" %%% "rx-core-binding" % "4.0-dt-20180910Z-714f18",
  "org.scalablytyped" %%% "rx-lite" % "4.0-dt-20181018Z-9bc129",
  "org.scalablytyped" %%% "rx-lite-aggregates" % "4.0-dt-20180910Z-a50f0c",
  "org.scalablytyped" %%% "rx-lite-async" % "4.0-dt-20181120Z-497cf1",
  "org.scalablytyped" %%% "rx-lite-backpressure" % "4.0-dt-20180910Z-205d1d",
  "org.scalablytyped" %%% "rx-lite-coincidence" % "4.0-dt-20180910Z-244780",
  "org.scalablytyped" %%% "rx-lite-experimental" % "4.0-dt-20180910Z-7d3dd3",
  "org.scalablytyped" %%% "rx-lite-joinpatterns" % "4.0-dt-20180910Z-083af1",
  "org.scalablytyped" %%% "rx-lite-testing" % "4.0-dt-20180910Z-4ce50c",
  "org.scalablytyped" %%% "rx-lite-time" % "4.0-dt-20180910Z-e4b8f6",
  "org.scalablytyped" %%% "rx-lite-virtualtime" % "4.0-dt-20180910Z-f54510",
  "org.scalablytyped" %%% "std" % "3.2.1-edfe2b",
  "org.scalablytyped" %%% "through" % "0.0-unknown-dt-20180910Z-13de13",
  "org.scalablytyped" %%% "xmlbuilder" % "0.0-unknown-dt-20180927Z-54c897")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        