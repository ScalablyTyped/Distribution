organization := "org.scalablytyped"
name := "react-intl-redux"
version := "v0.1.0-dt-20200515Z-eaad48"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "csstype" % "2.6.14-344a29",
  "org.scalablytyped" %%% "formatjs__ecma402-abstract" % "1.5.0-2f3546",
  "org.scalablytyped" %%% "formatjs__intl" % "1.4.8-a8ebf1",
  "org.scalablytyped" %%% "formatjs__intl-displaynames" % "4.0.0-9e1755",
  "org.scalablytyped" %%% "formatjs__intl-listformat" % "5.0.0-088435",
  "org.scalablytyped" %%% "formatjs__intl-relativetimeformat" % "8.0.0-fabc15",
  "org.scalablytyped" %%% "hoist-non-react-statics" % "3.3-dt-20190402Z-cfe100",
  "org.scalablytyped" %%% "intl-messageformat" % "9.3.19-abdd0e",
  "org.scalablytyped" %%% "intl-messageformat-parser" % "6.0.17-cfbb96",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20200515Z-49dd4c",
  "org.scalablytyped" %%% "react" % "17.0-dt-20201121Z-76d083",
  "org.scalablytyped" %%% "react-intl" % "5.10.4-378c6b",
  "org.scalablytyped" %%% "react-redux" % "7.1-dt-20201103Z-4e7c21",
  "org.scalablytyped" %%% "redux" % "4.0.5-3039e4",
  "org.scalablytyped" %%% "std" % "4.1-2f6855")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
