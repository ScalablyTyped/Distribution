organization := "org.scalablytyped"
name := "rsocket-core"
version := "0.0-dt-20211202Z-433d78"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221030Z-57fc1b",
  "org.scalablytyped" %%% "rsocket-flowable" % "0.0-dt-20211202Z-cdaa71",
  "org.scalablytyped" %%% "rsocket-types" % "0.0-dt-20211202Z-fb6096",
  "org.scalablytyped" %%% "std" % "4.8-837c43")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
