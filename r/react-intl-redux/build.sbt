organization := "org.scalablytyped"
name := "react-intl-redux"
version := "v0.1.0-dt-20191111Z-bb4d59"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "csstype" % "2.6.6-3eaa6f",
  "org.scalablytyped" %%% "formatjs__intl-listformat" % "1.2.4-f3182d",
  "org.scalablytyped" %%% "formatjs__intl-relativetimeformat" % "4.4.3-9d5387",
  "org.scalablytyped" %%% "formatjs__intl-unified-numberformat" % "2.1.4-9f2065",
  "org.scalablytyped" %%% "formatjs__intl-utils" % "1.4.2-2bdd44",
  "org.scalablytyped" %%% "hoist-non-react-statics" % "3.3-dt-20190402Z-202a38",
  "org.scalablytyped" %%% "intl-messageformat" % "7.5.5-519503",
  "org.scalablytyped" %%% "intl-messageformat-parser" % "3.2.4-6a0d50",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190924Z-8b44d5",
  "org.scalablytyped" %%% "react" % "16.9-dt-20191122Z-caf4d8",
  "org.scalablytyped" %%% "react-intl" % "3.6.2-ee6c10",
  "org.scalablytyped" %%% "react-redux" % "7.1-dt-20191018Z-0755fc",
  "org.scalablytyped" %%% "redux" % "4.0.4-ae4e73",
  "org.scalablytyped" %%% "std" % "3.7-1c17cf")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        