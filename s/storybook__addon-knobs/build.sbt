organization := "org.scalablytyped"
name := "storybook__addon-knobs"
version := "6.4.0-db81bf"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "csstype" % "3.1.1-0912f8",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20220407Z-975e63",
  "org.scalablytyped" %%% "react" % "18.0-dt-20220922Z-fc8273",
  "org.scalablytyped" %%% "scheduler" % "0.16-dt-20211202Z-3fbb8c",
  "org.scalablytyped" %%% "std" % "4.8-9f8efb",
  "org.scalablytyped" %%% "storybook__api" % "6.5.12-8c8427",
  "org.scalablytyped" %%% "storybook__channels" % "6.5.12-315b3f",
  "org.scalablytyped" %%% "storybook__router" % "6.5.12-3609e1",
  "org.scalablytyped" %%% "storybook__theming" % "6.5.12-17779e")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
