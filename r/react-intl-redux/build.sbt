organization := "org.scalablytyped"
name := "react-intl-redux"
version := "v0.1.0-dt-20190806Z-82f3df"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "csstype" % "2.6.6-f01b27",
  "org.scalablytyped" %%% "formatjs__intl-relativetimeformat" % "2.7.0-042355",
  "org.scalablytyped" %%% "hoist-non-react-statics" % "3.3-dt-20190402Z-64c796",
  "org.scalablytyped" %%% "intl-messageformat" % "5.4.3-ee648c",
  "org.scalablytyped" %%% "intl-messageformat-parser" % "2.1.3-7c827c",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190417Z-f929bc",
  "org.scalablytyped" %%% "react" % "16.9-dt-20190815Z-93079a",
  "org.scalablytyped" %%% "react-intl" % "3.1.9-b026e3",
  "org.scalablytyped" %%% "react-redux" % "7.1-dt-20190815Z-7ec9c4",
  "org.scalablytyped" %%% "redux" % "4.0.4-1adc8c",
  "org.scalablytyped" %%% "std" % "3.5-cd493c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        