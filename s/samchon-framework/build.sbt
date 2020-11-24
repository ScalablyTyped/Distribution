organization := "org.scalablytyped"
name := "samchon-framework"
version := "2.1.4-3400c8"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "ecol" % "1.1.1-76e1a1",
  "org.scalablytyped" %%% "samchon" % "2.1.4-335834",
  "org.scalablytyped" %%% "std" % "4.1-c651d0",
  "org.scalablytyped" %%% "sxml" % "1.0.4-633466",
  "org.scalablytyped" %%% "tstl" % "2.4.12-6f6b68",
  "org.scalablytyped" %%% "url-variables" % "1.0.3-2df993")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
