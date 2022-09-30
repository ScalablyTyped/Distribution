organization := "org.scalablytyped"
name := "sc-broker"
version := "8.0-dt-20211202Z-184f32"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "expirymanager" % "0.9-dt-20211202Z-6226b2",
  "org.scalablytyped" %%% "fleximap" % "0.9-dt-20211202Z-ac4e4a",
  "org.scalablytyped" %%% "ncom" % "1.0-dt-20211202Z-d1065d",
  "org.scalablytyped" %%% "node" % "18.7-dt-20220926Z-d201ab",
  "org.scalablytyped" %%% "std" % "4.8-9f8efb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
