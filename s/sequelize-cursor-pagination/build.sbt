organization := "org.scalablytyped"
name := "sequelize-cursor-pagination"
version := "1.2-dt-20181019Z-a2c1e8"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20190221Z-f01776",
  "org.scalablytyped" %%% "continuation-local-storage" % "3.2-dt-20181219Z-22ca43",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20190212Z-cf3a73",
  "org.scalablytyped" %%% "node" % "11.9-dt-20190213Z-604ea6",
  "org.scalablytyped" %%% "sequelize" % "4.27.11-dt-20190218Z-ca8a7a",
  "org.scalablytyped" %%% "std" % "3.3-0ec965",
  "org.scalablytyped" %%% "validator" % "v10.9.0-dt-20181214Z-93e6e9")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        