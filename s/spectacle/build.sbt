organization := "org.scalablytyped"
name := "spectacle"
version := "5.4.0-8f968e"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "buble" % "0.19-dt-20190127Z-f2eef3",
  "org.scalablytyped" %%% "core-js" % "2.5-dt-20180921Z-8a719e",
  "org.scalablytyped" %%% "create-emotion" % "10.0.6-4b386a",
  "org.scalablytyped" %%% "create-react-context" % "0.2.2-1716e4",
  "org.scalablytyped" %%% "csstype" % "2.6.2-522be0",
  "org.scalablytyped" %%% "deep-object-diff" % "1.1.0-6d790d",
  "org.scalablytyped" %%% "emotion" % "10.0.6-9a0f51",
  "org.scalablytyped" %%% "emotion__cache" % "10.0.0-db5388",
  "org.scalablytyped" %%% "emotion__serialize" % "0.11.3-b8fd8b",
  "org.scalablytyped" %%% "emotion__sheet" % "0.9.2-487614",
  "org.scalablytyped" %%% "emotion__utils" % "0.11.1-ffeb9e",
  "org.scalablytyped" %%% "history" % "4.7.2-dt-20181017Z-bd3077",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20190116Z-cf3a73",
  "org.scalablytyped" %%% "magic-string" % "0.25.2-88f1b8",
  "org.scalablytyped" %%% "node" % "10.12-dt-20190129Z-7cfc00",
  "org.scalablytyped" %%% "prismjs" % "1.9-dt-20180214Z-b31fed",
  "org.scalablytyped" %%% "prop-types" % "15.5-dt-20181212Z-8cdf18",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190201Z-f7085e",
  "org.scalablytyped" %%% "react-dom" % "16.0-dt-20181127Z-830073",
  "org.scalablytyped" %%% "react-live" % "1.12.0-293c56",
  "org.scalablytyped" %%% "react-redux" % "7.0-dt-20190124Z-9800f2",
  "org.scalablytyped" %%% "react-transition-group" % "2.0-dt-20181219Z-a114a5",
  "org.scalablytyped" %%% "redux" % "4.0.1-8c6a2a",
  "org.scalablytyped" %%% "redux-actions" % "2.3-dt-20181009Z-216913",
  "org.scalablytyped" %%% "sourcemap-codec" % "1.4.4-873ac9",
  "org.scalablytyped" %%% "std" % "3.3-0ec965",
  "org.scalablytyped" %%% "symbol-observable" % "1.2.0-31ba1a")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        