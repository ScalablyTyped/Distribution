organization := "org.scalablytyped"
name := "react-md"
version := "1.9.3-152aa2"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "classnames" % "2.2-dt-20181230Z-25d274",
  "org.scalablytyped" %%% "csstype" % "2.6.3-9f8404",
  "org.scalablytyped" %%% "node" % "11.11-dt-20190312Z-f6d9fe",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190226Z-f878d0",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190312Z-24375e",
  "org.scalablytyped" %%% "react-dom" % "16.8-dt-20190213Z-c52751",
  "org.scalablytyped" %%% "react-motion" % "0.0-unknown-dt-20190212Z-17b0c4",
  "org.scalablytyped" %%% "react-swipeable-views" % "0.13-dt-20190221Z-9c02c1",
  "org.scalablytyped" %%% "react-transition-group" % "2.0-dt-20190212Z-bf3f8b",
  "org.scalablytyped" %%% "resize-observer-polyfill" % "1.5.1-a28f79",
  "org.scalablytyped" %%% "std" % "3.3-ec2942")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        