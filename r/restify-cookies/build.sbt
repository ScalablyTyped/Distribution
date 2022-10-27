organization := "org.scalablytyped"
name := "restify-cookies"
version := "0.2-dt-20211202Z-d1a503"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "bunyan" % "1.8-dt-20211202Z-f029c2",
  "org.scalablytyped" %%% "formidable" % "2.0-dt-20220502Z-a85962",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221026Z-107efe",
  "org.scalablytyped" %%% "restify" % "8.5-dt-20220810Z-600416",
  "org.scalablytyped" %%% "spdy" % "3.4-dt-20211202Z-ca2cab",
  "org.scalablytyped" %%% "std" % "4.8-837c43")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
