organization := "org.scalablytyped"
name := "slate-base64-serializer"
version := "0.2-dt-20181024Z-7fadae"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "immutable" % "4.0.0-rc.12-62b8d0",
  "org.scalablytyped" %%% "slate" % "0.44-dt-20190410Z-0074aa",
  "org.scalablytyped" %%% "std" % "3.4-6f75bc")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        