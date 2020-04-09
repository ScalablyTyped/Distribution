organization := "org.scalablytyped"
name := "react-intl"
version := "3.12.1-0461ca"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "csstype" % "2.6.9-2d2033",
  "org.scalablytyped" %%% "formatjs__intl-listformat" % "1.4.2-7d6ecf",
  "org.scalablytyped" %%% "formatjs__intl-relativetimeformat" % "4.5.10-c6c0c8",
  "org.scalablytyped" %%% "formatjs__intl-unified-numberformat" % "3.2.0-3a616d",
  "org.scalablytyped" %%% "formatjs__intl-utils" % "2.2.0-c390d6",
  "org.scalablytyped" %%% "intl-messageformat" % "7.8.4-41569a",
  "org.scalablytyped" %%% "intl-messageformat-parser" % "3.6.4-c9c832",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190924Z-ece683",
  "org.scalablytyped" %%% "react" % "16.9-dt-20200402Z-6f4338",
  "org.scalablytyped" %%% "std" % "3.8-a0108c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
