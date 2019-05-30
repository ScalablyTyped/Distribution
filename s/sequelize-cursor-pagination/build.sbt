organization := "org.scalablytyped"
name := "sequelize-cursor-pagination"
version := "1.2-dt-20190524Z-5645d5"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20190524Z-462670",
  "org.scalablytyped" %%% "continuation-local-storage" % "3.2-dt-20181219Z-279bb2",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20190523Z-4abba9",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190528Z-2c614a",
  "org.scalablytyped" %%% "sequelize" % "4.28.0-dt-20190524Z-3fb9b3",
  "org.scalablytyped" %%% "std" % "3.5-f010ac",
  "org.scalablytyped" %%% "validator" % "v10.11.0-dt-20190329Z-03f8ef")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        