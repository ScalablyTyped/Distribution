organization := "org.scalablytyped"
name := "react-intl"
version := "5.10.4-1c26f5"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.0",
  "org.scalablytyped" %%% "csstype" % "2.6.14-b4f267",
  "org.scalablytyped" %%% "formatjs__ecma402-abstract" % "1.5.0-0e86ba",
  "org.scalablytyped" %%% "formatjs__intl" % "1.4.8-47cfd2",
  "org.scalablytyped" %%% "formatjs__intl-displaynames" % "4.0.0-fd8ee2",
  "org.scalablytyped" %%% "formatjs__intl-listformat" % "5.0.0-95a2d9",
  "org.scalablytyped" %%% "formatjs__intl-relativetimeformat" % "8.0.0-f812bd",
  "org.scalablytyped" %%% "intl-messageformat" % "9.3.19-7556a8",
  "org.scalablytyped" %%% "intl-messageformat-parser" % "6.0.17-da8411",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20200515Z-7dc507",
  "org.scalablytyped" %%% "react" % "17.0-dt-20201121Z-9253ae",
  "org.scalablytyped" %%% "std" % "4.1-40053c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
