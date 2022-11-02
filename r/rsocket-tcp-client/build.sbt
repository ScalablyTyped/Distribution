organization := "org.scalablytyped"
name := "rsocket-tcp-client"
version := "0.0-dt-20211202Z-2b70f1"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-d0f137",
  "org.scalablytyped" %%% "rsocket-core" % "0.0-dt-20211202Z-f05470",
  "org.scalablytyped" %%% "rsocket-flowable" % "0.0-dt-20211202Z-e85ab2",
  "org.scalablytyped" %%% "rsocket-types" % "0.0-dt-20211202Z-3ca45c",
  "org.scalablytyped" %%% "std" % "4.8-837c43")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
