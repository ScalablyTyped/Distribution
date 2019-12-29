organization := "org.scalablytyped"
name := "run-sequence"
version := "0.0-unknown-dt-20190322Z-222acb"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "chokidar" % "3.3.1-d75dce",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20180920Z-f9044d",
  "org.scalablytyped" %%% "glob-stream" % "v6.1.0-dt-20190322Z-f2cb3d",
  "org.scalablytyped" %%% "gulp" % "4.0-dt-20190405Z-9fbacd",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180214Z-815e4e",
  "org.scalablytyped" %%% "node" % "13.1-dt-20191226Z-155d58",
  "org.scalablytyped" %%% "std" % "3.7-953338",
  "org.scalablytyped" %%% "undertaker" % "1.2-dt-20190405Z-0db092",
  "org.scalablytyped" %%% "undertaker-registry" % "1.0-dt-20180214Z-b5f4da",
  "org.scalablytyped" %%% "vinyl" % "2.0-dt-20191106Z-bb6f47",
  "org.scalablytyped" %%% "vinyl-fs" % "2.4-dt-20190228Z-65ef54")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        