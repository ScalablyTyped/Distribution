organization := "org.scalablytyped"
name := "setup-polly-jest"
version := "0.5-dt-20190925Z-0b32e1"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "pollyjs__adapter" % "2.0-dt-20190131Z-1df28a",
  "org.scalablytyped" %%% "pollyjs__core" % "2.6-dt-20190924Z-2bbd36",
  "org.scalablytyped" %%% "pollyjs__persister" % "2.0-dt-20190731Z-db8dad",
  "org.scalablytyped" %%% "std" % "3.6-c16502")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        