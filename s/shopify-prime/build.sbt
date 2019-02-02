organization := "org.scalablytyped"
name := "shopify-prime"
version := "2.12.0-c9e247"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "crypto-js" % "v3.1.8-dt-20180725Z-6e457a",
  "org.scalablytyped" %%% "jsuri" % "1.3-dt-20180214Z-928378",
  "org.scalablytyped" %%% "node" % "10.12-dt-20190129Z-8da1df",
  "org.scalablytyped" %%% "node-fetch" % "2.1-dt-20190130Z-351386",
  "org.scalablytyped" %%% "std" % "3.3.1-6e0314",
  "org.scalablytyped" %%% "url-join" % "4.0-dt-20181231Z-e64b45")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        