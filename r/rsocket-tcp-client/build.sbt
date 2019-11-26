organization := "org.scalablytyped"
name := "rsocket-tcp-client"
version := "0.0-dt-20190708Z-5360a9"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "node" % "12.12-dt-20191125Z-959704",
  "org.scalablytyped" %%% "rsocket-core" % "0.0-dt-20191122Z-efa403",
  "org.scalablytyped" %%% "rsocket-flowable" % "0.0-dt-20190708Z-5637e5",
  "org.scalablytyped" %%% "rsocket-types" % "0.0-dt-20191122Z-4a9e9a",
  "org.scalablytyped" %%% "std" % "3.7-1d724d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        