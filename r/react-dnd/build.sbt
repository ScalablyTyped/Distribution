organization := "org.scalablytyped"
name := "react-dnd"
version := "7.0.2-7c3f98"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "asap" % "2.0-dt-20180629Z-0242d7",
  "org.scalablytyped" %%% "csstype" % "2.6.2-49af40",
  "org.scalablytyped" %%% "dnd-core" % "7.0.2-767034",
  "org.scalablytyped" %%% "hoist-non-react-statics" % "3.0-dt-20180806Z-4c89f3",
  "org.scalablytyped" %%% "invariant" % "2.2.0-dt-20180214Z-ecc25b",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20190212Z-2e7712",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190226Z-0b0b5e",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190226Z-7328c8",
  "org.scalablytyped" %%% "recompose" % "0.30-dt-20190225Z-4c743e",
  "org.scalablytyped" %%% "redux" % "4.0.1-03a2e6",
  "org.scalablytyped" %%% "shallowequal" % "1.1-dt-20190202Z-7061ce",
  "org.scalablytyped" %%% "std" % "3.3-05be79",
  "org.scalablytyped" %%% "symbol-observable" % "1.2.0-bfac6c")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        