organization := "org.scalablytyped"
name := "sinon-chrome"
version := "v2.2.4-dt-20200519Z-ee0963"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "chrome" % "0.0-unknown-dt-20200624Z-1fb86a",
  "org.scalablytyped" %%% "filesystem" % "0.0-unknown-dt-20200515Z-5f4145",
  "org.scalablytyped" %%% "filewriter" % "0.0-unknown-dt-20200515Z-414428",
  "org.scalablytyped" %%% "har-format" % "1.2-dt-20200515Z-b35915",
  "org.scalablytyped" %%% "sinon" % "9.0-dt-20200521Z-56f27e",
  "org.scalablytyped" %%% "sinonjs__fake-timers" % "6.0-dt-20200331Z-88541a",
  "org.scalablytyped" %%% "std" % "3.9-c9f1f8")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
