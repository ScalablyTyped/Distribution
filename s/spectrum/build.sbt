organization := "org.scalablytyped"
name := "spectrum"
version := "1.5.1-dt-20180910Z-fe96f6"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "jquery" % "3.3-dt-20181209Z-928df5",
  "org.scalablytyped" %%% "sizzle" % "2.3-dt-20181008Z-081654",
  "org.scalablytyped" %%% "std" % "3.2.2-edfe2b",
  "org.scalablytyped" %%% "tinycolor2" % "1.4-dt-20180910Z-c98bcd")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        