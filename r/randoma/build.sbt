organization := "org.scalablytyped"
name := "randoma"
version := "1.2-dt-20181209Z-7abecc"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "color" % "3.0-dt-20180214Z-ff5f3f",
  "org.scalablytyped" %%% "color-convert" % "1.9-dt-20180214Z-5b0400",
  "org.scalablytyped" %%% "color-name" % "1.1-dt-20190212Z-3e24ed",
  "org.scalablytyped" %%% "std" % "3.4-ef47bb")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        