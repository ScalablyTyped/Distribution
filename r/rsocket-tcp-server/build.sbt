organization := "org.scalablytyped"
name := "rsocket-tcp-server"
version := "0.0-dt-20200515Z-f5ab41"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-814aa8",
  "org.scalablytyped" %%% "rsocket-core" % "0.0-dt-20200218Z-76069f",
  "org.scalablytyped" %%% "rsocket-flowable" % "0.0-dt-20200515Z-e81cad",
  "org.scalablytyped" %%% "rsocket-types" % "0.0-dt-20200515Z-b43d5d",
  "org.scalablytyped" %%% "std" % "4.1-044efb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
