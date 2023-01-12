organization := "org.scalablytyped"
name := "redux-first-router-restore-scroll"
version := "1.2-dt-20220118Z-bd9662"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "history" % "5.3.0-fc021d",
  "org.scalablytyped" %%% "redux" % "4.2.0-17c5bf",
  "org.scalablytyped" %%% "redux-first-router" % "2.1-dt-20220118Z-b65ea2",
  "org.scalablytyped" %%% "std" % "4.9-ecb5eb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
