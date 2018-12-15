organization := "org.scalablytyped"
name := "router5-transition-path"
version := "5.4.0-5ea6b8"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "path-parser" % "4.2.0-e4bf73",
  "org.scalablytyped" %%% "route-node" % "3.4.2-e51f63",
  "org.scalablytyped" %%% "router5" % "6.6.3-c4c377",
  "org.scalablytyped" %%% "search-params" % "2.1.3-6bc80d",
  "org.scalablytyped" %%% "std" % "3.2.2-beaa2f",
  "org.scalablytyped" %%% "symbol-observable" % "1.2.0-f84511")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        