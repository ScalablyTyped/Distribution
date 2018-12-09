organization := "org.scalablytyped"
name := "rx-lite-coincidence"
version := "4.0-dt-20180910Z-b03c0a"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "rx-core" % "4.0-dt-20180910Z-77094b",
  "org.scalablytyped" %%% "rx-core-binding" % "4.0-dt-20180910Z-480d98",
  "org.scalablytyped" %%% "rx-lite" % "4.0-dt-20181018Z-3a7981",
  "org.scalablytyped" %%% "std" % "3.2.2-edfe2b")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        