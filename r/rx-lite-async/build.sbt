organization := "org.scalablytyped"
name := "rx-lite-async"
version := "4.0-dt-20181116Z-f57cf9"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "rx-core" % "4.0-dt-20180214Z-42cbcd",
  "org.scalablytyped" %%% "rx-core-binding" % "4.0-dt-20180214Z-390e4d",
  "org.scalablytyped" %%% "rx-lite" % "4.0-dt-20181017Z-30a111",
  "org.scalablytyped" %%% "std" % "3.2.2-2926f1")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        