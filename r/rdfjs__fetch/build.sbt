organization := "org.scalablytyped"
name := "rdfjs__fetch"
version := "2.0-dt-20200322Z-127417"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "node" % "14.0-dt-20200624Z-2fcd45",
  "org.scalablytyped" %%% "rdf-js" % "3.0-dt-20200624Z-139a04",
  "org.scalablytyped" %%% "rdfjs__fetch-lite" % "2.0-dt-20200302Z-3c5208",
  "org.scalablytyped" %%% "rdfjs__sink-map" % "1.0-dt-20200116Z-185da2",
  "org.scalablytyped" %%% "std" % "3.9-c9f1f8")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
