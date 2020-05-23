organization := "org.scalablytyped"
name := "roads"
version := "6.2.6-eccfe1"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "babel-core" % "6.25-dt-20200226Z-f9dba7",
  "org.scalablytyped" %%% "babel-generator" % "6.25-dt-20200515Z-ee0042",
  "org.scalablytyped" %%% "babel-template" % "6.25-dt-20200226Z-b03dcd",
  "org.scalablytyped" %%% "babel-traverse" % "6.25-dt-20200515Z-535fd7",
  "org.scalablytyped" %%% "babel-types" % "7.0-dt-20200515Z-349e2d",
  "org.scalablytyped" %%% "babelify" % "v7.3.0-dt-20200515Z-79bdd3",
  "org.scalablytyped" %%% "babylon" % "6.16-dt-20200226Z-f6c467",
  "org.scalablytyped" %%% "browserify" % "12.0-dt-20200515Z-c294c3",
  "org.scalablytyped" %%% "cookie" % "0.4-dt-20200513Z-058b7e",
  "org.scalablytyped" %%% "insert-module-globals" % "7.0-dt-20200515Z-82268b",
  "org.scalablytyped" %%% "node" % "14.0-dt-20200521Z-3aabb7",
  "org.scalablytyped" %%% "std" % "3.9-18cbeb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
