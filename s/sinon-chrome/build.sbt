organization := "org.scalablytyped"
name := "sinon-chrome"
version := "v2.2.4-dt-20190322Z-631b74"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "chrome" % "0.0-unknown-dt-20190322Z-8a8093",
  "org.scalablytyped" %%% "filesystem" % "0.0-unknown-dt-20190322Z-4e473b",
  "org.scalablytyped" %%% "filewriter" % "0.0-unknown-dt-20190322Z-856437",
  "org.scalablytyped" %%% "sinon" % "7.0-dt-20190330Z-4c2dfb",
  "org.scalablytyped" %%% "std" % "3.4-d52857")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        