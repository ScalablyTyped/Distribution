organization := "org.scalablytyped"
name := "sequelize-cursor-pagination"
version := "1.2-dt-20190524Z-a98b21"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20191111Z-71aa02",
  "org.scalablytyped" %%% "continuation-local-storage" % "3.2-dt-20191223Z-0ab2aa",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20191126Z-a1c393",
  "org.scalablytyped" %%% "node" % "13.1-dt-20200103Z-51871a",
  "org.scalablytyped" %%% "sequelize" % "4.28.0-dt-20191125Z-c44053",
  "org.scalablytyped" %%% "std" % "3.7-b6d959",
  "org.scalablytyped" %%% "validator" % "12.0-dt-20191226Z-4e1d6a")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        