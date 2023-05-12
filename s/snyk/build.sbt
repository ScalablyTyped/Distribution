organization := "org.scalablytyped"
name := "snyk"
version := "1.1008.0-5e5f21"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "chalk" % "5.2.0-9bd557",
  "org.scalablytyped" %%% "cli-spinners" % "2.9.0-db2f39",
  "org.scalablytyped" %%% "needle" % "3.2-dt-20221210Z-46d8bd",
  "org.scalablytyped" %%% "node" % "20.1-dt-20230511Z-0320fc",
  "org.scalablytyped" %%% "ora" % "6.3.0-63b499",
  "org.scalablytyped" %%% "sarif" % "2.1-dt-20211202Z-d9cf83",
  "org.scalablytyped" %%% "std" % "5.0-e63739")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
