organization := "org.scalablytyped"
name := "rsocket-websocket-client"
version := "0.0-dt-20190820Z-e156f4"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "node" % "12.11-dt-20191021Z-a8dc6e",
  "org.scalablytyped" %%% "rsocket-core" % "0.0-dt-20190708Z-ea3ab0",
  "org.scalablytyped" %%% "rsocket-flowable" % "0.0-dt-20190708Z-ce27ac",
  "org.scalablytyped" %%% "rsocket-types" % "0.0-dt-20190708Z-1c5754",
  "org.scalablytyped" %%% "std" % "3.6-b80e7a")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        