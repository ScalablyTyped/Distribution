organization := "org.scalablytyped"
name := "restify-plugins"
version := "1.5-dt-20211202Z-691f22"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "bunyan" % "1.8-dt-20211202Z-7d8e65",
  "org.scalablytyped" %%% "formidable" % "2.0-dt-20220502Z-91e0b8",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221020Z-d73de4",
  "org.scalablytyped" %%% "restify" % "8.5-dt-20220810Z-f29870",
  "org.scalablytyped" %%% "spdy" % "3.4-dt-20211202Z-6fc6ee",
  "org.scalablytyped" %%% "std" % "4.8-3c7765")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
