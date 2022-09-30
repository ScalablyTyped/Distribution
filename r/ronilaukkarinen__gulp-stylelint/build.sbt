organization := "org.scalablytyped"
name := "ronilaukkarinen__gulp-stylelint"
version := "14.0-dt-20220223Z-f380b5"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "cosmiconfig" % "7.0.1-ae51ff",
  "org.scalablytyped" %%% "postcss" % "8.4.16-57c149",
  "org.scalablytyped" %%% "source-map-js" % "1.0.2-70367f",
  "org.scalablytyped" %%% "std" % "4.8-9f8efb",
  "org.scalablytyped" %%% "stylelint" % "14.13.0-4921e8")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
