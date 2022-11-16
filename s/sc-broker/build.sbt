organization := "org.scalablytyped"
name := "sc-broker"
version := "8.0-dt-20211202Z-b7f418"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "expirymanager" % "0.9-dt-20211202Z-3765f3",
  "org.scalablytyped" %%% "fleximap" % "0.9-dt-20211202Z-4a4465",
  "org.scalablytyped" %%% "ncom" % "1.0-dt-20211202Z-4b1daf",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-4346d8",
  "org.scalablytyped" %%% "std" % "4.9-c133ce")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
