organization := "org.scalablytyped"
name := "sinon-chrome"
version := "v2.2.4-dt-20200331Z-9e5b2d"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "chrome" % "0.0-unknown-dt-20200327Z-9bf1c7",
  "org.scalablytyped" %%% "filesystem" % "0.0-unknown-dt-20200225Z-0b7aec",
  "org.scalablytyped" %%% "filewriter" % "0.0-unknown-dt-20200226Z-e61265",
  "org.scalablytyped" %%% "har-format" % "1.2-dt-20190213Z-547015",
  "org.scalablytyped" %%% "sinon" % "9.0-dt-20200331Z-9f9551",
  "org.scalablytyped" %%% "sinonjs__fake-timers" % "6.0-dt-20200331Z-c019e4",
  "org.scalablytyped" %%% "std" % "3.8-a0108c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
