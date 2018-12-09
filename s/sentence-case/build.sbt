organization := "org.scalablytyped"
name := "sentence-case"
version := "2.1.1-4478a6"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "lower-case" % "1.1.4-aba1e5",
  "org.scalablytyped" %%% "no-case" % "2.3.2-f19706",
  "org.scalablytyped" %%% "std" % "3.2.2-edfe2b",
  "org.scalablytyped" %%% "upper-case" % "1.1.3-29539b",
  "org.scalablytyped" %%% "upper-case-first" % "1.1.2-5ebddf")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        