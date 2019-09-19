organization := "org.scalablytyped"
name := "react-intl-redux"
version := "v0.1.0-dt-20190806Z-9670d1"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "csstype" % "2.6.6-f980df",
  "org.scalablytyped" %%% "formatjs__intl-relativetimeformat" % "3.1.0-bd2b1b",
  "org.scalablytyped" %%% "formatjs__intl-unified-numberformat" % "0.5.2-45b972",
  "org.scalablytyped" %%% "formatjs__intl-utils" % "1.1.1-7545c0",
  "org.scalablytyped" %%% "hoist-non-react-statics" % "3.3-dt-20190402Z-d5d73d",
  "org.scalablytyped" %%% "intl-messageformat" % "5.4.3-b8923c",
  "org.scalablytyped" %%% "intl-messageformat-parser" % "2.1.3-a6564a",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190903Z-bd378a",
  "org.scalablytyped" %%% "react" % "16.9-dt-20190917Z-53b9fb",
  "org.scalablytyped" %%% "react-intl" % "3.2.3-7e37b1",
  "org.scalablytyped" %%% "react-redux" % "7.1-dt-20190815Z-442a4d",
  "org.scalablytyped" %%% "redux" % "4.0.4-a121b5",
  "org.scalablytyped" %%% "std" % "3.6-c16502")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        