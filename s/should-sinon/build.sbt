organization := "com.scalablytyped"
name := "should-sinon"
version := "0.0-dt-20181102Z-413c9b"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "should" % "13.2.3-bc9440",
  "com.scalablytyped" %%% "sinon" % "5.0-dt-20181102Z-677e75",
  "com.scalablytyped" %%% "std" % "3.1.6-34214f",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        