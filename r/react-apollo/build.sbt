organization := "org.scalablytyped"
name := "react-apollo"
version := "2.5.6-e2215f"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "apollo-cache" % "1.3.0-69d39f",
  "org.scalablytyped" %%% "apollo-client" % "2.6.0-c0b40c",
  "org.scalablytyped" %%% "apollo-link" % "1.2.11-527c94",
  "org.scalablytyped" %%% "apollo-utilities" % "1.3.0-0833cd",
  "org.scalablytyped" %%% "csstype" % "2.6.4-a0e5c1",
  "org.scalablytyped" %%% "graphql" % "14.2-dt-20190329Z-3e2174",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190417Z-b94c72",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190528Z-1cea03",
  "org.scalablytyped" %%% "std" % "3.4-ef47bb",
  "org.scalablytyped" %%% "zen-observable" % "0.8-dt-20180618Z-e95603",
  "org.scalablytyped" %%% "zen-observable-ts" % "0.8.18-508485")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        