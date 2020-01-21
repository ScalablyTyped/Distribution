organization := "org.scalablytyped"
name := "randoma"
version := "1.3.0-3ccb3a"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "color" % "3.0-dt-20200102Z-c6c103",
  "org.scalablytyped" %%% "color-convert" % "1.9-dt-20191126Z-5b4a24",
  "org.scalablytyped" %%% "color-name" % "1.1-dt-20190212Z-b0113d",
  "org.scalablytyped" %%% "std" % "3.7-96076c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        