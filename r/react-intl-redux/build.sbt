organization := "org.scalablytyped"
name := "react-intl-redux"
version := "v0.1.0-dt-20190806Z-27cdbf"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "csstype" % "2.6.6-c240ab",
  "org.scalablytyped" %%% "formatjs__intl-relativetimeformat" % "2.8.1-47d3fa",
  "org.scalablytyped" %%% "hoist-non-react-statics" % "3.3-dt-20190402Z-40d3fd",
  "org.scalablytyped" %%% "intl-messageformat" % "5.4.3-9f5a3b",
  "org.scalablytyped" %%% "intl-messageformat-parser" % "2.1.3-b53f6a",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190417Z-f929bc",
  "org.scalablytyped" %%% "react" % "16.9-dt-20190815Z-847c1a",
  "org.scalablytyped" %%% "react-intl" % "3.1.11-b7dc73",
  "org.scalablytyped" %%% "react-redux" % "7.1-dt-20190815Z-8575e0",
  "org.scalablytyped" %%% "redux" % "4.0.4-64bc3e",
  "org.scalablytyped" %%% "std" % "3.5-cd493c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        