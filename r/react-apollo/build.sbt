organization := "org.scalablytyped"
name := "react-apollo"
version := "2.5.8-e8d5e0"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "apollo-cache" % "1.3.2-79109a",
  "org.scalablytyped" %%% "apollo-client" % "2.6.4-a88802",
  "org.scalablytyped" %%% "apollo-link" % "1.2.12-16bcb2",
  "org.scalablytyped" %%% "apollo-utilities" % "1.3.2-f46fa0",
  "org.scalablytyped" %%% "csstype" % "2.6.6-7e82e4",
  "org.scalablytyped" %%% "graphql" % "14.2-dt-20190722Z-fd24a4",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190417Z-f48590",
  "org.scalablytyped" %%% "react" % "16.9-dt-20190815Z-46401f",
  "org.scalablytyped" %%% "std" % "3.5-65dbfc",
  "org.scalablytyped" %%% "zen-observable" % "0.8-dt-20180618Z-e871b5",
  "org.scalablytyped" %%% "zen-observable-ts" % "0.8.19-871dff")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        