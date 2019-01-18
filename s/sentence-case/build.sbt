organization := "org.scalablytyped"
name := "sentence-case"
version := "2.1.1-4a415a"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "lower-case" % "1.1.4-7dfd7c",
  "org.scalablytyped" %%% "no-case" % "2.3.2-35ee62",
  "org.scalablytyped" %%% "std" % "3.2.4-2926f1",
  "org.scalablytyped" %%% "upper-case" % "1.1.3-614681",
  "org.scalablytyped" %%% "upper-case-first" % "1.1.2-6367d6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        