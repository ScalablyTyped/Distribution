organization := "org.scalablytyped"
name := "spectacle"
version := "5.4.0-84e8c4"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "buble" % "0.19-dt-20190127Z-9ba01c",
  "org.scalablytyped" %%% "core-js" % "2.5-dt-20180921Z-e810cb",
  "org.scalablytyped" %%% "create-emotion" % "10.0.7-fadd08",
  "org.scalablytyped" %%% "create-react-context" % "0.2.2-5eebed",
  "org.scalablytyped" %%% "csstype" % "2.6.3-60f3ea",
  "org.scalablytyped" %%% "deep-object-diff" % "1.1.0-b13796",
  "org.scalablytyped" %%% "emotion" % "10.0.7-88e93f",
  "org.scalablytyped" %%% "emotion__cache" % "10.0.7-a901f7",
  "org.scalablytyped" %%% "emotion__serialize" % "0.11.4-aa01a6",
  "org.scalablytyped" %%% "emotion__sheet" % "0.9.2-3f3db3",
  "org.scalablytyped" %%% "emotion__utils" % "0.11.1-002494",
  "org.scalablytyped" %%% "history" % "4.7.2-dt-20190226Z-e317ff",
  "org.scalablytyped" %%% "hoist-non-react-statics" % "3.3-dt-20190304Z-421c03",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20190227Z-56553a",
  "org.scalablytyped" %%% "magic-string" % "0.25.2-b7c95d",
  "org.scalablytyped" %%% "node" % "11.11-dt-20190307Z-7720a8",
  "org.scalablytyped" %%% "prismjs" % "1.9-dt-20190212Z-9302b9",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190226Z-0b0b5e",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190306Z-d5c6e1",
  "org.scalablytyped" %%% "react-dom" % "16.8-dt-20190213Z-768022",
  "org.scalablytyped" %%% "react-live" % "1.12.0-4f857e",
  "org.scalablytyped" %%% "react-redux" % "7.0-dt-20190306Z-5b6975",
  "org.scalablytyped" %%% "react-transition-group" % "2.0-dt-20190212Z-66a389",
  "org.scalablytyped" %%% "redux" % "4.0.1-03a2e6",
  "org.scalablytyped" %%% "redux-actions" % "2.3-dt-20190212Z-55f536",
  "org.scalablytyped" %%% "sourcemap-codec" % "1.4.4-1599b4",
  "org.scalablytyped" %%% "std" % "3.3-05be79",
  "org.scalablytyped" %%% "symbol-observable" % "1.2.0-bfac6c")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        