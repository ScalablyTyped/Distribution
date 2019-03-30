organization := "org.scalablytyped"
name := "rx-lite-virtualtime"
version := "4.0-dt-20190322Z-8163ba"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "rx-core" % "4.0-dt-20190322Z-2c0673",
  "org.scalablytyped" %%% "rx-core-binding" % "4.0-dt-20190322Z-2dfcc2",
  "org.scalablytyped" %%% "rx-lite" % "4.0-dt-20190322Z-b6b488",
  "org.scalablytyped" %%% "std" % "3.4-d52857")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        