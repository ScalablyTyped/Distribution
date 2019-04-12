organization := "org.scalablytyped"
name := "react-native-goby"
version := "0.0.5-a9262a"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "csstype" % "2.6.3-431253",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20180920Z-a3b219",
  "org.scalablytyped" %%% "inquirer" % "6.x-dt-20190322Z-807a70",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180214Z-e6c927",
  "org.scalablytyped" %%% "node" % "11.13-dt-20190409Z-512fe2",
  "org.scalablytyped" %%% "plist" % "3.0-dt-20181029Z-53c0a0",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190226Z-f7ff2b",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190403Z-3351b3",
  "org.scalablytyped" %%% "react-native" % "0.57-dt-20190410Z-5e5772",
  "org.scalablytyped" %%% "rxjs" % "6.4.0-f8b93e",
  "org.scalablytyped" %%% "std" % "3.4-d52857",
  "org.scalablytyped" %%% "through" % "0.0-unknown-dt-20190322Z-fac596",
  "org.scalablytyped" %%% "tslib" % "1.9.3-446b32",
  "org.scalablytyped" %%% "xmlbuilder" % "0.0-unknown-dt-20190322Z-ff2724")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        