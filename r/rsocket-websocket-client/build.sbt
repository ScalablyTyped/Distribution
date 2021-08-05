organization := "org.scalablytyped"
name := "rsocket-websocket-client"
version := "0.0-dt-20200515Z-061f36"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-e00132",
  "org.scalablytyped" %%% "rsocket-core" % "0.0-dt-20200218Z-18d4e8",
  "org.scalablytyped" %%% "rsocket-flowable" % "0.0-dt-20200515Z-19d9a2",
  "org.scalablytyped" %%% "rsocket-types" % "0.0-dt-20200515Z-4a6554",
  "org.scalablytyped" %%% "std" % "4.1-2f6855")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
