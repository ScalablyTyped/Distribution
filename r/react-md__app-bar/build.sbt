organization := "org.scalablytyped"
name := "react-md__app-bar"
version := "2.4.2-eebaef"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "csstype" % "2.6.14-dc2f99",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20200515Z-3fbed9",
  "org.scalablytyped" %%% "react" % "17.0-dt-20201121Z-4ff700",
  "org.scalablytyped" %%% "react-md__button" % "2.4.2-8b7812",
  "org.scalablytyped" %%% "react-md__portal" % "2.4.2-6074e9",
  "org.scalablytyped" %%% "react-md__states" % "2.4.2-22455f",
  "org.scalablytyped" %%% "react-md__transition" % "2.4.2-ec7ed1",
  "org.scalablytyped" %%% "react-md__utils" % "2.4.2-023133",
  "org.scalablytyped" %%% "react-transition-group" % "4.4-dt-20200521Z-e04b09",
  "org.scalablytyped" %%% "std" % "4.1-f7e8ab")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
