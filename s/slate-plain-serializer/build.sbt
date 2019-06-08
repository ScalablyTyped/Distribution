organization := "org.scalablytyped"
name := "slate-plain-serializer"
version := "0.6-dt-20181024Z-7a2730"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "immutable" % "4.0.0-rc.12-70f5d8",
  "org.scalablytyped" %%% "slate" % "0.44-dt-20190608Z-ae1d1a",
  "org.scalablytyped" %%% "std" % "3.5-f010ac")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        