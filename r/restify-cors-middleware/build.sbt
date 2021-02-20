organization := "org.scalablytyped"
name := "restify-cors-middleware"
version := "1.0-dt-20200515Z-7c7a36"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.0",
  "org.scalablytyped" %%% "bunyan" % "1.8-dt-20200515Z-642e90",
  "org.scalablytyped" %%% "formidable" % "1.0.16-dt-20201002Z-cd44e9",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-50d3d9",
  "org.scalablytyped" %%% "restify" % "8.4-dt-20201028Z-45069e",
  "org.scalablytyped" %%% "spdy" % "3.4-dt-20200227Z-ad4b4f",
  "org.scalablytyped" %%% "std" % "4.1-40053c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
