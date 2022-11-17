organization := "org.scalablytyped"
name := "serve-static"
version := "1.15-dt-20220729Z-4b57f5"
scalaVersion := "3.2.2-RC1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "mime" % "3.0-dt-20220804Z-32fa9f",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-99df59",
  "org.scalablytyped" %%% "std" % "4.9-448261")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
