organization := "org.scalablytyped"
name := "react-apollo"
version := "3.1.3-ee61f3"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "apollo-cache" % "1.3.4-b73408",
  "org.scalablytyped" %%% "apollo-client" % "2.6.8-00b217",
  "org.scalablytyped" %%% "apollo-link" % "1.2.13-092388",
  "org.scalablytyped" %%% "apollo-utilities" % "1.3.2-f5a978",
  "org.scalablytyped" %%% "apollo__react-common" % "3.1.3-9c9a81",
  "org.scalablytyped" %%% "apollo__react-components" % "3.1.3-fd36fc",
  "org.scalablytyped" %%% "apollo__react-hoc" % "3.1.3-71e199",
  "org.scalablytyped" %%% "apollo__react-hooks" % "3.1.3-1822c1",
  "org.scalablytyped" %%% "apollo__react-ssr" % "3.1.3-81aa2c",
  "org.scalablytyped" %%% "csstype" % "2.6.6-fd5644",
  "org.scalablytyped" %%% "graphql" % "14.5.8-216385",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190924Z-b24434",
  "org.scalablytyped" %%% "react" % "16.9-dt-20191220Z-22d23f",
  "org.scalablytyped" %%% "std" % "3.7-b6d959",
  "org.scalablytyped" %%% "zen-observable" % "0.8-dt-20180618Z-fc589c",
  "org.scalablytyped" %%% "zen-observable-ts" % "0.8.20-f75794")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        