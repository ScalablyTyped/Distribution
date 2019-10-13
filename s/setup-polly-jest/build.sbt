organization := "org.scalablytyped"
name := "setup-polly-jest"
version := "0.5-dt-20190925Z-7d53b7"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "pollyjs__adapter" % "2.0-dt-20190131Z-878ae5",
  "org.scalablytyped" %%% "pollyjs__core" % "2.6-dt-20190924Z-f0ca41",
  "org.scalablytyped" %%% "pollyjs__persister" % "2.0-dt-20190731Z-f87232",
  "org.scalablytyped" %%% "std" % "3.6-b80e7a")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        