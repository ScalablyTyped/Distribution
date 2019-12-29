organization := "org.scalablytyped"
name := "react-apollo"
version := "3.1.3-682e8f"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "apollo-cache" % "1.3.4-591438",
  "org.scalablytyped" %%% "apollo-client" % "2.6.8-92ebc9",
  "org.scalablytyped" %%% "apollo-link" % "1.2.13-2b791a",
  "org.scalablytyped" %%% "apollo-utilities" % "1.3.2-3c1460",
  "org.scalablytyped" %%% "apollo__react-common" % "3.1.3-28f3cb",
  "org.scalablytyped" %%% "apollo__react-components" % "3.1.3-ec1fe2",
  "org.scalablytyped" %%% "apollo__react-hoc" % "3.1.3-fe3c49",
  "org.scalablytyped" %%% "apollo__react-hooks" % "3.1.3-d45c57",
  "org.scalablytyped" %%% "apollo__react-ssr" % "3.1.3-9b0dd8",
  "org.scalablytyped" %%% "csstype" % "2.6.6-32adec",
  "org.scalablytyped" %%% "graphql" % "14.5.8-8daf73",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190924Z-bfe2c5",
  "org.scalablytyped" %%% "react" % "16.9-dt-20191220Z-73a5bc",
  "org.scalablytyped" %%% "std" % "3.7-953338",
  "org.scalablytyped" %%% "zen-observable" % "0.8-dt-20180618Z-7a2667",
  "org.scalablytyped" %%% "zen-observable-ts" % "0.8.20-6da803")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        