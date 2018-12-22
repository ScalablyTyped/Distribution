organization := "org.scalablytyped"
name := "static-eval"
version := "v0.2.4-dt-20180214Z-c6d88b"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "esprima" % "4.0-dt-20180501Z-bf60d4",
  "org.scalablytyped" %%% "estree" % "0.0-unknown-dt-20180417Z-b77e5b",
  "org.scalablytyped" %%% "std" % "3.2.2-669a73")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        