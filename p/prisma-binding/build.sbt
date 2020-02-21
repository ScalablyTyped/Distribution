organization := "org.scalablytyped"
name := "prisma-binding"
version := "2.3.16-7a68ec"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "apollo-link" % "1.2.13-aa671f",
  "org.scalablytyped" %%% "ava" % "2.4.0-da0d65",
  "org.scalablytyped" %%% "graphql" % "14.6.0-800d77",
  "org.scalablytyped" %%% "graphql-binding" % "2.5.2-8dd185",
  "org.scalablytyped" %%% "graphql-tools" % "4.0.6-0718f3",
  "org.scalablytyped" %%% "std" % "3.7-1b8369",
  "org.scalablytyped" %%% "zen-observable-ts" % "0.8.20-17d6b8")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
