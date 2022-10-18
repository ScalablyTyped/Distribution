organization := "org.scalablytyped"
name := "react-md__form"
version := "5.1.4-a57186"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "csstype" % "3.1.1-775404",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20220407Z-4c7983",
  "org.scalablytyped" %%% "react" % "18.0-dt-20220922Z-bacd1f",
  "org.scalablytyped" %%% "react-md__button" % "5.1.3-7331e1",
  "org.scalablytyped" %%% "react-md__list" % "5.1.3-a4f0a1",
  "org.scalablytyped" %%% "react-md__portal" % "5.1.0-ad161b",
  "org.scalablytyped" %%% "react-md__states" % "5.1.3-f29a53",
  "org.scalablytyped" %%% "react-md__tooltip" % "5.1.3-5aa159",
  "org.scalablytyped" %%% "react-md__transition" % "5.1.3-662207",
  "org.scalablytyped" %%% "react-md__utils" % "5.1.3-4264c5",
  "org.scalablytyped" %%% "scheduler" % "0.16-dt-20211202Z-400bee",
  "org.scalablytyped" %%% "std" % "4.8-3c7765")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
