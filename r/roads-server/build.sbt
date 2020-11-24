organization := "org.scalablytyped"
name := "roads-server"
version := "1.0.3-11410e"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "babel-core" % "6.25-dt-20200226Z-80e6f1",
  "org.scalablytyped" %%% "babel-generator" % "6.25-dt-20200515Z-f36761",
  "org.scalablytyped" %%% "babel-template" % "6.25-dt-20200226Z-d37ec6",
  "org.scalablytyped" %%% "babel-traverse" % "6.25-dt-20200515Z-360144",
  "org.scalablytyped" %%% "babel-types" % "7.0-dt-20200902Z-2650a9",
  "org.scalablytyped" %%% "babelify" % "v7.3.0-dt-20200923Z-7330b1",
  "org.scalablytyped" %%% "babylon" % "6.16-dt-20200226Z-b465c9",
  "org.scalablytyped" %%% "browserify" % "12.0-dt-20200923Z-9f69e9",
  "org.scalablytyped" %%% "cookie" % "0.4-dt-20200513Z-e93ca9",
  "org.scalablytyped" %%% "insert-module-globals" % "7.0-dt-20200515Z-eabf99",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-ad1aba",
  "org.scalablytyped" %%% "roads" % "6.3.1-79ce88",
  "org.scalablytyped" %%% "std" % "4.1-c651d0")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
