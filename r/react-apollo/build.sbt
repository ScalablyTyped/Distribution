organization := "org.scalablytyped"
name := "react-apollo"
version := "2.5.6-9efc52"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "apollo-cache" % "1.3.2-3a5478",
  "org.scalablytyped" %%% "apollo-client" % "2.6.2-d0023a",
  "org.scalablytyped" %%% "apollo-link" % "1.2.11-d56c94",
  "org.scalablytyped" %%% "apollo-utilities" % "1.3.0-feec3d",
  "org.scalablytyped" %%% "csstype" % "2.6.5-3bfbc5",
  "org.scalablytyped" %%% "graphql" % "14.2-dt-20190329Z-1af13e",
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
        