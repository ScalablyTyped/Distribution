organization := "org.scalablytyped"
name := "rsocket-tcp-client"
version := "0.0-dt-20211202Z-0047c5"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221015Z-0a42ca",
  "org.scalablytyped" %%% "rsocket-core" % "0.0-dt-20211202Z-09cf1f",
  "org.scalablytyped" %%% "rsocket-flowable" % "0.0-dt-20211202Z-928e5a",
  "org.scalablytyped" %%% "rsocket-types" % "0.0-dt-20211202Z-072b1d",
  "org.scalablytyped" %%% "std" % "4.8-3c7765")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
