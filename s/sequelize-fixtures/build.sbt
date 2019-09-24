organization := "org.scalablytyped"
name := "sequelize-fixtures"
version := "0.6.0-dt-20190524Z-614e1e"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20190524Z-183d02",
  "org.scalablytyped" %%% "continuation-local-storage" % "3.2-dt-20190813Z-0ac9d9",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20190923Z-9fa94d",
  "org.scalablytyped" %%% "node" % "12.7-dt-20190911Z-da4655",
  "org.scalablytyped" %%% "sequelize" % "4.28.0-dt-20190722Z-e28491",
  "org.scalablytyped" %%% "std" % "3.6-c16502",
  "org.scalablytyped" %%% "validator" % "v10.11.0-dt-20190819Z-820111")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        