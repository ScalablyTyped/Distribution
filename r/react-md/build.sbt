organization := "org.scalablytyped"
name := "react-md"
version := "2.4.3-ee40e7"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "csstype" % "2.6.14-dc2f99",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20200515Z-3fbed9",
  "org.scalablytyped" %%% "react" % "17.0-dt-20201121Z-4ff700",
  "org.scalablytyped" %%% "react-md__alert" % "2.4.2-83fa41",
  "org.scalablytyped" %%% "react-md__app-bar" % "2.4.2-eebaef",
  "org.scalablytyped" %%% "react-md__autocomplete" % "2.4.3-c7ae62",
  "org.scalablytyped" %%% "react-md__avatar" % "2.4.2-50064b",
  "org.scalablytyped" %%% "react-md__badge" % "2.4.2-d9908f",
  "org.scalablytyped" %%% "react-md__button" % "2.4.2-8b7812",
  "org.scalablytyped" %%% "react-md__card" % "2.4.2-7c2cf4",
  "org.scalablytyped" %%% "react-md__chip" % "2.4.2-3f48f5",
  "org.scalablytyped" %%% "react-md__dialog" % "2.4.2-70ea87",
  "org.scalablytyped" %%% "react-md__divider" % "2.4.2-e00819",
  "org.scalablytyped" %%% "react-md__expansion-panel" % "2.4.2-1fe46b",
  "org.scalablytyped" %%% "react-md__form" % "2.4.3-19b482",
  "org.scalablytyped" %%% "react-md__icon" % "2.4.2-63d7ad",
  "org.scalablytyped" %%% "react-md__layout" % "2.4.3-2ae367",
  "org.scalablytyped" %%% "react-md__link" % "2.4.2-de0c1e",
  "org.scalablytyped" %%% "react-md__list" % "2.4.3-2849a9",
  "org.scalablytyped" %%% "react-md__media" % "2.4.2-05fe28",
  "org.scalablytyped" %%% "react-md__menu" % "2.4.3-e9892e",
  "org.scalablytyped" %%% "react-md__overlay" % "2.4.2-44836c",
  "org.scalablytyped" %%% "react-md__portal" % "2.4.2-6074e9",
  "org.scalablytyped" %%% "react-md__progress" % "2.4.2-5686fc",
  "org.scalablytyped" %%% "react-md__sheet" % "2.4.2-e69690",
  "org.scalablytyped" %%% "react-md__states" % "2.4.2-22455f",
  "org.scalablytyped" %%% "react-md__table" % "2.4.3-0f4121",
  "org.scalablytyped" %%% "react-md__tabs" % "2.4.2-59af98",
  "org.scalablytyped" %%% "react-md__tooltip" % "2.4.2-e68549",
  "org.scalablytyped" %%% "react-md__transition" % "2.4.2-ec7ed1",
  "org.scalablytyped" %%% "react-md__tree" % "2.4.3-2efc7a",
  "org.scalablytyped" %%% "react-md__typography" % "2.4.2-f3f99f",
  "org.scalablytyped" %%% "react-md__utils" % "2.4.2-023133",
  "org.scalablytyped" %%% "react-transition-group" % "4.4-dt-20200521Z-e04b09",
  "org.scalablytyped" %%% "std" % "4.1-f7e8ab")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
