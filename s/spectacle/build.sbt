organization := "org.scalablytyped"
name := "spectacle"
version := "5.4.0-b11108"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "buble" % "0.19-dt-20190127Z-7df1c1",
  "org.scalablytyped" %%% "core-js" % "2.5-dt-20180921Z-02a18b",
  "org.scalablytyped" %%% "create-emotion" % "10.0.6-4b43dd",
  "org.scalablytyped" %%% "create-react-context" % "0.2.2-6d11f9",
  "org.scalablytyped" %%% "csstype" % "2.5.8-36deb1",
  "org.scalablytyped" %%% "deep-object-diff" % "1.1.0-aebb0e",
  "org.scalablytyped" %%% "emotion" % "10.0.6-6b5a06",
  "org.scalablytyped" %%% "emotion__cache" % "10.0.0-6f2455",
  "org.scalablytyped" %%% "emotion__serialize" % "0.11.3-d8dd23",
  "org.scalablytyped" %%% "emotion__sheet" % "0.9.2-dd3e6b",
  "org.scalablytyped" %%% "emotion__utils" % "0.11.1-d43e80",
  "org.scalablytyped" %%% "history" % "4.7.2-dt-20181017Z-ee6730",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20190116Z-c48db4",
  "org.scalablytyped" %%% "magic-string" % "0.25.1-f8f470",
  "org.scalablytyped" %%% "node" % "10.12-dt-20190129Z-40209e",
  "org.scalablytyped" %%% "prismjs" % "1.9-dt-20180214Z-fdff22",
  "org.scalablytyped" %%% "prop-types" % "15.5-dt-20181212Z-e51e1e",
  "org.scalablytyped" %%% "react" % "16.7-dt-20190128Z-cfd22c",
  "org.scalablytyped" %%% "react-dom" % "16.0-dt-20181127Z-40bb02",
  "org.scalablytyped" %%% "react-live" % "1.12.0-51a445",
  "org.scalablytyped" %%% "react-redux" % "7.0-dt-20190124Z-00f73a",
  "org.scalablytyped" %%% "react-transition-group" % "2.0-dt-20181219Z-773aad",
  "org.scalablytyped" %%% "redux" % "4.0.1-0f174c",
  "org.scalablytyped" %%% "redux-actions" % "2.3-dt-20181009Z-17c97c",
  "org.scalablytyped" %%% "sourcemap-codec" % "1.4.4-b81bed",
  "org.scalablytyped" %%% "std" % "3.2.4-2926f1",
  "org.scalablytyped" %%% "symbol-observable" % "1.2.0-bc5916")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        