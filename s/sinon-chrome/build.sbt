organization := "org.scalablytyped"
name := "sinon-chrome"
version := "v2.2.4-dt-20200312Z-ae796a"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "chrome" % "0.0-unknown-dt-20200318Z-a80a5a",
  "org.scalablytyped" %%% "filesystem" % "0.0-unknown-dt-20200225Z-0b7aec",
  "org.scalablytyped" %%% "filewriter" % "0.0-unknown-dt-20200226Z-e61265",
  "org.scalablytyped" %%% "sinon" % "7.5-dt-20200225Z-c633f6",
  "org.scalablytyped" %%% "std" % "3.8-a0108c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
