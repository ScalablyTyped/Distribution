organization := "com.scalablytyped"
name := "sentence-case"
version := "2.1.1-bde442"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "lower-case" % "1.1.4-7a65c7",
  "com.scalablytyped" %%% "no-case" % "2.3.2-aaaa3f",
  "com.scalablytyped" %%% "std" % "3.1.6-34214f",
  "com.scalablytyped" %%% "upper-case" % "1.1.3-7482b2",
  "com.scalablytyped" %%% "upper-case-first" % "1.1.2-6f6a0d",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        