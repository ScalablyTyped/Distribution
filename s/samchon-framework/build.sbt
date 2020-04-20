organization := "org.scalablytyped"
name := "samchon-framework"
version := "2.1.4-fa3fb0"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "ecol" % "1.1.1-7a9d75",
  "org.scalablytyped" %%% "samchon" % "2.1.4-3ac02d",
  "org.scalablytyped" %%% "std" % "3.8-9b2470",
  "org.scalablytyped" %%% "sxml" % "1.0.4-10e24c",
  "org.scalablytyped" %%% "tstl" % "2.4.6-83073a",
  "org.scalablytyped" %%% "url-variables" % "1.0.3-7ba65f")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
