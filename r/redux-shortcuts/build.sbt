organization := "org.scalablytyped"
name := "redux-shortcuts"
version := "0.0-dt-20211202Z-8a3e8c"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "mousetrap" % "1.6-dt-20221027Z-933f6e",
  "org.scalablytyped" %%% "redux" % "4.2.0-6b25b9",
  "org.scalablytyped" %%% "std" % "4.8-837c43")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
