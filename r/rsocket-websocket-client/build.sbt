organization := "org.scalablytyped"
name := "rsocket-websocket-client"
version := "0.0-dt-20190820Z-511738"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "node" % "12.7-dt-20191003Z-e91184",
  "org.scalablytyped" %%% "rsocket-core" % "0.0-dt-20190708Z-74a293",
  "org.scalablytyped" %%% "rsocket-flowable" % "0.0-dt-20190708Z-6b60ca",
  "org.scalablytyped" %%% "rsocket-types" % "0.0-dt-20190708Z-fd3271",
  "org.scalablytyped" %%% "std" % "3.6-c16502")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        