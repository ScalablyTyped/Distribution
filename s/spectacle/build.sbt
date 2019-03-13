organization := "org.scalablytyped"
name := "spectacle"
version := "5.4.0-20be6f"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "buble" % "0.19-dt-20190312Z-d35a96",
  "org.scalablytyped" %%% "core-js" % "2.5-dt-20180921Z-40d19f",
  "org.scalablytyped" %%% "create-emotion" % "10.0.9-4cdd7a",
  "org.scalablytyped" %%% "create-react-context" % "0.2.2-318046",
  "org.scalablytyped" %%% "csstype" % "2.6.3-9f8404",
  "org.scalablytyped" %%% "deep-object-diff" % "1.1.0-4db081",
  "org.scalablytyped" %%% "emotion" % "10.0.9-f4c08e",
  "org.scalablytyped" %%% "emotion__cache" % "10.0.9-ac19e6",
  "org.scalablytyped" %%% "emotion__serialize" % "0.11.6-aea39f",
  "org.scalablytyped" %%% "emotion__sheet" % "0.9.2-0bc9ce",
  "org.scalablytyped" %%% "emotion__utils" % "0.11.1-41b917",
  "org.scalablytyped" %%% "history" % "4.7.2-dt-20190226Z-61c40c",
  "org.scalablytyped" %%% "hoist-non-react-statics" % "3.3-dt-20190304Z-40149a",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20190311Z-601106",
  "org.scalablytyped" %%% "magic-string" % "0.25.2-f3a8e8",
  "org.scalablytyped" %%% "node" % "11.11-dt-20190312Z-f6d9fe",
  "org.scalablytyped" %%% "prismjs" % "1.9-dt-20190212Z-cae4f9",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190226Z-f878d0",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190312Z-24375e",
  "org.scalablytyped" %%% "react-dom" % "16.8-dt-20190213Z-c52751",
  "org.scalablytyped" %%% "react-live" % "1.12.0-879b34",
  "org.scalablytyped" %%% "react-redux" % "7.0-dt-20190306Z-2e8449",
  "org.scalablytyped" %%% "react-transition-group" % "2.0-dt-20190212Z-bf3f8b",
  "org.scalablytyped" %%% "redux" % "4.0.1-18f3a8",
  "org.scalablytyped" %%% "redux-actions" % "2.3-dt-20190212Z-c29c06",
  "org.scalablytyped" %%% "sourcemap-codec" % "1.4.4-0be230",
  "org.scalablytyped" %%% "std" % "3.3-ec2942",
  "org.scalablytyped" %%% "symbol-observable" % "1.2.0-5b665c")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        