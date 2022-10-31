organization := "org.scalablytyped"
name := "sc-broker"
version := "8.0-dt-20211202Z-b72bd4"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "expirymanager" % "0.9-dt-20211202Z-11c16b",
  "org.scalablytyped" %%% "fleximap" % "0.9-dt-20211202Z-ead772",
  "org.scalablytyped" %%% "ncom" % "1.0-dt-20211202Z-36f9ea",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221030Z-57fc1b",
  "org.scalablytyped" %%% "std" % "4.8-837c43")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
