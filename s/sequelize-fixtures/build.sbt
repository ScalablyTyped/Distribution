organization := "org.scalablytyped"
name := "sequelize-fixtures"
version := "0.6.0-dt-20180910Z-63ad03"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20180910Z-b88fdf",
  "org.scalablytyped" %%% "continuation-local-storage" % "3.2-dt-20180910Z-98b3ff",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20181204Z-93340d",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181213Z-bd3349",
  "org.scalablytyped" %%% "sequelize" % "4.27.11-dt-20181211Z-47f37a",
  "org.scalablytyped" %%% "std" % "3.2.2-04ea79",
  "org.scalablytyped" %%% "validator" % "v9.4-dt-20181213Z-c8893f")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        