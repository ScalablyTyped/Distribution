organization := "org.scalablytyped"
name := "react-toolbox"
version := "2.0.0-beta.13-395643"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "classnames" % "2.2-dt-20180910Z-4a9357",
  "org.scalablytyped" %%% "core-js" % "2.5-dt-20180927Z-3acce5",
  "org.scalablytyped" %%% "csstype" % "2.5.8-eb24f4",
  "org.scalablytyped" %%% "hoist-non-react-statics" % "3.0-dt-20180910Z-5410a5",
  "org.scalablytyped" %%% "invariant" % "2.2.0-dt-20180910Z-fb4ed9",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181214Z-702cdc",
  "org.scalablytyped" %%% "prop-types" % "15.5-dt-20181212Z-32d5ea",
  "org.scalablytyped" %%% "ramda" % "0.25-dt-20181215Z-c5c36e",
  "org.scalablytyped" %%% "react" % "16.7-dt-20181213Z-7d04f8",
  "org.scalablytyped" %%% "react-css-themr" % "2.1.2-772d0f",
  "org.scalablytyped" %%% "react-dom" % "16.0-dt-20181122Z-71b187",
  "org.scalablytyped" %%% "react-transition-group" % "2.0-dt-20180910Z-8273af",
  "org.scalablytyped" %%% "std" % "3.2.2-beaa2f")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        