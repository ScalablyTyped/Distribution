organization := "org.scalablytyped"
name := "sinon-chrome"
version := "v2.2.4-dt-20201002Z-3dff76"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "chrome" % "0.0-unknown-dt-20201028Z-eb8120",
  "org.scalablytyped" %%% "filesystem" % "0.0-unknown-dt-20201002Z-bd3055",
  "org.scalablytyped" %%% "filewriter" % "0.0-unknown-dt-20201002Z-d98900",
  "org.scalablytyped" %%% "har-format" % "1.2-dt-20201030Z-e9c30e",
  "org.scalablytyped" %%% "sinon" % "9.0-dt-20201003Z-252a0f",
  "org.scalablytyped" %%% "sinonjs__fake-timers" % "6.0-dt-20200925Z-16986d",
  "org.scalablytyped" %%% "std" % "4.1-f7e8ab")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
