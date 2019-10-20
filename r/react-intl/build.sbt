organization := "org.scalablytyped"
name := "react-intl"
version := "3.3.2-5257cd"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "csstype" % "2.6.6-550e52",
  "org.scalablytyped" %%% "formatjs__intl-relativetimeformat" % "4.2.0-6fd796",
  "org.scalablytyped" %%% "formatjs__intl-unified-numberformat" % "1.0.1-2a3ece",
  "org.scalablytyped" %%% "formatjs__intl-utils" % "1.4.0-86ff36",
  "org.scalablytyped" %%% "intl-messageformat" % "7.3.2-6b5c92",
  "org.scalablytyped" %%% "intl-messageformat-parser" % "3.2.1-1efa31",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190924Z-08cc8a",
  "org.scalablytyped" %%% "react" % "16.9-dt-20191016Z-462cf8",
  "org.scalablytyped" %%% "std" % "3.6-b80e7a")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        