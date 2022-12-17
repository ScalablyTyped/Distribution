organization := "org.scalablytyped"
name := "storybook-addon-jsx"
version := "7.0-dt-20220726Z-0c7237"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "csstype" % "3.1.1-4db30e",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-def929",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20220407Z-8a1cd9",
  "org.scalablytyped" %%% "react" % "18.0-dt-20221104Z-cf549b",
  "org.scalablytyped" %%% "scheduler" % "0.16-dt-20211202Z-6206c7",
  "org.scalablytyped" %%% "std" % "4.9-5f989f",
  "org.scalablytyped" %%% "storybook__addons" % "6.5.13-db891b",
  "org.scalablytyped" %%% "storybook__api" % "6.5.13-c61c8d",
  "org.scalablytyped" %%% "storybook__channels" % "6.5.13-6762bb",
  "org.scalablytyped" %%% "storybook__router" % "6.5.13-1fd3f6",
  "org.scalablytyped" %%% "storybook__theming" % "6.5.13-abd429")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
