organization := "org.scalablytyped"
name := "randoma"
version := "1.3.0-1b186b"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "color" % "3.0-dt-20191014Z-1ad1fc",
  "org.scalablytyped" %%% "color-convert" % "1.9-dt-20180214Z-bc6b4f",
  "org.scalablytyped" %%% "color-name" % "1.1-dt-20190212Z-2eaba2",
  "org.scalablytyped" %%% "std" % "3.7-1c17cf")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        