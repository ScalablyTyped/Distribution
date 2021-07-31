organization := "org.scalablytyped"
name := "storybook-readme"
version := "5.0-dt-20191126Z-a36bac"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "csstype" % "2.6.14-b8d190",
  "org.scalablytyped" %%% "emotion__core" % "10.1.1-9ae3af",
  "org.scalablytyped" %%% "emotion__serialize" % "0.11.16-1f167e",
  "org.scalablytyped" %%% "emotion__styled" % "10.0.27-ed180a",
  "org.scalablytyped" %%% "emotion__styled-base" % "10.0.31-139019",
  "org.scalablytyped" %%% "emotion__utils" % "0.11.3-d9c993",
  "org.scalablytyped" %%% "history" % "4.7.2-dt-20201002Z-9e47d2",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-814aa8",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20200515Z-a12f9a",
  "org.scalablytyped" %%% "qs" % "6.9-dt-20201002Z-42be7a",
  "org.scalablytyped" %%% "reach__router" % "1.3-dt-20200925Z-bad438",
  "org.scalablytyped" %%% "react" % "17.0-dt-20201121Z-c80121",
  "org.scalablytyped" %%% "std" % "4.1-044efb",
  "org.scalablytyped" %%% "storybook__addons" % "6.1.2-a53437",
  "org.scalablytyped" %%% "storybook__api" % "6.1.2-d49d1a",
  "org.scalablytyped" %%% "storybook__channels" % "6.1.2-f854de",
  "org.scalablytyped" %%% "storybook__client-api" % "6.1.2-c36a96",
  "org.scalablytyped" %%% "storybook__react" % "6.1.2-534514",
  "org.scalablytyped" %%% "storybook__router" % "6.1.2-a446d7",
  "org.scalablytyped" %%% "storybook__theming" % "6.1.2-40305b")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
