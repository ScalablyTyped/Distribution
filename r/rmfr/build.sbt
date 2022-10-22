organization := "org.scalablytyped"
name := "rmfr"
version := "2.0-dt-20220624Z-f6896d"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "glob" % "8.0-dt-20220830Z-3cb2e2",
  "org.scalablytyped" %%% "minimatch" % "5.1-dt-20220831Z-374fcc",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221020Z-d73de4",
  "org.scalablytyped" %%% "rimraf" % "3.0-dt-20211202Z-89c2cf",
  "org.scalablytyped" %%% "std" % "4.8-3c7765")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
