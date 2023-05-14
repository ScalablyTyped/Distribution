organization := "org.scalablytyped"
name := "react-native-community__cli-tools"
version := "11.2.3-6ab258"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "cli-spinners" % "2.9.0-db2f39",
  "org.scalablytyped" %%% "formdata-polyfill" % "4.0.10-534907",
  "org.scalablytyped" %%% "node" % "20.1-dt-20230513Z-b25634",
  "org.scalablytyped" %%% "node-fetch" % "3.3.1-0dca8e",
  "org.scalablytyped" %%% "ora" % "6.3.0-9a8687",
  "org.scalablytyped" %%% "semver" % "7.5-dt-20230508Z-37288e",
  "org.scalablytyped" %%% "std" % "5.0-e63739")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
