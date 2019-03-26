organization := "org.scalablytyped"
name := "spectacle"
version := "5.4.0-256e3f"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "buble" % "0.19-dt-20190312Z-809733",
  "org.scalablytyped" %%% "core-js" % "2.5-dt-20180921Z-31b7c8",
  "org.scalablytyped" %%% "create-emotion" % "10.0.9-77efcb",
  "org.scalablytyped" %%% "create-react-context" % "0.2.2-274248",
  "org.scalablytyped" %%% "csstype" % "2.6.3-9dec0a",
  "org.scalablytyped" %%% "deep-object-diff" % "1.1.0-c625be",
  "org.scalablytyped" %%% "emotion" % "10.0.9-23c03c",
  "org.scalablytyped" %%% "emotion__cache" % "10.0.9-ea461f",
  "org.scalablytyped" %%% "emotion__serialize" % "0.11.6-94b869",
  "org.scalablytyped" %%% "emotion__sheet" % "0.9.2-3ea7b2",
  "org.scalablytyped" %%% "emotion__utils" % "0.11.1-544bfc",
  "org.scalablytyped" %%% "history" % "4.7.2-dt-20190322Z-d9c94d",
  "org.scalablytyped" %%% "hoist-non-react-statics" % "3.3-dt-20190304Z-f5f764",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20190311Z-7a74e5",
  "org.scalablytyped" %%% "magic-string" % "0.25.2-d64629",
  "org.scalablytyped" %%% "node" % "11.11-dt-20190325Z-000e7b",
  "org.scalablytyped" %%% "prismjs" % "1.9-dt-20190212Z-8430a9",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190226Z-1549d2",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190322Z-acd0bd",
  "org.scalablytyped" %%% "react-dom" % "16.8-dt-20190322Z-84fa90",
  "org.scalablytyped" %%% "react-live" % "1.12.0-d190ae",
  "org.scalablytyped" %%% "react-redux" % "7.0-dt-20190318Z-c7b49f",
  "org.scalablytyped" %%% "react-transition-group" % "2.0-dt-20190212Z-bcfacb",
  "org.scalablytyped" %%% "redux" % "4.0.1-436f26",
  "org.scalablytyped" %%% "redux-actions" % "2.6-dt-20190321Z-4c5912",
  "org.scalablytyped" %%% "sourcemap-codec" % "1.4.4-82c968",
  "org.scalablytyped" %%% "std" % "3.3-14e863",
  "org.scalablytyped" %%% "symbol-observable" % "1.2.0-1f290b")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        