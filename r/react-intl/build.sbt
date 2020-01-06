organization := "org.scalablytyped"
name := "react-intl"
version := "3.10.0-0a79b0"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "csstype" % "2.6.6-fd5644",
  "org.scalablytyped" %%% "formatjs__intl-listformat" % "1.3.3-d4df8b",
  "org.scalablytyped" %%% "formatjs__intl-relativetimeformat" % "4.5.3-a32b81",
  "org.scalablytyped" %%% "formatjs__intl-unified-numberformat" % "3.0.0-bd6ed8",
  "org.scalablytyped" %%% "formatjs__intl-utils" % "2.0.0-a08574",
  "org.scalablytyped" %%% "intl-messageformat" % "7.7.5-c659bd",
  "org.scalablytyped" %%% "intl-messageformat-parser" % "3.5.2-3e00f0",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190924Z-b24434",
  "org.scalablytyped" %%% "react" % "16.9-dt-20191220Z-22d23f",
  "org.scalablytyped" %%% "std" % "3.7-b6d959")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        