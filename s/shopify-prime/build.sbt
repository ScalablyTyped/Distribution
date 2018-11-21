organization := "com.scalablytyped"
name := "shopify-prime"
version := "2.10.0-b8a89a"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "crypto-js" % "v3.1.8-dt-20180910Z-00e45f",
  "com.scalablytyped" %%% "jsuri" % "1.3-dt-20180910Z-92cec3",
  "com.scalablytyped" %%% "node" % "10.12-dt-20181116Z-cadd20",
  "com.scalablytyped" %%% "node-fetch" % "2.1-dt-20181120Z-1f4e97",
  "com.scalablytyped" %%% "std" % "3.1.3-0b55f4",
  "com.scalablytyped" %%% "url-join" % "v0.8.3-dt-20180910Z-e716a5",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        