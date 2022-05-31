organization := "org.scalablytyped"
name := "rsocket-tcp-client"
version := "0.0-dt-20200515Z-297d59"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-11c649",
  "org.scalablytyped" %%% "rsocket-core" % "0.0-dt-20200218Z-e61735",
  "org.scalablytyped" %%% "rsocket-flowable" % "0.0-dt-20200515Z-70596c",
  "org.scalablytyped" %%% "rsocket-types" % "0.0-dt-20200515Z-2e00fa",
  "org.scalablytyped" %%% "std" % "4.1-f7e8ab")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
