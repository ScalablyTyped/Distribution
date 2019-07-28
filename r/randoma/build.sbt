organization := "org.scalablytyped"
name := "randoma"
version := "1.3.0-57453d"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "color" % "3.0-dt-20180214Z-51001c",
  "org.scalablytyped" %%% "color-convert" % "1.9-dt-20180214Z-0c96e7",
  "org.scalablytyped" %%% "color-name" % "1.1-dt-20190212Z-1c79ec",
  "org.scalablytyped" %%% "std" % "3.5-65dbfc")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        