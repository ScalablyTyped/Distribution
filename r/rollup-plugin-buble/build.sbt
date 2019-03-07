organization := "org.scalablytyped"
name := "rollup-plugin-buble"
version := "0.19-dt-20190205Z-7d9d8a"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "acorn" % "4.0-dt-20190212Z-2bacf1",
  "org.scalablytyped" %%% "buble" % "0.19-dt-20190127Z-9ba01c",
  "org.scalablytyped" %%% "estree" % "0.0-unknown-dt-20180417Z-756eb7",
  "org.scalablytyped" %%% "magic-string" % "0.25.2-b7c95d",
  "org.scalablytyped" %%% "node" % "11.10-dt-20190302Z-6be09d",
  "org.scalablytyped" %%% "rollup" % "1.5.0-756168",
  "org.scalablytyped" %%% "sourcemap-codec" % "1.4.4-1599b4",
  "org.scalablytyped" %%% "std" % "3.3-05be79")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        