organization := "org.scalablytyped"
name := "sanitize-html"
version := "1.27-dt-20200909Z-2a4a93"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "domhandler" % "2.4-dt-20200515Z-22f644",
  "org.scalablytyped" %%% "domutils" % "1.7-dt-20200908Z-2fd93d",
  "org.scalablytyped" %%% "htmlparser2" % "v3.10.x-dt-20201002Z-52e710",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-11c649",
  "org.scalablytyped" %%% "std" % "4.1-f7e8ab")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
