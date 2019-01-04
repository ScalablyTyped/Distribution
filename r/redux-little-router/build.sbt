organization := "org.scalablytyped"
name := "redux-little-router"
version := "15.1.2-27d54e"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "csstype" % "2.5.8-a13970",
  "org.scalablytyped" %%% "history" % "4.7.2-dt-20181017Z-420ff8",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20181203Z-0a02fb",
  "org.scalablytyped" %%% "lodash_dot_assign" % "4.2-dt-20180723Z-291e31",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-77ce7e",
  "org.scalablytyped" %%% "prop-types" % "15.5-dt-20181212Z-89199d",
  "org.scalablytyped" %%% "query-string" % "6.2-dt-20190103Z-d16011",
  "org.scalablytyped" %%% "react" % "16.7-dt-20181220Z-3dff88",
  "org.scalablytyped" %%% "react-dom" % "16.0-dt-20181127Z-8054fe",
  "org.scalablytyped" %%% "react-redux" % "6.0-dt-20181229Z-2b6ab0",
  "org.scalablytyped" %%% "recompose" % "0.30-dt-20181212Z-cab13d",
  "org.scalablytyped" %%% "redux" % "4.0.1-7cb6f2",
  "org.scalablytyped" %%% "std" % "3.2.2-9ed5ff",
  "org.scalablytyped" %%% "symbol-observable" % "1.2.0-dc48cb",
  "org.scalablytyped" %%% "url-pattern" % "1.0.3-380bbb")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        