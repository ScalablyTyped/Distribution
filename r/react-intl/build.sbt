organization := "org.scalablytyped"
name := "react-intl"
version := "3.12.1-3b2448"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "csstype" % "2.6.9-313239",
  "org.scalablytyped" %%% "formatjs__intl-listformat" % "1.4.2-edc79a",
  "org.scalablytyped" %%% "formatjs__intl-relativetimeformat" % "4.5.10-e78e0f",
  "org.scalablytyped" %%% "formatjs__intl-unified-numberformat" % "3.2.0-2a4c4f",
  "org.scalablytyped" %%% "formatjs__intl-utils" % "2.2.0-7a73d7",
  "org.scalablytyped" %%% "intl-messageformat" % "7.8.4-996aac",
  "org.scalablytyped" %%% "intl-messageformat-parser" % "3.6.4-11fe77",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190924Z-11830c",
  "org.scalablytyped" %%% "react" % "16.9-dt-20200409Z-0bc722",
  "org.scalablytyped" %%% "std" % "3.8-9b2470")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
