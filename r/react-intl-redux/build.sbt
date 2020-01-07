organization := "org.scalablytyped"
name := "react-intl-redux"
version := "v0.1.0-dt-20191111Z-5930f3"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "csstype" % "2.6.6-fd5644",
  "org.scalablytyped" %%% "formatjs__intl-listformat" % "1.3.3-d4df8b",
  "org.scalablytyped" %%% "formatjs__intl-relativetimeformat" % "4.5.3-a32b81",
  "org.scalablytyped" %%% "formatjs__intl-unified-numberformat" % "3.0.0-bd6ed8",
  "org.scalablytyped" %%% "formatjs__intl-utils" % "2.0.0-a08574",
  "org.scalablytyped" %%% "hoist-non-react-statics" % "3.3-dt-20190402Z-516e80",
  "org.scalablytyped" %%% "intl-messageformat" % "7.8.0-9b1795",
  "org.scalablytyped" %%% "intl-messageformat-parser" % "3.5.2-3e00f0",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190924Z-b24434",
  "org.scalablytyped" %%% "react" % "16.9-dt-20191220Z-22d23f",
  "org.scalablytyped" %%% "react-intl" % "3.10.0-79b0b9",
  "org.scalablytyped" %%% "react-redux" % "7.1-dt-20191018Z-359712",
  "org.scalablytyped" %%% "redux" % "4.0.5-eabae9",
  "org.scalablytyped" %%% "std" % "3.7-b6d959")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        