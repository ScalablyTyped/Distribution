organization := "org.scalablytyped"
name := "react-dnd-multi-backend"
version := "8.0.0-abde67"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "csstype" % "3.1.2-5927f3",
  "org.scalablytyped" %%% "dnd-core" % "16.0.1-9a7db2",
  "org.scalablytyped" %%% "dnd-multi-backend" % "8.0.0-2670df",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20220407Z-4446ee",
  "org.scalablytyped" %%% "react" % "18.2-dt-20230506Z-14ab9d",
  "org.scalablytyped" %%% "react-dnd" % "16.0.1-283d75",
  "org.scalablytyped" %%% "react-dnd-preview" % "8.0.0-4d158f",
  "org.scalablytyped" %%% "redux" % "4.2.1-49dd26",
  "org.scalablytyped" %%% "scheduler" % "0.16-dt-20230322Z-da1b40",
  "org.scalablytyped" %%% "std" % "5.0-e63739")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
