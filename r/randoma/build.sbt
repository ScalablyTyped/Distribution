organization := "org.scalablytyped"
name := "randoma"
version := "1.3.0-c9d427"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "color" % "3.0-dt-20200923Z-6d0bf0",
  "org.scalablytyped" %%% "color-convert" % "1.9-dt-20200515Z-eead50",
  "org.scalablytyped" %%% "color-name" % "1.1-dt-20200515Z-123ec4",
  "org.scalablytyped" %%% "std" % "4.1-2f6855")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
