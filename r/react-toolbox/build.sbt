organization := "org.scalablytyped"
name := "react-toolbox"
version := "2.0.0-beta.13-8f782c"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "classnames" % "2.2-dt-20181230Z-df7a56",
  "org.scalablytyped" %%% "core-js" % "2.5-dt-20180921Z-8a719e",
  "org.scalablytyped" %%% "csstype" % "2.6.2-522be0",
  "org.scalablytyped" %%% "hoist-non-react-statics" % "3.0-dt-20180806Z-4e3d11",
  "org.scalablytyped" %%% "invariant" % "2.2.0-dt-20180214Z-d5355c",
  "org.scalablytyped" %%% "node" % "10.12-dt-20190129Z-7cfc00",
  "org.scalablytyped" %%% "prop-types" % "15.5-dt-20181212Z-8cdf18",
  "org.scalablytyped" %%% "ramda" % "0.25-dt-20190109Z-de773c",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190201Z-f7085e",
  "org.scalablytyped" %%% "react-css-themr" % "2.1.2-ab95b1",
  "org.scalablytyped" %%% "react-dom" % "16.0-dt-20181127Z-830073",
  "org.scalablytyped" %%% "react-transition-group" % "2.0-dt-20181219Z-a114a5",
  "org.scalablytyped" %%% "std" % "3.3-0ec965")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        