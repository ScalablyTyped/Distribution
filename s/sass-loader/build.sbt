organization := "org.scalablytyped"
name := "sass-loader"
version := "8.0-dt-20220102Z-21dbd9"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "immutable" % "4.1.0-8aa9ce",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-def929",
  "org.scalablytyped" %%% "node-sass" % "4.11-dt-20220630Z-e4cf37",
  "org.scalablytyped" %%% "sass" % "1.56.1-37a2bd",
  "org.scalablytyped" %%% "source-map-js" % "1.0.2-8ee3e9",
  "org.scalablytyped" %%% "std" % "4.9-5f989f")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
