organization := "org.scalablytyped"
name := "rx-lite-testing"
version := "4.0-dt-20180910Z-27766f"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "rx-core" % "4.0-dt-20180910Z-9a7fbb",
  "org.scalablytyped" %%% "rx-core-binding" % "4.0-dt-20180910Z-1bda7e",
  "org.scalablytyped" %%% "rx-lite" % "4.0-dt-20181018Z-5b5635",
  "org.scalablytyped" %%% "rx-lite-virtualtime" % "4.0-dt-20180910Z-863d71",
  "org.scalablytyped" %%% "std" % "3.2.2-04ea79")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        