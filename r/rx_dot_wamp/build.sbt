organization := "org.scalablytyped"
name := "rx_dot_wamp"
version := "0.5.0-dt-20201002Z-5c1f33"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "autobahn" % "18.10-dt-20200923Z-38f525",
  "org.scalablytyped" %%% "rx" % "4.1.0-a9b1fd",
  "org.scalablytyped" %%% "std" % "4.1-044efb",
  "org.scalablytyped" %%% "when" % "2.4.0-dt-20201002Z-459e71")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
