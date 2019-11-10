organization := "org.scalablytyped"
name := "react-intl-redux"
version := "v0.1.0-dt-20190806Z-cdabf2"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "csstype" % "2.6.6-3eaa6f",
  "org.scalablytyped" %%% "formatjs__intl-listformat" % "1.2.2-19524e",
  "org.scalablytyped" %%% "formatjs__intl-relativetimeformat" % "4.4.1-36d5e4",
  "org.scalablytyped" %%% "formatjs__intl-unified-numberformat" % "2.1.1-a2dda6",
  "org.scalablytyped" %%% "formatjs__intl-utils" % "1.4.0-adedb9",
  "org.scalablytyped" %%% "hoist-non-react-statics" % "3.3-dt-20190402Z-e5e42d",
  "org.scalablytyped" %%% "intl-messageformat" % "7.5.1-b95a00",
  "org.scalablytyped" %%% "intl-messageformat-parser" % "3.2.2-01f04d",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190924Z-8b44d5",
  "org.scalablytyped" %%% "react" % "16.9-dt-20191025Z-132fef",
  "org.scalablytyped" %%% "react-intl" % "3.5.0-8e1765",
  "org.scalablytyped" %%% "react-redux" % "7.1-dt-20191018Z-f1ed5d",
  "org.scalablytyped" %%% "redux" % "4.0.4-ae4e73",
  "org.scalablytyped" %%% "std" % "3.7-1c17cf")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        