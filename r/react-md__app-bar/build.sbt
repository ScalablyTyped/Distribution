organization := "org.scalablytyped"
name := "react-md__app-bar"
version := "2.4.2-9ddd88"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "csstype" % "2.6.14-344a29",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20200515Z-49dd4c",
  "org.scalablytyped" %%% "react" % "17.0-dt-20201121Z-76d083",
  "org.scalablytyped" %%% "react-md__button" % "2.4.2-15ff25",
  "org.scalablytyped" %%% "react-md__portal" % "2.4.2-5a29e9",
  "org.scalablytyped" %%% "react-md__states" % "2.4.2-7a5817",
  "org.scalablytyped" %%% "react-md__transition" % "2.4.2-ce54ff",
  "org.scalablytyped" %%% "react-md__utils" % "2.4.2-2ce571",
  "org.scalablytyped" %%% "react-transition-group" % "4.4-dt-20200521Z-75f79d",
  "org.scalablytyped" %%% "std" % "4.1-2f6855")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
