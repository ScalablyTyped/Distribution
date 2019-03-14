organization := "org.scalablytyped"
name := "rollup-plugin-buble"
version := "0.19-dt-20190312Z-6b7728"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "acorn" % "4.0-dt-20190212Z-65c855",
  "org.scalablytyped" %%% "buble" % "0.19-dt-20190312Z-d35a96",
  "org.scalablytyped" %%% "estree" % "0.0-unknown-dt-20180417Z-154c1f",
  "org.scalablytyped" %%% "magic-string" % "0.25.2-f3a8e8",
  "org.scalablytyped" %%% "node" % "11.11-dt-20190313Z-f6d9fe",
  "org.scalablytyped" %%% "rollup" % "1.6.0-b457ef",
  "org.scalablytyped" %%% "sourcemap-codec" % "1.4.4-0be230",
  "org.scalablytyped" %%% "std" % "3.3-ec2942")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        