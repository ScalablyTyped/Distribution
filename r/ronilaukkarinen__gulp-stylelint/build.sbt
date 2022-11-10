organization := "org.scalablytyped"
name := "ronilaukkarinen__gulp-stylelint"
version := "14.0-dt-20220223Z-f7d08a"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "cosmiconfig" % "7.0.1-9d6984",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-86f548",
  "org.scalablytyped" %%% "postcss" % "8.4.18-a8f9f5",
  "org.scalablytyped" %%% "source-map-js" % "1.0.2-cd43b3",
  "org.scalablytyped" %%% "std" % "4.8-686d1d",
  "org.scalablytyped" %%% "stylelint" % "14.14.1-2fac1b")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
