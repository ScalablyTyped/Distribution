organization := "org.scalablytyped"
name := "qiniu"
version := "7.2.1-f2e6f1"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "agentkeepalive" % "4.0.2-6a0d9e",
  "org.scalablytyped" %%% "debug" % "4.1-dt-20190328Z-74c562",
  "org.scalablytyped" %%% "depd" % "1.1-dt-20181116Z-6f19c7",
  "org.scalablytyped" %%% "encodeurl" % "1.0-dt-20181224Z-c2d21e",
  "org.scalablytyped" %%% "humanize-ms" % "1.2-dt-20190305Z-e9bb14",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-2631f3",
  "org.scalablytyped" %%% "node" % "11.13-dt-20190408Z-6fa8bf",
  "org.scalablytyped" %%% "std" % "3.4-d52857",
  "org.scalablytyped" %%% "urllib" % "2.28-dt-20190212Z-ad687d")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        