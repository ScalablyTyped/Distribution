organization := "org.scalablytyped"
name := "react-md"
version := "5.1.4-28b7e6"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "csstype" % "3.1.1-7b6cf2",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20220407Z-737217",
  "org.scalablytyped" %%% "react" % "18.0-dt-20220913Z-bad9e4",
  "org.scalablytyped" %%% "react-md__alert" % "5.1.3-6d54c9",
  "org.scalablytyped" %%% "react-md__app-bar" % "5.1.3-5948a9",
  "org.scalablytyped" %%% "react-md__autocomplete" % "5.1.4-c61ca8",
  "org.scalablytyped" %%% "react-md__avatar" % "5.1.3-714cee",
  "org.scalablytyped" %%% "react-md__badge" % "5.1.3-c71dcc",
  "org.scalablytyped" %%% "react-md__button" % "5.1.3-9d9270",
  "org.scalablytyped" %%% "react-md__card" % "5.1.3-e412f5",
  "org.scalablytyped" %%% "react-md__chip" % "5.1.3-b08e6d",
  "org.scalablytyped" %%% "react-md__dialog" % "5.1.3-9b6397",
  "org.scalablytyped" %%% "react-md__divider" % "5.1.3-233264",
  "org.scalablytyped" %%% "react-md__expansion-panel" % "5.1.3-d37b1d",
  "org.scalablytyped" %%% "react-md__form" % "5.1.4-80c72d",
  "org.scalablytyped" %%% "react-md__icon" % "5.1.3-688e15",
  "org.scalablytyped" %%% "react-md__layout" % "5.1.4-cbae09",
  "org.scalablytyped" %%% "react-md__link" % "5.1.4-6c76e2",
  "org.scalablytyped" %%% "react-md__list" % "5.1.3-9ea5d7",
  "org.scalablytyped" %%% "react-md__media" % "5.1.3-6ac557",
  "org.scalablytyped" %%% "react-md__menu" % "5.1.4-6a5ec9",
  "org.scalablytyped" %%% "react-md__overlay" % "5.1.3-ae18cd",
  "org.scalablytyped" %%% "react-md__portal" % "5.1.0-b16e54",
  "org.scalablytyped" %%% "react-md__progress" % "5.1.3-62698c",
  "org.scalablytyped" %%% "react-md__sheet" % "5.1.3-dc16d1",
  "org.scalablytyped" %%% "react-md__states" % "5.1.3-2deaae",
  "org.scalablytyped" %%% "react-md__table" % "5.1.4-36a4f0",
  "org.scalablytyped" %%% "react-md__tabs" % "5.1.3-b793cf",
  "org.scalablytyped" %%% "react-md__tooltip" % "5.1.3-26646c",
  "org.scalablytyped" %%% "react-md__transition" % "5.1.3-d8eb52",
  "org.scalablytyped" %%% "react-md__tree" % "5.1.4-4be715",
  "org.scalablytyped" %%% "react-md__typography" % "5.1.3-08f510",
  "org.scalablytyped" %%% "react-md__utils" % "5.1.3-7e5645",
  "org.scalablytyped" %%% "scheduler" % "0.16-dt-20211202Z-fce63f",
  "org.scalablytyped" %%% "std" % "4.8-958c79")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
