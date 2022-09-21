organization := "org.scalablytyped"
name := "spectrum"
version := "1.8-dt-20220624Z-e71746"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "jquery" % "3.5-dt-20220624Z-d9fe7d",
  "org.scalablytyped" %%% "sizzle" % "2.3-dt-20211202Z-964e56",
  "org.scalablytyped" %%% "std" % "4.8-958c79",
  "org.scalablytyped" %%% "tinycolor2" % "1.4-dt-20211202Z-bf2a3b")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
