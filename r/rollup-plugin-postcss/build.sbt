organization := "org.scalablytyped"
name := "rollup-plugin-postcss"
version := "2.0-dt-20200830Z-0b0390"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "cssnano" % "4.0-dt-20180802Z-0b46c3",
  "org.scalablytyped" %%% "postcss" % "7.0.35-5779b1",
  "org.scalablytyped" %%% "rollup" % "2.33.3-042446",
  "org.scalablytyped" %%% "source-map" % "0.7.3-e38674",
  "org.scalablytyped" %%% "std" % "4.1-2f6855")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
