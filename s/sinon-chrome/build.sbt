organization := "org.scalablytyped"
name := "sinon-chrome"
version := "v2.2.4-dt-20220913Z-e95897"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "chrome" % "0.0-unknown-dt-20221103Z-6191df",
  "org.scalablytyped" %%% "filesystem" % "0.0-unknown-dt-20221103Z-1f230b",
  "org.scalablytyped" %%% "filewriter" % "0.0-unknown-dt-20221103Z-bd910a",
  "org.scalablytyped" %%% "har-format" % "1.2-dt-20220923Z-49d9e3",
  "org.scalablytyped" %%% "sinon" % "10.0-dt-20220720Z-663467",
  "org.scalablytyped" %%% "sinonjs__fake-timers" % "8.1-dt-20220323Z-553558",
  "org.scalablytyped" %%% "std" % "4.8-686d1d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
