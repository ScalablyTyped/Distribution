organization := "org.scalablytyped"
name := "sc-broker"
version := "8.0-dt-20211202Z-2b3e4c"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "expirymanager" % "0.9-dt-20211202Z-4b45e9",
  "org.scalablytyped" %%% "fleximap" % "0.9-dt-20211202Z-1c9a00",
  "org.scalablytyped" %%% "ncom" % "1.0-dt-20211202Z-9dcb35",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-def929",
  "org.scalablytyped" %%% "std" % "4.9-5f989f")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
