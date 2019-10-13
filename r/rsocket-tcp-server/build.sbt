organization := "org.scalablytyped"
name := "rsocket-tcp-server"
version := "0.0-dt-20190708Z-f24c4b"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "node" % "12.7-dt-20191008Z-c62b25",
  "org.scalablytyped" %%% "rsocket-core" % "0.0-dt-20190708Z-f963f2",
  "org.scalablytyped" %%% "rsocket-flowable" % "0.0-dt-20190708Z-ce27ac",
  "org.scalablytyped" %%% "rsocket-types" % "0.0-dt-20190708Z-42fb38",
  "org.scalablytyped" %%% "std" % "3.6-b80e7a")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        