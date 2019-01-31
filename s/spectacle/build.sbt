organization := "org.scalablytyped"
name := "spectacle"
version := "5.4.0-03a5d6"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "buble" % "0.19-dt-20190127Z-5698a8",
  "org.scalablytyped" %%% "core-js" % "2.5-dt-20180921Z-f27478",
  "org.scalablytyped" %%% "create-emotion" % "10.0.6-5f6c4d",
  "org.scalablytyped" %%% "create-react-context" % "0.2.2-b43647",
  "org.scalablytyped" %%% "csstype" % "2.5.8-ae54dc",
  "org.scalablytyped" %%% "deep-object-diff" % "1.1.0-15a215",
  "org.scalablytyped" %%% "emotion" % "10.0.6-967697",
  "org.scalablytyped" %%% "emotion__cache" % "10.0.0-29e67f",
  "org.scalablytyped" %%% "emotion__serialize" % "0.11.3-b0d52e",
  "org.scalablytyped" %%% "emotion__sheet" % "0.9.2-b29e92",
  "org.scalablytyped" %%% "emotion__utils" % "0.11.1-3ca007",
  "org.scalablytyped" %%% "history" % "4.7.2-dt-20181017Z-846ff9",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20190116Z-e5b16b",
  "org.scalablytyped" %%% "magic-string" % "0.25.1-20e4fc",
  "org.scalablytyped" %%% "node" % "10.12-dt-20190129Z-92720c",
  "org.scalablytyped" %%% "prismjs" % "1.9-dt-20180214Z-0a5e18",
  "org.scalablytyped" %%% "prop-types" % "15.5-dt-20181212Z-d610b9",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190131Z-997ec6",
  "org.scalablytyped" %%% "react-dom" % "16.0-dt-20181127Z-e377db",
  "org.scalablytyped" %%% "react-live" % "1.12.0-6885db",
  "org.scalablytyped" %%% "react-redux" % "7.0-dt-20190124Z-8195ae",
  "org.scalablytyped" %%% "react-transition-group" % "2.0-dt-20181219Z-84400a",
  "org.scalablytyped" %%% "redux" % "4.0.1-607317",
  "org.scalablytyped" %%% "redux-actions" % "2.3-dt-20181009Z-72c9db",
  "org.scalablytyped" %%% "sourcemap-codec" % "1.4.4-a1fda7",
  "org.scalablytyped" %%% "std" % "3.3.1-6e0314",
  "org.scalablytyped" %%% "symbol-observable" % "1.2.0-607a2a")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        