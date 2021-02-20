organization := "org.scalablytyped"
name := "rollup-plugin-postcss"
version := "2.0-dt-20200830Z-2f3976"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.0",
  "org.scalablytyped" %%% "cssnano" % "4.0-dt-20180802Z-e2226c",
  "org.scalablytyped" %%% "postcss" % "7.0.35-381672",
  "org.scalablytyped" %%% "rollup" % "2.33.3-8326d2",
  "org.scalablytyped" %%% "source-map" % "0.7.3-475dad",
  "org.scalablytyped" %%% "std" % "4.1-40053c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
