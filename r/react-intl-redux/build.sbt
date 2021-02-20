organization := "org.scalablytyped"
name := "react-intl-redux"
version := "v0.1.0-dt-20200515Z-fc53dd"
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
  "org.scalablytyped" %%% "hoist-non-react-statics" % "3.3-dt-20190402Z-d582cd",
  "org.scalablytyped" %%% "intl-messageformat" % "9.3.19-7556a8",
  "org.scalablytyped" %%% "intl-messageformat-parser" % "6.0.17-da8411",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20200515Z-7dc507",
  "org.scalablytyped" %%% "react" % "17.0-dt-20201121Z-9253ae",
  "org.scalablytyped" %%% "react-intl" % "5.10.4-1c26f5",
  "org.scalablytyped" %%% "react-redux" % "7.1-dt-20201103Z-7da53e",
  "org.scalablytyped" %%% "redux" % "4.0.5-09f522",
  "org.scalablytyped" %%% "std" % "4.1-40053c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
