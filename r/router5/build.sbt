organization := "org.scalablytyped"
name := "router5"
version := "8.0.1-e335a9"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "path-parser" % "6.1.0-df5ef5",
  "org.scalablytyped" %%% "route-node" % "4.1.1-fce761",
  "org.scalablytyped" %%% "router5-transition-path" % "8.0.1-8d47e0",
  "org.scalablytyped" %%% "search-params" % "3.0.0-87ec43",
  "org.scalablytyped" %%% "std" % "4.1-c651d0")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
