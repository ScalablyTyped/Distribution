organization := "org.scalablytyped"
name := "restify-cookies"
version := "0.2-dt-20211202Z-1cb585"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "bunyan" % "1.8-dt-20211202Z-3939f3",
  "org.scalablytyped" %%% "formidable" % "2.0-dt-20220502Z-283342",
  "org.scalablytyped" %%% "node" % "18.7-dt-20220913Z-77cc8d",
  "org.scalablytyped" %%% "restify" % "8.5-dt-20220810Z-87c412",
  "org.scalablytyped" %%% "spdy" % "3.4-dt-20211202Z-4cf73d",
  "org.scalablytyped" %%% "std" % "4.8-958c79")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
