organization := "org.scalablytyped"
name := "rdfjs__fetch"
version := "2.0-dt-20200322Z-b0282f"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "node" % "14.0-dt-20200724Z-6c1ba3",
  "org.scalablytyped" %%% "rdf-js" % "3.0-dt-20200710Z-1f3f03",
  "org.scalablytyped" %%% "rdfjs__fetch-lite" % "2.0-dt-20200302Z-2ac336",
  "org.scalablytyped" %%% "rdfjs__sink-map" % "1.0-dt-20200116Z-731f36",
  "org.scalablytyped" %%% "std" % "3.9-bafc13")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
