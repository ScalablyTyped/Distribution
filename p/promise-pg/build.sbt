organization := "org.scalablytyped"
name := "promise-pg"
version := "0.0-unknown-dt-20201002Z-ffb95a"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-e00132",
  "org.scalablytyped" %%% "pg" % "7.14-dt-20201117Z-1d69f8",
  "org.scalablytyped" %%% "pg-types" % "2.2.0-8e6dbf",
  "org.scalablytyped" %%% "q" % "1.5-dt-20201002Z-335752",
  "org.scalablytyped" %%% "std" % "4.1-2f6855")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
