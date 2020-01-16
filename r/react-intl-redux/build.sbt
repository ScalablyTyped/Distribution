organization := "org.scalablytyped"
name := "react-intl-redux"
version := "v0.1.0-dt-20191111Z-a69753"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "csstype" % "2.6.6-fd5644",
  "org.scalablytyped" %%% "formatjs__intl-listformat" % "1.3.7-31260a",
  "org.scalablytyped" %%% "formatjs__intl-relativetimeformat" % "4.5.7-ae06a7",
  "org.scalablytyped" %%% "formatjs__intl-unified-numberformat" % "3.0.4-8bcd30",
  "org.scalablytyped" %%% "formatjs__intl-utils" % "2.0.4-f8e8e6",
  "org.scalablytyped" %%% "hoist-non-react-statics" % "3.3-dt-20190402Z-516e80",
  "org.scalablytyped" %%% "intl-messageformat" % "7.8.2-cceebc",
  "org.scalablytyped" %%% "intl-messageformat-parser" % "3.6.2-898a7b",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190924Z-b24434",
  "org.scalablytyped" %%% "react" % "16.9-dt-20191220Z-22d23f",
  "org.scalablytyped" %%% "react-intl" % "3.11.0-1f893e",
  "org.scalablytyped" %%% "react-redux" % "7.1-dt-20200115Z-6406ce",
  "org.scalablytyped" %%% "redux" % "4.0.5-eabae9",
  "org.scalablytyped" %%% "std" % "3.7-b6d959")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        