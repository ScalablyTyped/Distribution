organization := "org.scalablytyped"
name := "restify-cors-middleware"
version := "1.0-dt-20211202Z-86f522"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "bunyan" % "1.8-dt-20211202Z-e17624",
  "org.scalablytyped" %%% "formidable" % "2.0-dt-20220502Z-e77446",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-86f548",
  "org.scalablytyped" %%% "restify" % "8.5-dt-20220810Z-c19555",
  "org.scalablytyped" %%% "spdy" % "3.4-dt-20211202Z-12ba75",
  "org.scalablytyped" %%% "std" % "4.8-686d1d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
