organization := "com.scalablytyped"
name := "rx-lite-time"
version := "4.0-dt-20180910Z-7f8ab3"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "rx-core" % "4.0-dt-20180910Z-b87bbc",
  "com.scalablytyped" %%% "rx-core-binding" % "4.0-dt-20180910Z-df7bfe",
  "com.scalablytyped" %%% "rx-lite" % "4.0-dt-20181018Z-3db92b",
  "com.scalablytyped" %%% "std" % "3.2.1-4b40fd",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        