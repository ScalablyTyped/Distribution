organization := "org.scalablytyped"
name := "react-intl-redux"
version := "v0.1.0-dt-20191111Z-7abe7e"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "csstype" % "2.6.9-2d2033",
  "org.scalablytyped" %%% "formatjs__intl-listformat" % "1.4.1-408ec4",
  "org.scalablytyped" %%% "formatjs__intl-relativetimeformat" % "4.5.9-5aa891",
  "org.scalablytyped" %%% "formatjs__intl-unified-numberformat" % "3.2.0-3a616d",
  "org.scalablytyped" %%% "formatjs__intl-utils" % "2.2.0-c390d6",
  "org.scalablytyped" %%% "hoist-non-react-statics" % "3.3-dt-20190402Z-df39db",
  "org.scalablytyped" %%% "intl-messageformat" % "7.8.4-41569a",
  "org.scalablytyped" %%% "intl-messageformat-parser" % "3.6.4-c9c832",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190924Z-ece683",
  "org.scalablytyped" %%% "react" % "16.9-dt-20200122Z-fc5268",
  "org.scalablytyped" %%% "react-intl" % "3.12.0-077831",
  "org.scalablytyped" %%% "react-redux" % "7.1-dt-20200123Z-f034db",
  "org.scalablytyped" %%% "redux" % "4.0.5-c5ba7d",
  "org.scalablytyped" %%% "std" % "3.8-a0108c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
