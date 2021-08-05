organization := "org.scalablytyped"
name := "sanitize-html"
version := "1.27-dt-20200909Z-7e720c"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "domhandler" % "2.4-dt-20200515Z-79463d",
  "org.scalablytyped" %%% "domutils" % "1.7-dt-20200908Z-5434b4",
  "org.scalablytyped" %%% "htmlparser2" % "v3.10.x-dt-20201002Z-594dde",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-e00132",
  "org.scalablytyped" %%% "std" % "4.1-2f6855")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
