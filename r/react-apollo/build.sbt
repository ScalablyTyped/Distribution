organization := "org.scalablytyped"
name := "react-apollo"
version := "2.5.6-605905"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "apollo-cache" % "1.3.2-f74883",
  "org.scalablytyped" %%% "apollo-client" % "2.6.2-b1c149",
  "org.scalablytyped" %%% "apollo-link" % "1.2.11-bede40",
  "org.scalablytyped" %%% "apollo-utilities" % "1.3.0-eeefd3",
  "org.scalablytyped" %%% "csstype" % "2.6.5-3bfbc5",
  "org.scalablytyped" %%% "graphql" % "14.2-dt-20190616Z-a68a9c",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190417Z-4b3bf2",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190613Z-62c565",
  "org.scalablytyped" %%% "std" % "3.5-c5d119",
  "org.scalablytyped" %%% "zen-observable" % "0.8-dt-20180618Z-cea422",
  "org.scalablytyped" %%% "zen-observable-ts" % "0.8.18-4da704")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        