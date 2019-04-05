organization := "org.scalablytyped"
name := "rollup-typescript"
version := "1.2.0-8bed95"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "braces" % "2.3-dt-20180214Z-306649",
  "org.scalablytyped" %%% "estree-walker" % "0.6.0-a6bc97",
  "org.scalablytyped" %%% "micromatch" % "3.1-dt-20180214Z-64a8b0",
  "org.scalablytyped" %%% "rollup-pluginutils" % "2.6.0-a3b9ab",
  "org.scalablytyped" %%% "std" % "3.4-d52857",
  "org.scalablytyped" %%% "tslib" % "1.9.3-446b32",
  "org.scalablytyped" %%% "typescript" % "3.4.1-a42773")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        