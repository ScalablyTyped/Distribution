organization := "org.scalablytyped"
name := "sequelize-fixtures"
version := "0.6.0-dt-20201002Z-1eb209"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20201028Z-d92e91",
  "org.scalablytyped" %%% "continuation-local-storage" % "3.2-dt-20201002Z-949b6c",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20201105Z-866bbb",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-e00132",
  "org.scalablytyped" %%% "sequelize" % "4.28.0-dt-20201002Z-db938b",
  "org.scalablytyped" %%% "std" % "4.1-2f6855",
  "org.scalablytyped" %%% "validator" % "13.1-dt-20200624Z-eb3de2")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
