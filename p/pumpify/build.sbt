organization := "org.scalablytyped"
name := "pumpify"
version := "1.4-dt-20181017Z-ae6941"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "duplexify" % "3.6-dt-20181030Z-83bf6e",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190606Z-b7fe68",
  "org.scalablytyped" %%% "std" % "3.5-f010ac")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        