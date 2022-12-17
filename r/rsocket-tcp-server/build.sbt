organization := "org.scalablytyped"
name := "rsocket-tcp-server"
version := "0.0-dt-20211202Z-55fc68"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-def929",
  "org.scalablytyped" %%% "rsocket-core" % "0.0-dt-20211202Z-2f19df",
  "org.scalablytyped" %%% "rsocket-flowable" % "0.0-dt-20211202Z-5afee1",
  "org.scalablytyped" %%% "rsocket-types" % "0.0-dt-20211202Z-1bac21",
  "org.scalablytyped" %%% "std" % "4.9-5f989f")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
