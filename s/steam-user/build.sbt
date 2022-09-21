organization := "org.scalablytyped"
name := "steam-user"
version := "4.23-dt-20220909Z-3afbd1"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "bytebuffer" % "5.0.0-dt-20220818Z-3e839f",
  "org.scalablytyped" %%% "file-manager" % "2.0-dt-20220829Z-cd7673",
  "org.scalablytyped" %%% "long" % "5.2.0-13a867",
  "org.scalablytyped" %%% "node" % "18.7-dt-20220913Z-77cc8d",
  "org.scalablytyped" %%% "std" % "4.8-958c79",
  "org.scalablytyped" %%% "steamid" % "2.0-dt-20211202Z-69f8cb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
