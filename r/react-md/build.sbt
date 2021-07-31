organization := "org.scalablytyped"
name := "react-md"
version := "2.4.3-ebc347"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "csstype" % "2.6.14-b8d190",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20200515Z-a12f9a",
  "org.scalablytyped" %%% "react" % "17.0-dt-20201121Z-c80121",
  "org.scalablytyped" %%% "react-md__alert" % "2.4.2-5b4d85",
  "org.scalablytyped" %%% "react-md__app-bar" % "2.4.2-d29c4a",
  "org.scalablytyped" %%% "react-md__autocomplete" % "2.4.3-d2d758",
  "org.scalablytyped" %%% "react-md__avatar" % "2.4.2-b55d99",
  "org.scalablytyped" %%% "react-md__badge" % "2.4.2-29cdd6",
  "org.scalablytyped" %%% "react-md__button" % "2.4.2-56ea0d",
  "org.scalablytyped" %%% "react-md__card" % "2.4.2-3b645c",
  "org.scalablytyped" %%% "react-md__chip" % "2.4.2-4e6194",
  "org.scalablytyped" %%% "react-md__dialog" % "2.4.2-dcf3c6",
  "org.scalablytyped" %%% "react-md__divider" % "2.4.2-084972",
  "org.scalablytyped" %%% "react-md__expansion-panel" % "2.4.2-b4e894",
  "org.scalablytyped" %%% "react-md__form" % "2.4.3-cd19b1",
  "org.scalablytyped" %%% "react-md__icon" % "2.4.2-57c60f",
  "org.scalablytyped" %%% "react-md__layout" % "2.4.3-57564c",
  "org.scalablytyped" %%% "react-md__link" % "2.4.2-08838b",
  "org.scalablytyped" %%% "react-md__list" % "2.4.3-7d389c",
  "org.scalablytyped" %%% "react-md__media" % "2.4.2-c854b9",
  "org.scalablytyped" %%% "react-md__menu" % "2.4.3-964336",
  "org.scalablytyped" %%% "react-md__overlay" % "2.4.2-861ebf",
  "org.scalablytyped" %%% "react-md__portal" % "2.4.2-bb420c",
  "org.scalablytyped" %%% "react-md__progress" % "2.4.2-c54d17",
  "org.scalablytyped" %%% "react-md__sheet" % "2.4.2-50fb73",
  "org.scalablytyped" %%% "react-md__states" % "2.4.2-fc3ba6",
  "org.scalablytyped" %%% "react-md__table" % "2.4.3-53af9c",
  "org.scalablytyped" %%% "react-md__tabs" % "2.4.2-d8def5",
  "org.scalablytyped" %%% "react-md__tooltip" % "2.4.2-f5b785",
  "org.scalablytyped" %%% "react-md__transition" % "2.4.2-598278",
  "org.scalablytyped" %%% "react-md__tree" % "2.4.3-302a3b",
  "org.scalablytyped" %%% "react-md__typography" % "2.4.2-bc6f1a",
  "org.scalablytyped" %%% "react-md__utils" % "2.4.2-2b7260",
  "org.scalablytyped" %%% "react-transition-group" % "4.4-dt-20200521Z-286edc",
  "org.scalablytyped" %%% "std" % "4.1-044efb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
