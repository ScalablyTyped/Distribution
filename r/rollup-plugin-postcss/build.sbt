organization := "org.scalablytyped"
name := "rollup-plugin-postcss"
version := "2.0-dt-20200515Z-0e964a"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "cssnano" % "4.0-dt-20180802Z-fa83e9",
  "org.scalablytyped" %%% "estree" % "0.0-unknown-dt-20200515Z-70ee1e",
  "org.scalablytyped" %%% "node" % "14.0-dt-20200521Z-3aabb7",
  "org.scalablytyped" %%% "postcss" % "7.0.27-fc4b5c",
  "org.scalablytyped" %%% "rollup" % "1.32.1-74c50d",
  "org.scalablytyped" %%% "source-map" % "0.7.3-f960ba",
  "org.scalablytyped" %%% "std" % "3.9-18cbeb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
