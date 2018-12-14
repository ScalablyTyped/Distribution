organization := "org.scalablytyped"
name := "react-native-goby"
version := "0.0.5-75d2a6"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "csstype" % "2.5.8-eb24f4",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20180927Z-274633",
  "org.scalablytyped" %%% "inquirer" % "0.0-unknown-dt-20180910Z-d213d4",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180910Z-c002a7",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181214Z-702cdc",
  "org.scalablytyped" %%% "plist" % "3.0-dt-20181031Z-ed550e",
  "org.scalablytyped" %%% "prop-types" % "15.5-dt-20181212Z-32d5ea",
  "org.scalablytyped" %%% "react" % "16.7-dt-20181213Z-7d04f8",
  "org.scalablytyped" %%% "react-native" % "0.57-dt-20181208Z-df16e2",
  "org.scalablytyped" %%% "rx" % "4.1-dt-20180910Z-86ac01",
  "org.scalablytyped" %%% "rx-core" % "4.0-dt-20180910Z-5d69f6",
  "org.scalablytyped" %%% "rx-core-binding" % "4.0-dt-20180910Z-77fc4c",
  "org.scalablytyped" %%% "rx-lite" % "4.0-dt-20181018Z-405c2e",
  "org.scalablytyped" %%% "rx-lite-aggregates" % "4.0-dt-20180910Z-72737d",
  "org.scalablytyped" %%% "rx-lite-async" % "4.0-dt-20181120Z-40cb07",
  "org.scalablytyped" %%% "rx-lite-backpressure" % "4.0-dt-20180910Z-1f2435",
  "org.scalablytyped" %%% "rx-lite-coincidence" % "4.0-dt-20180910Z-f4b184",
  "org.scalablytyped" %%% "rx-lite-experimental" % "4.0-dt-20180910Z-a3ae35",
  "org.scalablytyped" %%% "rx-lite-joinpatterns" % "4.0-dt-20180910Z-dc2dd5",
  "org.scalablytyped" %%% "rx-lite-testing" % "4.0-dt-20180910Z-a47c84",
  "org.scalablytyped" %%% "rx-lite-time" % "4.0-dt-20180910Z-19d72b",
  "org.scalablytyped" %%% "rx-lite-virtualtime" % "4.0-dt-20180910Z-cc612b",
  "org.scalablytyped" %%% "std" % "3.2.2-beaa2f",
  "org.scalablytyped" %%% "through" % "0.0-unknown-dt-20180910Z-732eca",
  "org.scalablytyped" %%% "xmlbuilder" % "0.0-unknown-dt-20180927Z-3cf58d")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        