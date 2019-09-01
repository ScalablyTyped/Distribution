organization := "org.scalablytyped"
name := "rsocket-websocket-server"
version := "0.0-dt-20190708Z-2d01ff"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "node" % "12.7-dt-20190830Z-a302b7",
  "org.scalablytyped" %%% "rsocket-core" % "0.0-dt-20190708Z-909fda",
  "org.scalablytyped" %%% "rsocket-flowable" % "0.0-dt-20190708Z-6b60ca",
  "org.scalablytyped" %%% "rsocket-types" % "0.0-dt-20190708Z-d3b42b",
  "org.scalablytyped" %%% "std" % "3.6-c16502",
  "org.scalablytyped" %%% "ws" % "6.0-dt-20190823Z-4e4590")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        