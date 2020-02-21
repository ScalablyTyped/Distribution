organization := "org.scalablytyped"
name := "rollup-plugin-postcss"
version := "2.0-dt-20190808Z-6d9868"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "cssnano" % "4.0-dt-20180802Z-872595",
  "org.scalablytyped" %%% "estree" % "0.0-unknown-dt-20200108Z-f39507",
  "org.scalablytyped" %%% "node" % "13.7-dt-20200211Z-d6af7e",
  "org.scalablytyped" %%% "postcss" % "7.0.18-b0c294",
  "org.scalablytyped" %%% "rollup" % "1.31.1-26b1ed",
  "org.scalablytyped" %%% "source-map" % "0.7.3-4d8ff1",
  "org.scalablytyped" %%% "std" % "3.7-1b8369")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
