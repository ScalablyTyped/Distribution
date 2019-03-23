organization := "org.scalablytyped"
name := "rx-lite-async"
version := "4.0-dt-20181116Z-95167b"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "rx-core" % "4.0-dt-20190322Z-d2f95e",
  "org.scalablytyped" %%% "rx-core-binding" % "4.0-dt-20190322Z-e4a896",
  "org.scalablytyped" %%% "rx-lite" % "4.0-dt-20190322Z-ed58e1",
  "org.scalablytyped" %%% "std" % "3.3-ec2942")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        