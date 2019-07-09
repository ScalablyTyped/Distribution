organization := "org.scalablytyped"
name := "sequelize-cursor-pagination"
version := "1.2-dt-20190524Z-34f4e1"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20190524Z-aebf09",
  "org.scalablytyped" %%% "continuation-local-storage" % "3.2-dt-20181219Z-b1378c",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20190708Z-b8e808",
  "org.scalablytyped" %%% "node" % "12.6-dt-20190708Z-e1e986",
  "org.scalablytyped" %%% "sequelize" % "4.28.0-dt-20190530Z-a6c2a3",
  "org.scalablytyped" %%% "std" % "3.5-983486",
  "org.scalablytyped" %%% "validator" % "v10.11.0-dt-20190608Z-1509b3")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        