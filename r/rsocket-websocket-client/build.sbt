organization := "org.scalablytyped"
name := "rsocket-websocket-client"
version := "0.0-dt-20211202Z-cad90c"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "node" % "20.1-dt-20230513Z-b25634",
  "org.scalablytyped" %%% "rsocket-core" % "0.0-dt-20211202Z-2eb8e3",
  "org.scalablytyped" %%% "rsocket-flowable" % "0.0-dt-20211202Z-80ad53",
  "org.scalablytyped" %%% "rsocket-types" % "0.0-dt-20211202Z-34298f",
  "org.scalablytyped" %%% "std" % "5.0-e63739")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
