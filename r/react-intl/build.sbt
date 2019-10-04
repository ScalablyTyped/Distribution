organization := "org.scalablytyped"
name := "react-intl"
version := "3.3.2-90e944"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "csstype" % "2.6.6-f980df",
  "org.scalablytyped" %%% "formatjs__intl-relativetimeformat" % "4.2.0-cae8ab",
  "org.scalablytyped" %%% "formatjs__intl-unified-numberformat" % "1.0.1-a75b73",
  "org.scalablytyped" %%% "formatjs__intl-utils" % "1.4.0-47f64b",
  "org.scalablytyped" %%% "intl-messageformat" % "7.3.2-7f710d",
  "org.scalablytyped" %%% "intl-messageformat-parser" % "3.2.1-19038c",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190924Z-06c3ac",
  "org.scalablytyped" %%% "react" % "16.9-dt-20191003Z-b3917f",
  "org.scalablytyped" %%% "std" % "3.6-c16502")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        