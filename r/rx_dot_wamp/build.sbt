organization := "org.scalablytyped"
name := "rx_dot_wamp"
version := "0.5.0-dt-20221230Z-a369f1"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "autobahn" % "20.9-dt-20230328Z-7320e0",
  "org.scalablytyped" %%% "rx-core" % "4.0-dt-20230322Z-346e2b",
  "org.scalablytyped" %%% "rx-lite" % "4.0-dt-20230322Z-ece94a",
  "org.scalablytyped" %%% "rx-lite-aggregates" % "4.0-dt-20230322Z-58e218",
  "org.scalablytyped" %%% "std" % "5.1-9d5ad2",
  "org.scalablytyped" %%% "when" % "2.4.0-dt-20230525Z-455eb7")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
