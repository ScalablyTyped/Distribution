organization := "org.scalablytyped"
name := "rollup-plugin-node-resolve"
version := "4.0-dt-20190121Z-3b657d"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "acorn" % "4.0-dt-20181219Z-343245",
  "org.scalablytyped" %%% "estree" % "0.0-unknown-dt-20180417Z-2db6a8",
  "org.scalablytyped" %%% "node" % "10.12-dt-20190206Z-9f73ab",
  "org.scalablytyped" %%% "resolve" % "0.0-unknown-dt-20180507Z-db6ef7",
  "org.scalablytyped" %%% "rollup" % "1.1.2-cd8a10",
  "org.scalablytyped" %%% "std" % "3.3-0ec965")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        