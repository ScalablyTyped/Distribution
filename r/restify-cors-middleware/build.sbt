organization := "org.scalablytyped"
name := "restify-cors-middleware"
version := "1.0-dt-20211202Z-9a3614"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "bunyan" % "1.8-dt-20211202Z-7a320b",
  "org.scalablytyped" %%% "formidable" % "2.0-dt-20220502Z-69361b",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221023Z-05fcff",
  "org.scalablytyped" %%% "restify" % "8.5-dt-20220810Z-e558df",
  "org.scalablytyped" %%% "spdy" % "3.4-dt-20211202Z-7439a8",
  "org.scalablytyped" %%% "std" % "4.8-837c43")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
