organization := "org.scalablytyped"
name := "sinon-chrome"
version := "v2.2.4-dt-20201002Z-ee8b0c"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.0",
  "org.scalablytyped" %%% "chrome" % "0.0-unknown-dt-20201028Z-72256e",
  "org.scalablytyped" %%% "filesystem" % "0.0-unknown-dt-20201002Z-4b69db",
  "org.scalablytyped" %%% "filewriter" % "0.0-unknown-dt-20201002Z-f9857e",
  "org.scalablytyped" %%% "har-format" % "1.2-dt-20201030Z-0e2f59",
  "org.scalablytyped" %%% "sinon" % "9.0-dt-20201003Z-bb1238",
  "org.scalablytyped" %%% "sinonjs__fake-timers" % "6.0-dt-20200925Z-4689f3",
  "org.scalablytyped" %%% "std" % "4.1-40053c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
