organization := "org.scalablytyped"
name := "router5-transition-path"
version := "5.4.0-4f37a8"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "path-parser" % "4.2.0-ab43c3",
  "org.scalablytyped" %%% "route-node" % "3.4.2-3dd977",
  "org.scalablytyped" %%% "router5" % "6.6.2-dea5c6",
  "org.scalablytyped" %%% "search-params" % "2.1.3-260cf7",
  "org.scalablytyped" %%% "std" % "3.2.2-edfe2b",
  "org.scalablytyped" %%% "symbol-observable" % "1.2.0-e3ebb0")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        