organization := "org.scalablytyped"
name := "react-native-goby"
version := "0.0.5-23504d"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "csstype" % "2.6.3-431253",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20180920Z-ce8e08",
  "org.scalablytyped" %%% "inquirer" % "6.x-dt-20190322Z-f1ad93",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180214Z-e6c927",
  "org.scalablytyped" %%% "node" % "11.13-dt-20190330Z-7c1cfd",
  "org.scalablytyped" %%% "plist" % "3.0-dt-20181029Z-b39d20",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190226Z-f7ff2b",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190403Z-d8f967",
  "org.scalablytyped" %%% "react-native" % "0.57-dt-20190327Z-f86512",
  "org.scalablytyped" %%% "rxjs" % "6.4.0-f8b93e",
  "org.scalablytyped" %%% "std" % "3.4-d52857",
  "org.scalablytyped" %%% "through" % "0.0-unknown-dt-20190322Z-77ab79",
  "org.scalablytyped" %%% "tslib" % "1.9.3-446b32",
  "org.scalablytyped" %%% "xmlbuilder" % "0.0-unknown-dt-20190322Z-ff2724")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        