organization := "org.scalablytyped"
name := "react-md"
version := "2.4.3-1cd271"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "csstype" % "2.6.14-344a29",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20200515Z-49dd4c",
  "org.scalablytyped" %%% "react" % "17.0-dt-20201121Z-76d083",
  "org.scalablytyped" %%% "react-md__alert" % "2.4.2-0d5f78",
  "org.scalablytyped" %%% "react-md__app-bar" % "2.4.2-9ddd88",
  "org.scalablytyped" %%% "react-md__autocomplete" % "2.4.3-add081",
  "org.scalablytyped" %%% "react-md__avatar" % "2.4.2-d325e1",
  "org.scalablytyped" %%% "react-md__badge" % "2.4.2-2ab2bb",
  "org.scalablytyped" %%% "react-md__button" % "2.4.2-15ff25",
  "org.scalablytyped" %%% "react-md__card" % "2.4.2-f82a7e",
  "org.scalablytyped" %%% "react-md__chip" % "2.4.2-bc0aec",
  "org.scalablytyped" %%% "react-md__dialog" % "2.4.2-9aa700",
  "org.scalablytyped" %%% "react-md__divider" % "2.4.2-78cbaf",
  "org.scalablytyped" %%% "react-md__expansion-panel" % "2.4.2-20ecf9",
  "org.scalablytyped" %%% "react-md__form" % "2.4.3-bb7977",
  "org.scalablytyped" %%% "react-md__icon" % "2.4.2-86ced8",
  "org.scalablytyped" %%% "react-md__layout" % "2.4.3-8f2b64",
  "org.scalablytyped" %%% "react-md__link" % "2.4.2-a9008f",
  "org.scalablytyped" %%% "react-md__list" % "2.4.3-ffc954",
  "org.scalablytyped" %%% "react-md__media" % "2.4.2-455ee0",
  "org.scalablytyped" %%% "react-md__menu" % "2.4.3-af8cdf",
  "org.scalablytyped" %%% "react-md__overlay" % "2.4.2-7412e1",
  "org.scalablytyped" %%% "react-md__portal" % "2.4.2-5a29e9",
  "org.scalablytyped" %%% "react-md__progress" % "2.4.2-a5eec6",
  "org.scalablytyped" %%% "react-md__sheet" % "2.4.2-a74558",
  "org.scalablytyped" %%% "react-md__states" % "2.4.2-7a5817",
  "org.scalablytyped" %%% "react-md__table" % "2.4.3-87207c",
  "org.scalablytyped" %%% "react-md__tabs" % "2.4.2-2f53b4",
  "org.scalablytyped" %%% "react-md__tooltip" % "2.4.2-f576b8",
  "org.scalablytyped" %%% "react-md__transition" % "2.4.2-ce54ff",
  "org.scalablytyped" %%% "react-md__tree" % "2.4.3-3db4fa",
  "org.scalablytyped" %%% "react-md__typography" % "2.4.2-f572a8",
  "org.scalablytyped" %%% "react-md__utils" % "2.4.2-2ce571",
  "org.scalablytyped" %%% "react-transition-group" % "4.4-dt-20200521Z-75f79d",
  "org.scalablytyped" %%% "std" % "4.1-2f6855")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
