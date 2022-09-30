organization := "org.scalablytyped"
name := "sequelize-fixtures"
version := "0.6.0-dt-20220818Z-8c8132"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20220923Z-c67867",
  "org.scalablytyped" %%% "continuation-local-storage" % "3.2-dt-20211223Z-a76c54",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20220928Z-c0791d",
  "org.scalablytyped" %%% "node" % "18.7-dt-20220926Z-d201ab",
  "org.scalablytyped" %%% "sequelize" % "4.28.0-dt-20220819Z-2f5092",
  "org.scalablytyped" %%% "std" % "4.8-9f8efb",
  "org.scalablytyped" %%% "validator" % "13.7-dt-20220924Z-afc019")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
