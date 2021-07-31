organization := "org.scalablytyped"
name := "react-intl-redux"
version := "v0.1.0-dt-20200515Z-80b5ee"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "csstype" % "2.6.14-b8d190",
  "org.scalablytyped" %%% "formatjs__ecma402-abstract" % "1.5.0-b1c558",
  "org.scalablytyped" %%% "formatjs__intl" % "1.4.8-9fa006",
  "org.scalablytyped" %%% "formatjs__intl-displaynames" % "4.0.0-614df9",
  "org.scalablytyped" %%% "formatjs__intl-listformat" % "5.0.0-ef33a2",
  "org.scalablytyped" %%% "formatjs__intl-relativetimeformat" % "8.0.0-e9c176",
  "org.scalablytyped" %%% "hoist-non-react-statics" % "3.3-dt-20190402Z-62515f",
  "org.scalablytyped" %%% "intl-messageformat" % "9.3.19-ba646b",
  "org.scalablytyped" %%% "intl-messageformat-parser" % "6.0.17-6bafb7",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20200515Z-a12f9a",
  "org.scalablytyped" %%% "react" % "17.0-dt-20201121Z-c80121",
  "org.scalablytyped" %%% "react-intl" % "5.10.4-e15f0d",
  "org.scalablytyped" %%% "react-redux" % "7.1-dt-20201103Z-99c5d0",
  "org.scalablytyped" %%% "redux" % "4.0.5-119b89",
  "org.scalablytyped" %%% "std" % "4.1-044efb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
