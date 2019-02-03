organization := "org.scalablytyped"
name := "rx-lite-virtualtime"
version := "4.0-dt-20180214Z-c96529"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "rx-core" % "4.0-dt-20180214Z-604f43",
  "org.scalablytyped" %%% "rx-core-binding" % "4.0-dt-20180214Z-7bea92",
  "org.scalablytyped" %%% "rx-lite" % "4.0-dt-20181017Z-e126f2",
  "org.scalablytyped" %%% "std" % "3.3-0ec965")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        