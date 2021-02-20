organization := "org.scalablytyped"
name := "sequelize-fixtures"
version := "0.6.0-dt-20201002Z-f45039"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.0",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20201028Z-8d4fd2",
  "org.scalablytyped" %%% "continuation-local-storage" % "3.2-dt-20201002Z-322e2f",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20201105Z-32c157",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-50d3d9",
  "org.scalablytyped" %%% "sequelize" % "4.28.0-dt-20201002Z-2109f2",
  "org.scalablytyped" %%% "std" % "4.1-40053c",
  "org.scalablytyped" %%% "validator" % "13.1-dt-20200624Z-ee1ccf")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
