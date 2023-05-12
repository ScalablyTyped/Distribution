organization := "org.scalablytyped"
name := "restify-cookies"
version := "0.2-dt-20211202Z-d4ba3d"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "bunyan" % "1.8-dt-20211202Z-11b5be",
  "org.scalablytyped" %%% "formidable" % "2.0-dt-20230509Z-c02c1d",
  "org.scalablytyped" %%% "node" % "20.1-dt-20230511Z-0320fc",
  "org.scalablytyped" %%% "restify" % "8.5-dt-20230429Z-92dd5e",
  "org.scalablytyped" %%% "spdy" % "3.4-dt-20211202Z-2d965f",
  "org.scalablytyped" %%% "std" % "5.0-e63739")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
