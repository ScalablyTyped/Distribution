organization := "org.scalablytyped"
name := "refractor"
version := "4.8.0-ba467b"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "hast" % "2.3-dt-20211202Z-8965ce",
  "org.scalablytyped" %%% "prismjs" % "1.26-dt-20230228Z-6e0dd7",
  "org.scalablytyped" %%% "std" % "5.1-9d5ad2",
  "org.scalablytyped" %%% "unist" % "2.0-dt-20221230Z-9eb15f")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
