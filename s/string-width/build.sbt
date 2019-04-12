organization := "org.scalablytyped"
name := "string-width"
version := "4.1.0-5e0468"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "ansi-regex" % "4.0-dt-20181220Z-1c76d2",
  "org.scalablytyped" %%% "emoji-regex" % "7.0-dt-20190212Z-c838af",
  "org.scalablytyped" %%% "is-fullwidth-code-point" % "3.0.0-bd318a",
  "org.scalablytyped" %%% "std" % "3.4-d52857",
  "org.scalablytyped" %%% "strip-ansi" % "5.2.0-0ac2ec")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        