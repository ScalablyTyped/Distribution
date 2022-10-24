organization := "org.scalablytyped"
name := "rx_dot_wamp"
version := "0.5.0-dt-20220818Z-5ecb4f"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "autobahn" % "20.9-dt-20220913Z-8114a0",
  "org.scalablytyped" %%% "rx-core" % "4.0-dt-20220818Z-672fd6",
  "org.scalablytyped" %%% "rx-lite" % "4.0-dt-20220818Z-c3d302",
  "org.scalablytyped" %%% "rx-lite-aggregates" % "4.0-dt-20220818Z-708e57",
  "org.scalablytyped" %%% "std" % "4.8-837c43",
  "org.scalablytyped" %%% "when" % "2.4.0-dt-20220818Z-1ae43a")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
