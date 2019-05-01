organization := "org.scalablytyped"
name := "randoma"
version := "1.2-dt-20181209Z-2d3827"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "color" % "3.0-dt-20180214Z-39792f",
  "org.scalablytyped" %%% "color-convert" % "1.9-dt-20180214Z-0fac1d",
  "org.scalablytyped" %%% "color-name" % "1.1-dt-20190212Z-9bbace",
  "org.scalablytyped" %%% "std" % "3.4-495f93")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        