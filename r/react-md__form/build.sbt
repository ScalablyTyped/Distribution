organization := "org.scalablytyped"
name := "react-md__form"
version := "5.1.4-a82a68"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "csstype" % "3.1.1-9ea52b",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20220407Z-115604",
  "org.scalablytyped" %%% "react" % "18.0-dt-20221025Z-ca420a",
  "org.scalablytyped" %%% "react-md__button" % "5.1.3-cf205f",
  "org.scalablytyped" %%% "react-md__list" % "5.1.3-d17900",
  "org.scalablytyped" %%% "react-md__portal" % "5.1.0-b16c78",
  "org.scalablytyped" %%% "react-md__states" % "5.1.3-9e0273",
  "org.scalablytyped" %%% "react-md__tooltip" % "5.1.3-df2112",
  "org.scalablytyped" %%% "react-md__transition" % "5.1.3-2c2017",
  "org.scalablytyped" %%% "react-md__utils" % "5.1.3-99b824",
  "org.scalablytyped" %%% "scheduler" % "0.16-dt-20211202Z-21791a",
  "org.scalablytyped" %%% "std" % "4.8-837c43")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
