organization := "org.scalablytyped"
name := "rx-angular"
version := "0.0-unknown-dt-20220818Z-892b6c"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "angular" % "1.8-dt-20220525Z-b4eeaf",
  "org.scalablytyped" %%% "rx-core" % "4.0-dt-20220818Z-d1c6ba",
  "org.scalablytyped" %%% "rx-lite" % "4.0-dt-20220818Z-52bce7",
  "org.scalablytyped" %%% "rx-lite-aggregates" % "4.0-dt-20220818Z-37421d",
  "org.scalablytyped" %%% "std" % "4.8-3c7765")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
