organization := "org.scalablytyped"
name := "sentry__node"
version := "7.15.0-776622"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-874609",
  "org.scalablytyped" %%% "sentry__core" % "7.19.0-16584a",
  "org.scalablytyped" %%% "sentry__types" % "7.19.0-6fca75",
  "org.scalablytyped" %%% "sentry__utils" % "7.19.0-ef7b9d",
  "org.scalablytyped" %%% "std" % "4.9-ecb5eb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
