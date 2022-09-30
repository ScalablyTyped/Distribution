organization := "org.scalablytyped"
name := "sinon-chrome"
version := "v2.2.4-dt-20220913Z-04357d"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "chrome" % "0.0-unknown-dt-20220916Z-990df7",
  "org.scalablytyped" %%% "filesystem" % "0.0-unknown-dt-20220818Z-65d058",
  "org.scalablytyped" %%% "filewriter" % "0.0-unknown-dt-20220818Z-fd6dbd",
  "org.scalablytyped" %%% "har-format" % "1.2-dt-20220923Z-a2191f",
  "org.scalablytyped" %%% "sinon" % "10.0-dt-20220720Z-ee8a54",
  "org.scalablytyped" %%% "sinonjs__fake-timers" % "8.1-dt-20220323Z-c0e5e0",
  "org.scalablytyped" %%% "std" % "4.8-9f8efb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
