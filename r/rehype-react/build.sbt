organization := "org.scalablytyped"
name := "rehype-react"
version := "7.1.1-7f0849"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "csstype" % "3.1.1-7b6cf2",
  "org.scalablytyped" %%% "hast" % "2.3-dt-20211202Z-8aa810",
  "org.scalablytyped" %%% "node" % "18.7-dt-20220913Z-77cc8d",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20220407Z-737217",
  "org.scalablytyped" %%% "react" % "18.0-dt-20220913Z-bad9e4",
  "org.scalablytyped" %%% "scheduler" % "0.16-dt-20211202Z-fce63f",
  "org.scalablytyped" %%% "std" % "4.8-958c79",
  "org.scalablytyped" %%% "unified" % "10.1.2-a743cb",
  "org.scalablytyped" %%% "unist" % "2.0-dt-20220624Z-f6f04e",
  "org.scalablytyped" %%% "vfile" % "5.3.5-edd597",
  "org.scalablytyped" %%% "vfile-message" % "3.1.2-0f5a3e")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
