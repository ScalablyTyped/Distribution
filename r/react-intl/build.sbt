organization := "org.scalablytyped"
name := "react-intl"
version := "6.2.1-bd88fd"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "csstype" % "3.1.1-9ea52b",
  "org.scalablytyped" %%% "formatjs__ecma402-abstract" % "1.13.0-08da14",
  "org.scalablytyped" %%% "formatjs__icu-messageformat-parser" % "2.1.10-5b2cd3",
  "org.scalablytyped" %%% "formatjs__icu-skeleton-parser" % "1.3.14-ac4d74",
  "org.scalablytyped" %%% "formatjs__intl" % "2.5.1-59d62a",
  "org.scalablytyped" %%% "formatjs__intl-displaynames" % "6.1.4-4ddb91",
  "org.scalablytyped" %%% "formatjs__intl-listformat" % "7.1.3-fb195b",
  "org.scalablytyped" %%% "intl-messageformat" % "10.2.1-417c1f",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20220407Z-115604",
  "org.scalablytyped" %%% "react" % "18.0-dt-20221024Z-9c1cd5",
  "org.scalablytyped" %%% "scheduler" % "0.16-dt-20211202Z-21791a",
  "org.scalablytyped" %%% "std" % "4.8-837c43")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
