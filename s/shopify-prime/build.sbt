organization := "org.scalablytyped"
name := "shopify-prime"
version := "2.11.0-6fb634"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "crypto-js" % "v3.1.8-dt-20180910Z-40a6ec",
  "org.scalablytyped" %%% "jsuri" % "1.3-dt-20180910Z-40c883",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181213Z-bd3349",
  "org.scalablytyped" %%% "node-fetch" % "2.1-dt-20181120Z-4dc81b",
  "org.scalablytyped" %%% "std" % "3.2.2-04ea79",
  "org.scalablytyped" %%% "url-join" % "v0.8.3-dt-20180910Z-044eea")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        