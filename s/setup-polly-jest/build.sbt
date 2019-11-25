organization := "org.scalablytyped"
name := "setup-polly-jest"
version := "0.5-dt-20190925Z-e9ddf4"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "pollyjs__adapter" % "2.0-dt-20190131Z-728f39",
  "org.scalablytyped" %%% "pollyjs__core" % "2.6-dt-20190924Z-072cbe",
  "org.scalablytyped" %%% "pollyjs__persister" % "2.0-dt-20190731Z-718e5f",
  "org.scalablytyped" %%% "std" % "3.7-1d724d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        