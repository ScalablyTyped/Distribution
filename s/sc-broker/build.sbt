organization := "org.scalablytyped"
name := "sc-broker"
version := "8.0-dt-20211202Z-ecf10f"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "expirymanager" % "0.9-dt-20211202Z-9d51d8",
  "org.scalablytyped" %%% "fleximap" % "0.9-dt-20211202Z-7870bd",
  "org.scalablytyped" %%% "ncom" % "1.0-dt-20211202Z-9ae977",
  "org.scalablytyped" %%% "node" % "18.7-dt-20220913Z-77cc8d",
  "org.scalablytyped" %%% "std" % "4.8-958c79")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
