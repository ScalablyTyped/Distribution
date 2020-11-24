organization := "org.scalablytyped"
name := "redux-sentry-middleware"
version := "0.1-dt-20200914Z-e6e145"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "redux" % "4.0.5-1401a8",
  "org.scalablytyped" %%% "sentry__browser" % "5.27.4-720b36",
  "org.scalablytyped" %%% "sentry__core" % "5.27.4-d1a425",
  "org.scalablytyped" %%% "sentry__hub" % "5.27.4-2bdcd0",
  "org.scalablytyped" %%% "sentry__types" % "5.27.4-6c408e",
  "org.scalablytyped" %%% "sentry__utils" % "5.27.4-40999c",
  "org.scalablytyped" %%% "std" % "4.1-c651d0")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
