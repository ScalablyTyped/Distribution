organization := "org.scalablytyped"
name := "sentry__node"
version := "7.15.0-6761e2"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221030Z-57fc1b",
  "org.scalablytyped" %%% "sentry__core" % "7.17.3-2f15c5",
  "org.scalablytyped" %%% "sentry__types" % "7.17.3-0de80a",
  "org.scalablytyped" %%% "sentry__utils" % "7.17.3-85f7b6",
  "org.scalablytyped" %%% "std" % "4.8-837c43")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
