organization := "org.scalablytyped"
name := "react-intl-redux"
version := "v0.1.0-dt-20191111Z-3ab25d"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "csstype" % "2.6.6-ffacbb",
  "org.scalablytyped" %%% "formatjs__intl-displaynames" % "1.2.0-a57264",
  "org.scalablytyped" %%% "formatjs__intl-listformat" % "1.4.1-04e5c0",
  "org.scalablytyped" %%% "formatjs__intl-relativetimeformat" % "4.5.9-ee00f9",
  "org.scalablytyped" %%% "formatjs__intl-unified-numberformat" % "3.2.0-56864f",
  "org.scalablytyped" %%% "formatjs__intl-utils" % "2.2.0-edddcf",
  "org.scalablytyped" %%% "hoist-non-react-statics" % "3.3-dt-20190402Z-ee4622",
  "org.scalablytyped" %%% "intl-messageformat" % "7.8.4-3bdb27",
  "org.scalablytyped" %%% "intl-messageformat-parser" % "3.6.4-40a278",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190924Z-05a52c",
  "org.scalablytyped" %%% "react" % "16.9-dt-20200122Z-b17eee",
  "org.scalablytyped" %%% "react-intl" % "3.12.0-504f90",
  "org.scalablytyped" %%% "react-redux" % "7.1-dt-20200123Z-2bd320",
  "org.scalablytyped" %%% "redux" % "4.0.5-d8211d",
  "org.scalablytyped" %%% "std" % "3.7-1b8369")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
