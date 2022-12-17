organization := "org.scalablytyped"
name := "restify-plugins"
version := "1.5-dt-20211202Z-bfa2f0"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "bunyan" % "1.8-dt-20211202Z-c4ac72",
  "org.scalablytyped" %%% "formidable" % "2.0-dt-20220502Z-88c3d9",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-def929",
  "org.scalablytyped" %%% "restify" % "8.5-dt-20220810Z-3a74ac",
  "org.scalablytyped" %%% "spdy" % "3.4-dt-20211202Z-ec349c",
  "org.scalablytyped" %%% "std" % "4.9-5f989f")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
