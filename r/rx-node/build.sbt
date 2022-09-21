organization := "org.scalablytyped"
name := "rx-node"
version := "0.0-unknown-dt-20220818Z-f3cbb1"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "node" % "18.7-dt-20220913Z-77cc8d",
  "org.scalablytyped" %%% "rx-core" % "4.0-dt-20220818Z-a1cc09",
  "org.scalablytyped" %%% "rx-lite" % "4.0-dt-20220818Z-5bfac6",
  "org.scalablytyped" %%% "rx-lite-aggregates" % "4.0-dt-20220818Z-c1505f",
  "org.scalablytyped" %%% "std" % "4.8-958c79")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
