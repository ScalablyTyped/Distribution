organization := "org.scalablytyped"
name := "sequelize"
version := "4.28.0-dt-20220819Z-9c354a"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20220923Z-463b2d",
  "org.scalablytyped" %%% "continuation-local-storage" % "3.2-dt-20211223Z-bcf397",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20220928Z-cacacb",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221015Z-0a42ca",
  "org.scalablytyped" %%% "std" % "4.8-3c7765",
  "org.scalablytyped" %%% "validator" % "13.7-dt-20221015Z-d25a94")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
