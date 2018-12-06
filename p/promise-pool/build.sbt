organization := "com.scalablytyped"
name := "promise-pool"
version := "0.0-unknown-dt-20180910Z-5bf826"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "q" % "1.5-dt-20181206Z-726082",
  "com.scalablytyped" %%% "q-retry" % "0.0-unknown-dt-20180910Z-0bd84d",
  "com.scalablytyped" %%% "std" % "3.2.1-4b40fd",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        