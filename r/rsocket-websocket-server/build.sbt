organization := "org.scalablytyped"
name := "rsocket-websocket-server"
version := "0.0-dt-20211202Z-f34c87"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221018Z-1e532a",
  "org.scalablytyped" %%% "rsocket-core" % "0.0-dt-20211202Z-0294f5",
  "org.scalablytyped" %%% "rsocket-flowable" % "0.0-dt-20211202Z-124a6e",
  "org.scalablytyped" %%% "rsocket-types" % "0.0-dt-20211202Z-ae42ba",
  "org.scalablytyped" %%% "std" % "4.8-3c7765",
  "org.scalablytyped" %%% "ws" % "8.5-dt-20220624Z-0f048d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
