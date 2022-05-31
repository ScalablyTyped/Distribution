organization := "org.scalablytyped"
name := "storybook__components"
version := "6.1.2-8189f8"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "csstype" % "2.6.14-dc2f99",
  "org.scalablytyped" %%% "emotion__core" % "10.1.1-65bf16",
  "org.scalablytyped" %%% "emotion__serialize" % "0.11.16-b57f85",
  "org.scalablytyped" %%% "emotion__styled" % "10.0.27-6c7a70",
  "org.scalablytyped" %%% "emotion__styled-base" % "10.0.31-b03afc",
  "org.scalablytyped" %%% "emotion__utils" % "0.11.3-2561dd",
  "org.scalablytyped" %%% "history" % "4.7.2-dt-20201002Z-965ac3",
  "org.scalablytyped" %%% "overlayscrollbars" % "1.12-dt-20200515Z-550fdf",
  "org.scalablytyped" %%% "popperjs__core" % "2.5.4-314868",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20200515Z-3fbed9",
  "org.scalablytyped" %%% "reach__router" % "1.3-dt-20200925Z-09c1b0",
  "org.scalablytyped" %%% "react" % "17.0-dt-20201121Z-4ff700",
  "org.scalablytyped" %%% "react-syntax-highlighter" % "13.5-dt-20201016Z-f54a6e",
  "org.scalablytyped" %%% "std" % "4.1-f7e8ab",
  "org.scalablytyped" %%% "storybook__api" % "6.1.2-f889fc",
  "org.scalablytyped" %%% "storybook__channels" % "6.1.2-481a46",
  "org.scalablytyped" %%% "storybook__router" % "6.1.2-c909f8",
  "org.scalablytyped" %%% "storybook__theming" % "6.1.2-4b16c8")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
