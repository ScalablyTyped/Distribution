organization := "org.scalablytyped"
name := "redux-little-router"
version := "15.1.2-9b22d1"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "csstype" % "2.6.3-9f8404",
  "org.scalablytyped" %%% "decode-uri-component" % "0.2-dt-20181208Z-9d00d8",
  "org.scalablytyped" %%% "history" % "4.7.2-dt-20190226Z-61c40c",
  "org.scalablytyped" %%% "hoist-non-react-statics" % "3.3-dt-20190304Z-40149a",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20190311Z-601106",
  "org.scalablytyped" %%% "lodash_dot_assign" % "4.2-dt-20190214Z-bf5f16",
  "org.scalablytyped" %%% "node" % "11.11-dt-20190312Z-f6d9fe",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190226Z-f878d0",
  "org.scalablytyped" %%% "query-string" % "6.3.0-468c24",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190312Z-24375e",
  "org.scalablytyped" %%% "react-dom" % "16.8-dt-20190213Z-c52751",
  "org.scalablytyped" %%% "react-redux" % "7.0-dt-20190306Z-2e8449",
  "org.scalablytyped" %%% "recompose" % "0.30-dt-20190225Z-88ca54",
  "org.scalablytyped" %%% "redux" % "4.0.1-18f3a8",
  "org.scalablytyped" %%% "std" % "3.3-ec2942",
  "org.scalablytyped" %%% "strict-uri-encode" % "2.0-dt-20180320Z-1fa9d9",
  "org.scalablytyped" %%% "symbol-observable" % "1.2.0-5b665c",
  "org.scalablytyped" %%% "url-pattern" % "1.0.3-eb0dce")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        