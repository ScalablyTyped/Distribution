organization := "org.scalablytyped"
name := "run-sequence"
version := "0.0-unknown-dt-20200227Z-2f8914"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "chokidar" % "3.3.1-80b43c",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20200226Z-74ac81",
  "org.scalablytyped" %%% "glob-stream" % "v6.1.0-dt-20200226Z-107c95",
  "org.scalablytyped" %%% "gulp" % "4.0-dt-20200225Z-6208e7",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20200226Z-23b1d1",
  "org.scalablytyped" %%% "node" % "13.13-dt-20200417Z-f3d81d",
  "org.scalablytyped" %%% "std" % "3.8-9b2470",
  "org.scalablytyped" %%% "undertaker" % "1.2-dt-20200225Z-718066",
  "org.scalablytyped" %%% "undertaker-registry" % "1.0-dt-20200225Z-3d3200",
  "org.scalablytyped" %%% "vinyl" % "2.0-dt-20200225Z-bbc6a1",
  "org.scalablytyped" %%% "vinyl-fs" % "2.4-dt-20200227Z-8fd70b")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
