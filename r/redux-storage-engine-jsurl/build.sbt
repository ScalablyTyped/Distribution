organization := "org.scalablytyped"
name := "redux-storage-engine-jsurl"
version := "1.0-dt-20211202Z-1a33e9"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "redux" % "4.2.1-a751f8",
  "org.scalablytyped" %%% "redux-storage" % "4.1.2-dt-20230327Z-4334b1",
  "org.scalablytyped" %%% "std" % "5.1-9d5ad2")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
