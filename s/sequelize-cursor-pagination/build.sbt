organization := "org.scalablytyped"
name := "sequelize-cursor-pagination"
version := "1.2-dt-20181019Z-21559f"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20190225Z-0bae51",
  "org.scalablytyped" %%% "continuation-local-storage" % "3.2-dt-20181219Z-00df9f",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20190402Z-407536",
  "org.scalablytyped" %%% "node" % "11.13-dt-20190429Z-40b461",
  "org.scalablytyped" %%% "sequelize" % "4.27.11-dt-20190412Z-8a08b6",
  "org.scalablytyped" %%% "std" % "3.4-495f93",
  "org.scalablytyped" %%% "validator" % "v10.11.0-dt-20190329Z-1b1624")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        