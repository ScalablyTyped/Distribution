organization := "org.scalablytyped"
name := "react-intl-redux"
version := "v0.1.0-dt-20200515Z-a14434"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "csstype" % "2.6.9-03f85a",
  "org.scalablytyped" %%% "formatjs__intl-listformat" % "1.4.2-c2111c",
  "org.scalablytyped" %%% "formatjs__intl-relativetimeformat" % "4.5.10-f87a5b",
  "org.scalablytyped" %%% "formatjs__intl-unified-numberformat" % "3.2.0-31f22d",
  "org.scalablytyped" %%% "formatjs__intl-utils" % "2.2.0-915d9f",
  "org.scalablytyped" %%% "hoist-non-react-statics" % "3.3-dt-20190402Z-25ab82",
  "org.scalablytyped" %%% "intl-messageformat" % "7.8.4-082a2a",
  "org.scalablytyped" %%% "intl-messageformat-parser" % "3.6.4-346590",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20200515Z-4fb81d",
  "org.scalablytyped" %%% "react" % "16.9-dt-20200515Z-0f8114",
  "org.scalablytyped" %%% "react-intl" % "3.12.1-bc93c0",
  "org.scalablytyped" %%% "react-redux" % "7.1-dt-20200519Z-1d0254",
  "org.scalablytyped" %%% "redux" % "4.0.5-f72eee",
  "org.scalablytyped" %%% "std" % "3.9-18cbeb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
