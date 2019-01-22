organization := "org.scalablytyped"
name := "sequelize-fixtures"
version := "0.6.0-dt-20180712Z-69a728"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20181213Z-232ecf",
  "org.scalablytyped" %%% "continuation-local-storage" % "3.2-dt-20181219Z-93b4ed",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20190116Z-c48db4",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-7438ae",
  "org.scalablytyped" %%% "sequelize" % "4.27.11-dt-20190116Z-b2b8d7",
  "org.scalablytyped" %%% "std" % "3.2.4-2926f1",
  "org.scalablytyped" %%% "validator" % "v10.9.0-dt-20181214Z-00a1f7")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        