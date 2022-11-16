organization := "org.scalablytyped"
name := "rollup-plugin-terser"
version := "7.0.2-4ccc72"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "jridgewell__gen-mapping" % "0.3.2-b7ce48",
  "org.scalablytyped" %%% "jridgewell__trace-mapping" % "0.3.17-72c66f",
  "org.scalablytyped" %%% "rollup" % "3.3.0-8b6f2a",
  "org.scalablytyped" %%% "std" % "4.9-c133ce",
  "org.scalablytyped" %%% "terser" % "5.15.1-db24d3")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
