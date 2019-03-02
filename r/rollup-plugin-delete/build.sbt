organization := "org.scalablytyped"
name := "rollup-plugin-delete"
version := "0.2-dt-20190129Z-864349"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "acorn" % "4.0-dt-20190212Z-f0fa85",
  "org.scalablytyped" %%% "del" % "3.0-dt-20180311Z-928a5e",
  "org.scalablytyped" %%% "estree" % "0.0-unknown-dt-20180417Z-dfeccf",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20180920Z-105e95",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180214Z-8c05a2",
  "org.scalablytyped" %%% "node" % "11.10-dt-20190228Z-bb7734",
  "org.scalablytyped" %%% "rollup" % "1.4.0-6be8d9",
  "org.scalablytyped" %%% "std" % "3.3-6e4388")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        