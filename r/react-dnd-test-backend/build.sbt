organization := "com.scalablytyped"
name := "react-dnd-test-backend"
version := "5.0.1-94d560"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "asap" % "2.0-dt-20181102Z-f47b18",
  "com.scalablytyped" %%% "dnd-core" % "4.0.5-bde972",
  "com.scalablytyped" %%% "invariant" % "2.2.0-dt-20181102Z-6e50ec",
  "com.scalablytyped" %%% "lodash" % "4.14-dt-20181109Z-67570f",
  "com.scalablytyped" %%% "redux" % "4.0.1-f538df",
  "com.scalablytyped" %%% "std" % "3.1.6-34214f",
  "com.scalablytyped" %%% "symbol-observable" % "1.2.0-998bd5",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        