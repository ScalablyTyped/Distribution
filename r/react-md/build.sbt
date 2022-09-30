organization := "org.scalablytyped"
name := "react-md"
version := "5.1.4-cf9700"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "csstype" % "3.1.1-0912f8",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20220407Z-975e63",
  "org.scalablytyped" %%% "react" % "18.0-dt-20220922Z-fc8273",
  "org.scalablytyped" %%% "react-md__alert" % "5.1.3-a23da6",
  "org.scalablytyped" %%% "react-md__app-bar" % "5.1.3-6a0e70",
  "org.scalablytyped" %%% "react-md__autocomplete" % "5.1.4-413fad",
  "org.scalablytyped" %%% "react-md__avatar" % "5.1.3-2e8dbd",
  "org.scalablytyped" %%% "react-md__badge" % "5.1.3-ce6062",
  "org.scalablytyped" %%% "react-md__button" % "5.1.3-f22d36",
  "org.scalablytyped" %%% "react-md__card" % "5.1.3-167050",
  "org.scalablytyped" %%% "react-md__chip" % "5.1.3-35248c",
  "org.scalablytyped" %%% "react-md__dialog" % "5.1.3-1ba5b6",
  "org.scalablytyped" %%% "react-md__divider" % "5.1.3-423430",
  "org.scalablytyped" %%% "react-md__expansion-panel" % "5.1.3-399c63",
  "org.scalablytyped" %%% "react-md__form" % "5.1.4-2aa310",
  "org.scalablytyped" %%% "react-md__icon" % "5.1.3-698a1a",
  "org.scalablytyped" %%% "react-md__layout" % "5.1.4-cb257f",
  "org.scalablytyped" %%% "react-md__link" % "5.1.4-21567e",
  "org.scalablytyped" %%% "react-md__list" % "5.1.3-d72fc9",
  "org.scalablytyped" %%% "react-md__media" % "5.1.3-bad03c",
  "org.scalablytyped" %%% "react-md__menu" % "5.1.4-ec27f6",
  "org.scalablytyped" %%% "react-md__overlay" % "5.1.3-76c4d4",
  "org.scalablytyped" %%% "react-md__portal" % "5.1.0-32345e",
  "org.scalablytyped" %%% "react-md__progress" % "5.1.3-a16966",
  "org.scalablytyped" %%% "react-md__sheet" % "5.1.3-19ce67",
  "org.scalablytyped" %%% "react-md__states" % "5.1.3-0a087e",
  "org.scalablytyped" %%% "react-md__table" % "5.1.4-804144",
  "org.scalablytyped" %%% "react-md__tabs" % "5.1.3-73dda5",
  "org.scalablytyped" %%% "react-md__tooltip" % "5.1.3-eccd1a",
  "org.scalablytyped" %%% "react-md__transition" % "5.1.3-db0d2b",
  "org.scalablytyped" %%% "react-md__tree" % "5.1.4-8e21fb",
  "org.scalablytyped" %%% "react-md__typography" % "5.1.3-187501",
  "org.scalablytyped" %%% "react-md__utils" % "5.1.3-d98296",
  "org.scalablytyped" %%% "scheduler" % "0.16-dt-20211202Z-3fbb8c",
  "org.scalablytyped" %%% "std" % "4.8-9f8efb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
