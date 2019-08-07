organization := "org.scalablytyped"
name := "react-intl-redux"
version := "v0.1.0-dt-20190806Z-00dc41"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "csstype" % "2.6.6-7e82e4",
  "org.scalablytyped" %%% "formatjs__intl-relativetimeformat" % "2.5.2-86738f",
  "org.scalablytyped" %%% "hoist-non-react-statics" % "3.3-dt-20190402Z-ad2921",
  "org.scalablytyped" %%% "intl-messageformat" % "5.4.3-5ebb5e",
  "org.scalablytyped" %%% "intl-messageformat-parser" % "2.1.3-30e832",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190417Z-f48590",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190731Z-e8f22e",
  "org.scalablytyped" %%% "react-intl" % "3.1.1-cdeb0a",
  "org.scalablytyped" %%% "react-redux" % "7.1-dt-20190627Z-76b9d9",
  "org.scalablytyped" %%% "redux" % "4.0.4-567508",
  "org.scalablytyped" %%% "std" % "3.5-65dbfc")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        