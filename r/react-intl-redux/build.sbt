organization := "org.scalablytyped"
name := "react-intl-redux"
version := "v0.1.0-dt-20220818Z-2ef44f"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "csstype" % "3.1.1-9b270c",
  "org.scalablytyped" %%% "formatjs__ecma402-abstract" % "1.13.0-f16fc1",
  "org.scalablytyped" %%% "formatjs__icu-messageformat-parser" % "2.1.10-1a78d5",
  "org.scalablytyped" %%% "formatjs__icu-skeleton-parser" % "1.3.14-4da719",
  "org.scalablytyped" %%% "formatjs__intl" % "2.5.1-58d26d",
  "org.scalablytyped" %%% "formatjs__intl-displaynames" % "6.1.4-38c839",
  "org.scalablytyped" %%% "formatjs__intl-listformat" % "7.1.3-5570d3",
  "org.scalablytyped" %%% "intl-messageformat" % "10.2.1-8b4d02",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20220407Z-9c1d48",
  "org.scalablytyped" %%% "react" % "18.0-dt-20221104Z-c1aa2f",
  "org.scalablytyped" %%% "react-intl" % "6.2.1-15d01a",
  "org.scalablytyped" %%% "redux" % "4.2.0-17c5bf",
  "org.scalablytyped" %%% "scheduler" % "0.16-dt-20211202Z-fd69ea",
  "org.scalablytyped" %%% "std" % "4.9-ecb5eb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
