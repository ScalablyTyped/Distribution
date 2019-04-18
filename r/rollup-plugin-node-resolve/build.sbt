organization := "org.scalablytyped"
name := "rollup-plugin-node-resolve"
version := "4.2.3-6153c1"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "estree" % "0.0-unknown-dt-20190322Z-ef0969",
  "org.scalablytyped" %%% "node" % "11.13-dt-20190417Z-002402",
  "org.scalablytyped" %%% "resolve" % "0.0-unknown-dt-20190322Z-aebad0",
  "org.scalablytyped" %%% "rollup" % "1.10.0-17f819",
  "org.scalablytyped" %%% "std" % "3.4-6f75bc")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        