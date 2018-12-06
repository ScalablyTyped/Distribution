organization := "org.scalablytyped"
name := "rx-lite-aggregates"
version := "4.0-dt-20180910Z-a50f0c"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "rx-core" % "4.0-dt-20180910Z-45a578",
  "org.scalablytyped" %%% "rx-core-binding" % "4.0-dt-20180910Z-714f18",
  "org.scalablytyped" %%% "rx-lite" % "4.0-dt-20181018Z-9bc129",
  "org.scalablytyped" %%% "std" % "3.2.1-edfe2b")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        