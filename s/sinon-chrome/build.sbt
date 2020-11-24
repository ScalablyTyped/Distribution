organization := "org.scalablytyped"
name := "sinon-chrome"
version := "v2.2.4-dt-20201002Z-7a81cd"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "chrome" % "0.0-unknown-dt-20201028Z-2371d9",
  "org.scalablytyped" %%% "filesystem" % "0.0-unknown-dt-20201002Z-d32a51",
  "org.scalablytyped" %%% "filewriter" % "0.0-unknown-dt-20201002Z-a2fb33",
  "org.scalablytyped" %%% "har-format" % "1.2-dt-20201030Z-99d44a",
  "org.scalablytyped" %%% "sinon" % "9.0-dt-20201003Z-292bea",
  "org.scalablytyped" %%% "sinonjs__fake-timers" % "6.0-dt-20200925Z-800e51",
  "org.scalablytyped" %%% "std" % "4.1-c651d0")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
