organization := "org.scalablytyped"
name := "roads"
version := "6.2.6-59b5fd"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "babel-core" % "6.25-dt-20200226Z-66b900",
  "org.scalablytyped" %%% "babel-generator" % "6.25-dt-20200515Z-57c572",
  "org.scalablytyped" %%% "babel-template" % "6.25-dt-20200226Z-a7a6e7",
  "org.scalablytyped" %%% "babel-traverse" % "6.25-dt-20200515Z-c13a91",
  "org.scalablytyped" %%% "babel-types" % "7.0-dt-20200706Z-e74695",
  "org.scalablytyped" %%% "babelify" % "v7.3.0-dt-20200515Z-5d1315",
  "org.scalablytyped" %%% "babylon" % "6.16-dt-20200226Z-ed8018",
  "org.scalablytyped" %%% "browserify" % "12.0-dt-20200515Z-2d042e",
  "org.scalablytyped" %%% "cookie" % "0.4-dt-20200513Z-b27c1e",
  "org.scalablytyped" %%% "insert-module-globals" % "7.0-dt-20200515Z-c175c2",
  "org.scalablytyped" %%% "node" % "14.0-dt-20200724Z-6c1ba3",
  "org.scalablytyped" %%% "std" % "3.9-bafc13")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
