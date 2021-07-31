organization := "org.scalablytyped"
name := "sinon-chrome"
version := "v2.2.4-dt-20201002Z-c32860"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "chrome" % "0.0-unknown-dt-20201028Z-5a96e8",
  "org.scalablytyped" %%% "filesystem" % "0.0-unknown-dt-20201002Z-eba870",
  "org.scalablytyped" %%% "filewriter" % "0.0-unknown-dt-20201002Z-ccfe6c",
  "org.scalablytyped" %%% "har-format" % "1.2-dt-20201030Z-1745e2",
  "org.scalablytyped" %%% "sinon" % "9.0-dt-20201003Z-027e10",
  "org.scalablytyped" %%% "sinonjs__fake-timers" % "6.0-dt-20200925Z-85a80d",
  "org.scalablytyped" %%% "std" % "4.1-044efb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
