organization := "org.scalablytyped"
name := "sequelize-fixtures"
version := "0.6.0-dt-20190524Z-979bbd"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20191111Z-26a703",
  "org.scalablytyped" %%% "continuation-local-storage" % "3.2-dt-20191223Z-1ec853",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20200130Z-a55e30",
  "org.scalablytyped" %%% "node" % "13.7-dt-20200211Z-d6af7e",
  "org.scalablytyped" %%% "sequelize" % "4.28.0-dt-20191125Z-344838",
  "org.scalablytyped" %%% "std" % "3.7-1b8369",
  "org.scalablytyped" %%% "validator" % "12.0-dt-20191226Z-311b84")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
