organization := "org.scalablytyped"
name := "sequelize-fixtures"
version := "0.6.0-dt-20220818Z-9dab87"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20220923Z-463b2d",
  "org.scalablytyped" %%% "continuation-local-storage" % "3.2-dt-20211223Z-23c61b",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20220928Z-cacacb",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221020Z-d73de4",
  "org.scalablytyped" %%% "sequelize" % "4.28.0-dt-20220819Z-d900b0",
  "org.scalablytyped" %%% "std" % "4.8-3c7765",
  "org.scalablytyped" %%% "validator" % "13.7-dt-20221022Z-e47a50")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
