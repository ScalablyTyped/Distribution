organization := "org.scalablytyped"
name := "spectacle"
version := "5.4.0-5c89a8"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "buble" % "0.19-dt-20190127Z-f288a9",
  "org.scalablytyped" %%% "core-js" % "2.5-dt-20180921Z-76463f",
  "org.scalablytyped" %%% "create-emotion" % "10.0.7-cd0272",
  "org.scalablytyped" %%% "create-react-context" % "0.2.2-2cc11d",
  "org.scalablytyped" %%% "csstype" % "2.6.2-481742",
  "org.scalablytyped" %%% "deep-object-diff" % "1.1.0-e4f80b",
  "org.scalablytyped" %%% "emotion" % "10.0.7-fe7643",
  "org.scalablytyped" %%% "emotion__cache" % "10.0.7-169d3a",
  "org.scalablytyped" %%% "emotion__serialize" % "0.11.4-5e8565",
  "org.scalablytyped" %%% "emotion__sheet" % "0.9.2-2a2209",
  "org.scalablytyped" %%% "emotion__utils" % "0.11.1-87741b",
  "org.scalablytyped" %%% "history" % "4.7.2-dt-20190226Z-3ed5cf",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20190212Z-f3a537",
  "org.scalablytyped" %%% "magic-string" % "0.25.2-0fc128",
  "org.scalablytyped" %%% "node" % "11.9-dt-20190222Z-99335f",
  "org.scalablytyped" %%% "prismjs" % "1.9-dt-20190212Z-3535a4",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190226Z-66c044",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190226Z-9e9d73",
  "org.scalablytyped" %%% "react-dom" % "16.8-dt-20190213Z-dfd109",
  "org.scalablytyped" %%% "react-live" % "1.12.0-ba12fc",
  "org.scalablytyped" %%% "react-redux" % "7.0-dt-20190124Z-0d32b7",
  "org.scalablytyped" %%% "react-transition-group" % "2.0-dt-20190212Z-f660b8",
  "org.scalablytyped" %%% "redux" % "4.0.1-c1f77c",
  "org.scalablytyped" %%% "redux-actions" % "2.3-dt-20190212Z-46323d",
  "org.scalablytyped" %%% "sourcemap-codec" % "1.4.4-fb0c53",
  "org.scalablytyped" %%% "std" % "3.3-6e4388",
  "org.scalablytyped" %%% "symbol-observable" % "1.2.0-3596cc")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        