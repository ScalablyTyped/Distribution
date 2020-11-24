organization := "org.scalablytyped"
name := "sequelize-fixtures"
version := "0.6.0-dt-20201002Z-b3e0a4"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20201028Z-8be3cf",
  "org.scalablytyped" %%% "continuation-local-storage" % "3.2-dt-20201002Z-e51ad8",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20201105Z-6fba04",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-ad1aba",
  "org.scalablytyped" %%% "sequelize" % "4.28.0-dt-20201002Z-3be1fe",
  "org.scalablytyped" %%% "std" % "4.1-c651d0",
  "org.scalablytyped" %%% "validator" % "13.1-dt-20200624Z-8d13b2")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
