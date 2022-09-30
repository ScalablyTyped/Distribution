organization := "org.scalablytyped"
name := "sass-loader"
version := "8.0-dt-20220102Z-668a0e"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "immutable" % "4.1.0-99b836",
  "org.scalablytyped" %%% "node" % "18.7-dt-20220926Z-d201ab",
  "org.scalablytyped" %%% "node-sass" % "4.11-dt-20220630Z-582f12",
  "org.scalablytyped" %%% "sass" % "1.54.9-7089c4",
  "org.scalablytyped" %%% "source-map-js" % "1.0.2-70367f",
  "org.scalablytyped" %%% "std" % "4.8-9f8efb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
