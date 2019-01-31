organization := "org.scalablytyped"
name := "static-eval"
version := "v0.2.4-dt-20180214Z-1efe87"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "esprima" % "4.0-dt-20180501Z-acfa5b",
  "org.scalablytyped" %%% "estree" % "0.0-unknown-dt-20180417Z-9eedda",
  "org.scalablytyped" %%% "std" % "3.3.1-6e0314")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        