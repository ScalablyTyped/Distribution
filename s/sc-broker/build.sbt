organization := "org.scalablytyped"
name := "sc-broker"
version := "8.0-dt-20211202Z-bd27bd"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "expirymanager" % "0.9-dt-20211202Z-c034b3",
  "org.scalablytyped" %%% "fleximap" % "0.9-dt-20211202Z-fbcc1d",
  "org.scalablytyped" %%% "ncom" % "1.0-dt-20211202Z-e695ac",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-86f548",
  "org.scalablytyped" %%% "std" % "4.8-686d1d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
