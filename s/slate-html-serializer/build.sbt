organization := "org.scalablytyped"
name := "slate-html-serializer"
version := "0.6-dt-20181217Z-7c5814"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "csstype" % "2.6.5-8a2cd0",
  "org.scalablytyped" %%% "immutable" % "4.0.0-rc.12-70f5d8",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190417Z-c843c9",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190528Z-1fde1d",
  "org.scalablytyped" %%% "slate" % "0.44-dt-20190608Z-ae1d1a",
  "org.scalablytyped" %%% "std" % "3.5-f010ac")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        