organization := "org.scalablytyped"
name := "rx_dot_wamp"
version := "0.5.0-dt-20201002Z-2a8e84"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "autobahn" % "18.10-dt-20200923Z-8d478f",
  "org.scalablytyped" %%% "rx" % "4.1.0-b886b6",
  "org.scalablytyped" %%% "std" % "4.1-f7e8ab",
  "org.scalablytyped" %%% "when" % "2.4.0-dt-20201002Z-6fa306")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
