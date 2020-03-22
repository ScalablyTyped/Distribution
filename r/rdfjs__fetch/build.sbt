organization := "org.scalablytyped"
name := "rdfjs__fetch"
version := "2.0-dt-20200302Z-bfe969"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "node" % "13.9-dt-20200318Z-96a265",
  "org.scalablytyped" %%% "rdf-js" % "2.0-dt-20200127Z-3f8437",
  "org.scalablytyped" %%% "rdfjs__fetch-lite" % "2.0-dt-20200302Z-75300c",
  "org.scalablytyped" %%% "rdfjs__sink-map" % "1.0-dt-20200116Z-80719d",
  "org.scalablytyped" %%% "std" % "3.8-a0108c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
