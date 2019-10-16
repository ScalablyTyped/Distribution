organization := "org.scalablytyped"
name := "react-apollo"
version := "3.1.3-ae7bd6"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "apollo-cache" % "1.3.2-53eff6",
  "org.scalablytyped" %%% "apollo-client" % "2.6.4-6ba6f8",
  "org.scalablytyped" %%% "apollo-link" % "1.2.13-05736d",
  "org.scalablytyped" %%% "apollo-utilities" % "1.3.2-eeef6c",
  "org.scalablytyped" %%% "apollo__react-common" % "3.1.3-e8942e",
  "org.scalablytyped" %%% "apollo__react-components" % "3.1.3-01ee00",
  "org.scalablytyped" %%% "apollo__react-hoc" % "3.1.3-5590a1",
  "org.scalablytyped" %%% "apollo__react-hooks" % "3.1.3-0923b7",
  "org.scalablytyped" %%% "apollo__react-ssr" % "3.1.3-ba9fc2",
  "org.scalablytyped" %%% "csstype" % "2.6.6-550e52",
  "org.scalablytyped" %%% "graphql" % "14.5.8-9a82b3",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190924Z-08cc8a",
  "org.scalablytyped" %%% "react" % "16.9-dt-20191015Z-baf60f",
  "org.scalablytyped" %%% "std" % "3.6-b80e7a",
  "org.scalablytyped" %%% "zen-observable" % "0.8-dt-20180618Z-64c4b6",
  "org.scalablytyped" %%% "zen-observable-ts" % "0.8.20-fe506f")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        