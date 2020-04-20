organization := "org.scalablytyped"
name := "sequelize-fixtures"
version := "0.6.0-dt-20200225Z-ccf52c"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20200302Z-5cd42f",
  "org.scalablytyped" %%% "continuation-local-storage" % "3.2-dt-20200225Z-ced8a9",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20200417Z-b4ce9c",
  "org.scalablytyped" %%% "node" % "13.13-dt-20200417Z-f3d81d",
  "org.scalablytyped" %%% "sequelize" % "4.28.0-dt-20200225Z-a4dd7b",
  "org.scalablytyped" %%% "std" % "3.8-9b2470",
  "org.scalablytyped" %%% "validator" % "13.0-dt-20200407Z-88f80d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
