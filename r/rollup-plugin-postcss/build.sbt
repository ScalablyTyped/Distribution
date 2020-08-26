organization := "org.scalablytyped"
name := "rollup-plugin-postcss"
version := "2.0-dt-20200515Z-491af1"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "cssnano" % "4.0-dt-20180802Z-ba41db",
  "org.scalablytyped" %%% "postcss" % "7.0.32-540a6e",
  "org.scalablytyped" %%% "rollup" % "2.23.0-da780f",
  "org.scalablytyped" %%% "source-map" % "0.7.3-ff5daa",
  "org.scalablytyped" %%% "std" % "3.9-bafc13")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
