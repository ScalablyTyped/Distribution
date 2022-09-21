organization := "org.scalablytyped"
name := "react-native-community__cli-doctor"
version := "9.1.1-04eba8"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "cli-spinners" % "2.7.0-02e03e",
  "org.scalablytyped" %%% "execa" % "6.1.0-10a797",
  "org.scalablytyped" %%% "node" % "18.7-dt-20220913Z-77cc8d",
  "org.scalablytyped" %%% "ora" % "6.1.2-c2b656",
  "org.scalablytyped" %%% "react-native-community__cli-types" % "9.1.0-dce9ea",
  "org.scalablytyped" %%% "std" % "4.8-958c79")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
