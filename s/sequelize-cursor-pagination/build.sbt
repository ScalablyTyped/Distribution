organization := "org.scalablytyped"
name := "sequelize-cursor-pagination"
version := "1.2-dt-20190524Z-9935e3"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20191111Z-21097f",
  "org.scalablytyped" %%% "continuation-local-storage" % "3.2-dt-20191223Z-bafa86",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20191126Z-7cbffe",
  "org.scalablytyped" %%% "node" % "13.1-dt-20191226Z-155d58",
  "org.scalablytyped" %%% "sequelize" % "4.28.0-dt-20191125Z-5fbe2f",
  "org.scalablytyped" %%% "std" % "3.7-953338",
  "org.scalablytyped" %%% "validator" % "12.0-dt-20191226Z-543ac8")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        