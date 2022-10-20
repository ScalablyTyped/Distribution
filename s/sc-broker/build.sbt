organization := "org.scalablytyped"
name := "sc-broker"
version := "8.0-dt-20211202Z-ae7941"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "expirymanager" % "0.9-dt-20211202Z-bef5ba",
  "org.scalablytyped" %%% "fleximap" % "0.9-dt-20211202Z-e7a898",
  "org.scalablytyped" %%% "ncom" % "1.0-dt-20211202Z-f4647b",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221018Z-1e532a",
  "org.scalablytyped" %%% "std" % "4.8-3c7765")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
