organization := "org.scalablytyped"
name := "sequelize-fixtures"
version := "0.6.0-dt-20190524Z-8e23b6"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20190524Z-2c5248",
  "org.scalablytyped" %%% "continuation-local-storage" % "3.2-dt-20181219Z-dc0f93",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20190708Z-370309",
  "org.scalablytyped" %%% "node" % "12.6-dt-20190717Z-f93e3e",
  "org.scalablytyped" %%% "sequelize" % "4.28.0-dt-20190722Z-3e4393",
  "org.scalablytyped" %%% "std" % "3.5-65dbfc",
  "org.scalablytyped" %%% "validator" % "v10.11.0-dt-20190723Z-92da09")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        