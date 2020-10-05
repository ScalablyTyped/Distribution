organization := "org.scalablytyped"
name := "serve-static"
version := "1.13-dt-20200519Z-1fda01"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.17-dt-20200722Z-533792",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20200722Z-2804ea",
  "org.scalablytyped" %%% "node" % "14.0-dt-20200724Z-371e98",
  "org.scalablytyped" %%% "qs" % "6.9-dt-20200519Z-16080f",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-9592a6",
  "org.scalablytyped" %%% "std" % "3.9-7c0472")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
