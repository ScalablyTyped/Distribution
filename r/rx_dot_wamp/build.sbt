organization := "org.scalablytyped"
name := "rx_dot_wamp"
version := "0.5.0-dt-20220818Z-b06af3"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "autobahn" % "20.9-dt-20220913Z-9262e4",
  "org.scalablytyped" %%% "rx-core" % "4.0-dt-20220818Z-81d923",
  "org.scalablytyped" %%% "rx-lite" % "4.0-dt-20220818Z-c1f07d",
  "org.scalablytyped" %%% "rx-lite-aggregates" % "4.0-dt-20220818Z-f219bc",
  "org.scalablytyped" %%% "std" % "4.9-ecb5eb",
  "org.scalablytyped" %%% "when" % "2.4.0-dt-20220818Z-cb86c2")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
