organization := "org.scalablytyped"
name := "rollup-plugin-terser"
version := "7.0.2-46bb55"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "jridgewell__gen-mapping" % "0.3.2-96a273",
  "org.scalablytyped" %%% "jridgewell__trace-mapping" % "0.3.17-39cb8a",
  "org.scalablytyped" %%% "rollup" % "3.2.5-1d3800",
  "org.scalablytyped" %%% "std" % "4.8-686d1d",
  "org.scalablytyped" %%% "terser" % "5.15.1-4e72e1")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
