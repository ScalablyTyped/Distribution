organization := "org.scalablytyped"
name := "react-intl"
version := "3.7.0-3b8453"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "csstype" % "2.6.6-a93afc",
  "org.scalablytyped" %%% "formatjs__intl-listformat" % "1.2.6-9c9e80",
  "org.scalablytyped" %%% "formatjs__intl-relativetimeformat" % "4.4.5-1d9a8f",
  "org.scalablytyped" %%% "formatjs__intl-unified-numberformat" % "2.1.6-31563c",
  "org.scalablytyped" %%% "formatjs__intl-utils" % "1.4.3-b55916",
  "org.scalablytyped" %%% "intl-messageformat" % "7.6.0-128800",
  "org.scalablytyped" %%% "intl-messageformat-parser" % "3.3.0-438cec",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190924Z-5cddf8",
  "org.scalablytyped" %%% "react" % "16.9-dt-20191123Z-d1d56f",
  "org.scalablytyped" %%% "std" % "3.7-1d724d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        