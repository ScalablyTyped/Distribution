organization := "org.scalablytyped"
name := "ronilaukkarinen__gulp-stylelint"
version := "14.0-dt-20220223Z-17b5fc"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "cosmiconfig" % "7.1.0-e533ca",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-def929",
  "org.scalablytyped" %%% "postcss" % "8.4.19-076895",
  "org.scalablytyped" %%% "source-map-js" % "1.0.2-8ee3e9",
  "org.scalablytyped" %%% "std" % "4.9-5f989f",
  "org.scalablytyped" %%% "stylelint" % "14.15.0-26d736")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
