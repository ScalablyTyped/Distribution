organization := "org.scalablytyped"
name := "rollup-plugin-buble"
version := "0.19-dt-20190205Z-89e0c1"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "acorn" % "4.0-dt-20190212Z-f0fa85",
  "org.scalablytyped" %%% "buble" % "0.19-dt-20190127Z-f288a9",
  "org.scalablytyped" %%% "estree" % "0.0-unknown-dt-20180417Z-dfeccf",
  "org.scalablytyped" %%% "magic-string" % "0.25.2-0fc128",
  "org.scalablytyped" %%% "node" % "11.9-dt-20190222Z-99335f",
  "org.scalablytyped" %%% "rollup" % "1.4.0-63cbff",
  "org.scalablytyped" %%% "sourcemap-codec" % "1.4.4-fb0c53",
  "org.scalablytyped" %%% "std" % "3.3-6e4388")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        