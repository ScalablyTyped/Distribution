organization := "org.scalablytyped"
name := "react-intl"
version := "3.3.2-3a6793"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "csstype" % "2.6.6-1967d7",
  "org.scalablytyped" %%% "formatjs__intl-relativetimeformat" % "4.2.0-f8ef13",
  "org.scalablytyped" %%% "formatjs__intl-unified-numberformat" % "1.0.1-493788",
  "org.scalablytyped" %%% "formatjs__intl-utils" % "1.4.0-e1aa78",
  "org.scalablytyped" %%% "intl-messageformat" % "7.3.2-481db0",
  "org.scalablytyped" %%% "intl-messageformat-parser" % "3.2.1-f74541",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190924Z-e54803",
  "org.scalablytyped" %%% "react" % "16.9-dt-20191003Z-cca292",
  "org.scalablytyped" %%% "std" % "3.6-abb6d3")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        