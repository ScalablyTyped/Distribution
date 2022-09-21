organization := "org.scalablytyped"
name := "rx_dot_wamp"
version := "0.5.0-dt-20220818Z-642f0f"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "autobahn" % "20.9-dt-20220913Z-96bf06",
  "org.scalablytyped" %%% "rx-core" % "4.0-dt-20220818Z-a1cc09",
  "org.scalablytyped" %%% "rx-lite" % "4.0-dt-20220818Z-5bfac6",
  "org.scalablytyped" %%% "rx-lite-aggregates" % "4.0-dt-20220818Z-c1505f",
  "org.scalablytyped" %%% "std" % "4.8-958c79",
  "org.scalablytyped" %%% "when" % "2.4.0-dt-20220818Z-651175")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
