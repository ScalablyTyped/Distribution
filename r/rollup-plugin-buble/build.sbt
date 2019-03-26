organization := "org.scalablytyped"
name := "rollup-plugin-buble"
version := "0.19-dt-20190312Z-225721"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "acorn" % "4.0-dt-20190212Z-073681",
  "org.scalablytyped" %%% "buble" % "0.19-dt-20190312Z-809733",
  "org.scalablytyped" %%% "estree" % "0.0-unknown-dt-20190322Z-3dc8da",
  "org.scalablytyped" %%% "magic-string" % "0.25.2-d64629",
  "org.scalablytyped" %%% "node" % "11.11-dt-20190325Z-000e7b",
  "org.scalablytyped" %%% "rollup" % "1.7.3-d27a0f",
  "org.scalablytyped" %%% "sourcemap-codec" % "1.4.4-82c968",
  "org.scalablytyped" %%% "std" % "3.3-14e863")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        