organization := "org.scalablytyped"
name := "react-apollo"
version := "3.1.5-76f223"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "apollo-cache" % "1.3.4-d05591",
  "org.scalablytyped" %%% "apollo-client" % "2.6.8-91abb1",
  "org.scalablytyped" %%% "apollo-link" % "1.2.13-d0a417",
  "org.scalablytyped" %%% "apollo-utilities" % "1.3.3-0cd7af",
  "org.scalablytyped" %%% "apollo__react-common" % "3.1.4-8ac501",
  "org.scalablytyped" %%% "apollo__react-components" % "3.1.5-fbbf5c",
  "org.scalablytyped" %%% "apollo__react-hoc" % "3.1.5-28dbf2",
  "org.scalablytyped" %%% "apollo__react-hooks" % "3.1.5-7e445f",
  "org.scalablytyped" %%% "apollo__react-ssr" % "3.1.5-0c8b91",
  "org.scalablytyped" %%% "csstype" % "2.6.9-313239",
  "org.scalablytyped" %%% "graphql" % "14.6.0-d18599",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190924Z-11830c",
  "org.scalablytyped" %%% "react" % "16.9-dt-20200409Z-0bc722",
  "org.scalablytyped" %%% "std" % "3.8-9b2470",
  "org.scalablytyped" %%% "zen-observable" % "0.8-dt-20200225Z-4986bc",
  "org.scalablytyped" %%% "zen-observable-ts" % "0.8.20-c6e790")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
