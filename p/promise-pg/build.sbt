organization := "org.scalablytyped"
name := "promise-pg"
version := "0.0-unknown-dt-20180214Z-146893"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "moment" % "2.24.0-cd7f45",
  "org.scalablytyped" %%% "node" % "10.12-dt-20190129Z-92720c",
  "org.scalablytyped" %%% "pg" % "7.4-dt-20181008Z-1f053a",
  "org.scalablytyped" %%% "pg-types" % "1.11-dt-20180214Z-8967fb",
  "org.scalablytyped" %%% "q" % "1.5-dt-20181124Z-b7ac87",
  "org.scalablytyped" %%% "std" % "3.3.1-6e0314")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        