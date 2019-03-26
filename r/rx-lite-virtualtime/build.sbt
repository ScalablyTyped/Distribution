organization := "org.scalablytyped"
name := "rx-lite-virtualtime"
version := "4.0-dt-20190322Z-c35828"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "rx-core" % "4.0-dt-20190322Z-b04dfb",
  "org.scalablytyped" %%% "rx-core-binding" % "4.0-dt-20190322Z-4f6022",
  "org.scalablytyped" %%% "rx-lite" % "4.0-dt-20190322Z-af0be6",
  "org.scalablytyped" %%% "std" % "3.3-14e863")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        