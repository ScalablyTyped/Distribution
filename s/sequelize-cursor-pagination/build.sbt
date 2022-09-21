organization := "org.scalablytyped"
name := "sequelize-cursor-pagination"
version := "1.2-dt-20211202Z-32da46"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20220819Z-8ddcaa",
  "org.scalablytyped" %%% "continuation-local-storage" % "3.2-dt-20211223Z-d83ad0",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20220911Z-fe2852",
  "org.scalablytyped" %%% "node" % "18.7-dt-20220913Z-77cc8d",
  "org.scalablytyped" %%% "sequelize" % "4.28.0-dt-20220819Z-886282",
  "org.scalablytyped" %%% "std" % "4.8-958c79",
  "org.scalablytyped" %%% "validator" % "13.7-dt-20220827Z-258dc3")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
