organization := "org.scalablytyped"
name := "spectrum"
version := "1.8-dt-20220624Z-7ad379"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "jquery" % "3.5-dt-20221103Z-b865bf",
  "org.scalablytyped" %%% "sizzle" % "2.3-dt-20211202Z-d89e1b",
  "org.scalablytyped" %%% "std" % "4.8-686d1d",
  "org.scalablytyped" %%% "tinycolor2" % "1.4-dt-20211202Z-b10766")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
