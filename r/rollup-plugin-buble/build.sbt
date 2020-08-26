organization := "org.scalablytyped"
name := "rollup-plugin-buble"
version := "0.19-dt-20190312Z-11cae4"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "buble" % "0.19-dt-20190312Z-e1b261",
  "org.scalablytyped" %%% "magic-string" % "0.25.7-0c837b",
  "org.scalablytyped" %%% "rollup" % "2.23.0-da780f",
  "org.scalablytyped" %%% "std" % "3.9-bafc13")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
