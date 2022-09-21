organization := "org.scalablytyped"
name := "sinon-chrome"
version := "v2.2.4-dt-20220913Z-bbf69a"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "chrome" % "0.0-unknown-dt-20220916Z-f8e820",
  "org.scalablytyped" %%% "filesystem" % "0.0-unknown-dt-20220818Z-dae0e4",
  "org.scalablytyped" %%% "filewriter" % "0.0-unknown-dt-20220818Z-d7bf60",
  "org.scalablytyped" %%% "har-format" % "1.2-dt-20220624Z-41775b",
  "org.scalablytyped" %%% "sinon" % "10.0-dt-20220720Z-a59c87",
  "org.scalablytyped" %%% "sinonjs__fake-timers" % "8.1-dt-20220323Z-d2df15",
  "org.scalablytyped" %%% "std" % "4.8-958c79")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
