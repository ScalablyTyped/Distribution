organization := "org.scalablytyped"
name := "sinon-chrome"
version := "v2.2.4-dt-20220913Z-f3ae05"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "chrome" % "0.0-unknown-dt-20230623Z-e3dbe5",
  "org.scalablytyped" %%% "filesystem" % "0.0-unknown-dt-20221103Z-4bd552",
  "org.scalablytyped" %%% "filewriter" % "0.0-unknown-dt-20221103Z-795c7d",
  "org.scalablytyped" %%% "har-format" % "1.2-dt-20230601Z-f2dd72",
  "org.scalablytyped" %%% "sinon" % "10.0-dt-20230514Z-2ebaae",
  "org.scalablytyped" %%% "sinonjs__fake-timers" % "8.1-dt-20220323Z-d63db7",
  "org.scalablytyped" %%% "std" % "5.1-9d5ad2")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
