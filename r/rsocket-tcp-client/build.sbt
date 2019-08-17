organization := "org.scalablytyped"
name := "rsocket-tcp-client"
version := "0.0-dt-20190708Z-25271d"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "node" % "12.7-dt-20190815Z-2dc4df",
  "org.scalablytyped" %%% "rsocket-core" % "0.0-dt-20190708Z-ff38b0",
  "org.scalablytyped" %%% "rsocket-flowable" % "0.0-dt-20190708Z-8ce1ea",
  "org.scalablytyped" %%% "rsocket-types" % "0.0-dt-20190708Z-f6ff69",
  "org.scalablytyped" %%% "std" % "3.5-cd493c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        