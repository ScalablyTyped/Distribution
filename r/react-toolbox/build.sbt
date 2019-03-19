organization := "org.scalablytyped"
name := "react-toolbox"
version := "2.0.0-beta.13-300d55"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "classnames" % "2.2-dt-20181230Z-25d274",
  "org.scalablytyped" %%% "core-js" % "2.5-dt-20180921Z-298712",
  "org.scalablytyped" %%% "csstype" % "2.6.3-29f798",
  "org.scalablytyped" %%% "hoist-non-react-statics" % "3.3-dt-20190304Z-70f930",
  "org.scalablytyped" %%% "invariant" % "2.2.0-dt-20180214Z-662401",
  "org.scalablytyped" %%% "node" % "11.11-dt-20190318Z-f6d9fe",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190226Z-f878d0",
  "org.scalablytyped" %%% "ramda" % "0.26-dt-20190311Z-da096c",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190312Z-6f0f1a",
  "org.scalablytyped" %%% "react-css-themr" % "2.1.2-71c11b",
  "org.scalablytyped" %%% "react-dom" % "16.8-dt-20190213Z-15e686",
  "org.scalablytyped" %%% "react-transition-group" % "2.0-dt-20190212Z-43f0e6",
  "org.scalablytyped" %%% "std" % "3.3-ec2942")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        