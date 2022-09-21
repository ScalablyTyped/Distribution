organization := "org.scalablytyped"
name := "randoma"
version := "2.0.0-311a27"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "color" % "3.0-dt-20220819Z-69bf8d",
  "org.scalablytyped" %%% "color-convert" % "2.0-dt-20211202Z-581571",
  "org.scalablytyped" %%% "color-name" % "1.1-dt-20211202Z-1cefc0",
  "org.scalablytyped" %%% "std" % "4.8-958c79")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
