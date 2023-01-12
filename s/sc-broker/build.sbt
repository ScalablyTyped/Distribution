organization := "org.scalablytyped"
name := "sc-broker"
version := "8.0-dt-20211202Z-90e0e0"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "expirymanager" % "0.9-dt-20211202Z-63ca31",
  "org.scalablytyped" %%% "fleximap" % "0.9-dt-20211202Z-6b8429",
  "org.scalablytyped" %%% "ncom" % "1.0-dt-20211202Z-7a7fc9",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-874609",
  "org.scalablytyped" %%% "std" % "4.9-ecb5eb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
