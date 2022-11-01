organization := "org.scalablytyped"
name := "redux-sentry-middleware"
version := "0.2-dt-20211202Z-34082d"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "redux" % "4.2.0-6b25b9",
  "org.scalablytyped" %%% "sentry__browser" % "7.17.3-ce3ed6",
  "org.scalablytyped" %%% "sentry__core" % "7.17.3-2f15c5",
  "org.scalablytyped" %%% "sentry__types" % "7.17.3-0de80a",
  "org.scalablytyped" %%% "sentry__utils" % "7.17.3-85f7b6",
  "org.scalablytyped" %%% "std" % "4.8-837c43")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
