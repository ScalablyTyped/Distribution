organization := "org.scalablytyped"
name := "sanitize-html"
version := "1.18.2-dt-20190325Z-5a79fd"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "domhandler" % "2.4-dt-20190325Z-30879a",
  "org.scalablytyped" %%% "domutils" % "1.7-dt-20190325Z-95918d",
  "org.scalablytyped" %%% "htmlparser2" % "v3.10.x-dt-20190325Z-3036d0",
  "org.scalablytyped" %%% "node" % "11.12-dt-20190330Z-e2b8de",
  "org.scalablytyped" %%% "std" % "3.4-d52857")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        