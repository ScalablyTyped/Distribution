organization := "org.scalablytyped"
name := "sequelize-fixtures"
version := "0.6.0-dt-20190524Z-7b79c1"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20190524Z-1ea477",
  "org.scalablytyped" %%% "continuation-local-storage" % "3.2-dt-20181219Z-1492ac",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20190606Z-454408",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190621Z-8f9d23",
  "org.scalablytyped" %%% "sequelize" % "4.28.0-dt-20190530Z-dea083",
  "org.scalablytyped" %%% "std" % "3.5-d4a303",
  "org.scalablytyped" %%% "validator" % "v10.11.0-dt-20190608Z-b83a73")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        