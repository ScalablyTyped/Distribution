organization := "org.scalablytyped"
name := "promise-pg"
version := "0.0-unknown-dt-20201002Z-29bf53"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-814aa8",
  "org.scalablytyped" %%% "pg" % "7.14-dt-20201117Z-0d50aa",
  "org.scalablytyped" %%% "pg-types" % "2.2.0-72bc60",
  "org.scalablytyped" %%% "q" % "1.5-dt-20201002Z-f54a76",
  "org.scalablytyped" %%% "std" % "4.1-044efb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
