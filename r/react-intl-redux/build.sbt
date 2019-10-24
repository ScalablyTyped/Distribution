organization := "org.scalablytyped"
name := "react-intl-redux"
version := "v0.1.0-dt-20190806Z-aac9dd"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "csstype" % "2.6.6-550e52",
  "org.scalablytyped" %%% "formatjs__intl-relativetimeformat" % "4.2.1-397221",
  "org.scalablytyped" %%% "formatjs__intl-unified-numberformat" % "2.1.0-cc75e3",
  "org.scalablytyped" %%% "formatjs__intl-utils" % "1.4.0-86ff36",
  "org.scalablytyped" %%% "hoist-non-react-statics" % "3.3-dt-20190402Z-2511bb",
  "org.scalablytyped" %%% "intl-messageformat" % "7.3.3-34976b",
  "org.scalablytyped" %%% "intl-messageformat-parser" % "3.2.2-f42e36",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190924Z-08cc8a",
  "org.scalablytyped" %%% "react" % "16.9-dt-20191016Z-462cf8",
  "org.scalablytyped" %%% "react-intl" % "3.4.0-a981ba",
  "org.scalablytyped" %%% "react-redux" % "7.1-dt-20191018Z-e9b2f2",
  "org.scalablytyped" %%% "redux" % "4.0.4-783f8a",
  "org.scalablytyped" %%% "std" % "3.6-b80e7a")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        