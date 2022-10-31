organization := "org.scalablytyped"
name := "sequelize-cursor-pagination"
version := "1.2-dt-20211202Z-d21cb7"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20220923Z-5a7a5b",
  "org.scalablytyped" %%% "continuation-local-storage" % "3.2-dt-20211223Z-c3f49d",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20220928Z-3598f3",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221030Z-57fc1b",
  "org.scalablytyped" %%% "sequelize" % "4.28.0-dt-20220819Z-beb739",
  "org.scalablytyped" %%% "std" % "4.8-837c43",
  "org.scalablytyped" %%% "validator" % "13.7-dt-20221030Z-1cab63")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
