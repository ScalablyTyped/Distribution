organization := "org.scalablytyped"
name := "react-mosaic-component"
version := "2.1.0-d2ee24"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "asap" % "2.0-dt-20180629Z-ad04b4",
  "org.scalablytyped" %%% "classnames" % "2.2-dt-20181230Z-25d274",
  "org.scalablytyped" %%% "csstype" % "2.6.3-9f8404",
  "org.scalablytyped" %%% "dnd-core" % "7.2.0-9d04e3",
  "org.scalablytyped" %%% "hoist-non-react-statics" % "3.3-dt-20190304Z-40149a",
  "org.scalablytyped" %%% "immutability-helper" % "3.0.0-c83981",
  "org.scalablytyped" %%% "invariant" % "2.2.0-dt-20180214Z-662401",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20190311Z-601106",
  "org.scalablytyped" %%% "node" % "11.11-dt-20190312Z-f6d9fe",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190226Z-f878d0",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190312Z-24375e",
  "org.scalablytyped" %%% "react-dnd" % "7.3.1-24a7c6",
  "org.scalablytyped" %%% "react-dnd-html5-backend" % "7.2.0-cd68d3",
  "org.scalablytyped" %%% "react-dom" % "16.8-dt-20190213Z-c52751",
  "org.scalablytyped" %%% "recompose" % "0.30-dt-20190225Z-88ca54",
  "org.scalablytyped" %%% "redux" % "4.0.1-18f3a8",
  "org.scalablytyped" %%% "shallowequal" % "1.1-dt-20190202Z-aebda3",
  "org.scalablytyped" %%% "std" % "3.3-ec2942",
  "org.scalablytyped" %%% "symbol-observable" % "1.2.0-5b665c",
  "org.scalablytyped" %%% "uuid" % "3.4-dt-20180828Z-a1581b")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        