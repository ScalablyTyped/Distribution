organization := "org.scalablytyped"
name := "rx_dot_wamp"
version := "0.5.0-dt-20220818Z-4d147b"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "autobahn" % "20.9-dt-20220913Z-7e8a5c",
  "org.scalablytyped" %%% "rx-core" % "4.0-dt-20220818Z-d1c6ba",
  "org.scalablytyped" %%% "rx-lite" % "4.0-dt-20220818Z-52bce7",
  "org.scalablytyped" %%% "rx-lite-aggregates" % "4.0-dt-20220818Z-37421d",
  "org.scalablytyped" %%% "std" % "4.8-3c7765",
  "org.scalablytyped" %%% "when" % "2.4.0-dt-20220818Z-160ba2")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
