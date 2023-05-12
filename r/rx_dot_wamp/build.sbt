organization := "org.scalablytyped"
name := "rx_dot_wamp"
version := "0.5.0-dt-20221230Z-f2de4e"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "autobahn" % "20.9-dt-20230328Z-f4fe77",
  "org.scalablytyped" %%% "rx-core" % "4.0-dt-20230322Z-58cd9a",
  "org.scalablytyped" %%% "rx-lite" % "4.0-dt-20230322Z-703d66",
  "org.scalablytyped" %%% "rx-lite-aggregates" % "4.0-dt-20230322Z-9914e9",
  "org.scalablytyped" %%% "std" % "5.0-e63739",
  "org.scalablytyped" %%% "when" % "2.4.0-dt-20230327Z-c3302d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
