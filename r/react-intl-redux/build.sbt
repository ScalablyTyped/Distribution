organization := "org.scalablytyped"
name := "react-intl-redux"
version := "v0.1.0-dt-20190806Z-eba172"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "csstype" % "2.6.6-550e52",
  "org.scalablytyped" %%% "formatjs__intl-relativetimeformat" % "4.2.0-6fd796",
  "org.scalablytyped" %%% "formatjs__intl-unified-numberformat" % "1.0.1-2a3ece",
  "org.scalablytyped" %%% "formatjs__intl-utils" % "1.4.0-86ff36",
  "org.scalablytyped" %%% "hoist-non-react-statics" % "3.3-dt-20190402Z-70ad1c",
  "org.scalablytyped" %%% "intl-messageformat" % "7.3.2-6b5c92",
  "org.scalablytyped" %%% "intl-messageformat-parser" % "3.2.1-1efa31",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190924Z-08cc8a",
  "org.scalablytyped" %%% "react" % "16.9-dt-20191015Z-baf60f",
  "org.scalablytyped" %%% "react-intl" % "3.3.2-3f98e4",
  "org.scalablytyped" %%% "react-redux" % "7.1-dt-20190926Z-f568a3",
  "org.scalablytyped" %%% "redux" % "4.0.4-8412ae",
  "org.scalablytyped" %%% "std" % "3.6-b80e7a")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        