organization := "org.scalablytyped"
name := "rsocket-websocket-server"
version := "0.0-dt-20191126Z-c6c21f"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "node" % "13.1-dt-20191226Z-155d58",
  "org.scalablytyped" %%% "rsocket-core" % "0.0-dt-20191126Z-68e8c7",
  "org.scalablytyped" %%% "rsocket-flowable" % "0.0-dt-20191126Z-338528",
  "org.scalablytyped" %%% "rsocket-types" % "0.0-dt-20191126Z-815dd9",
  "org.scalablytyped" %%% "std" % "3.7-953338",
  "org.scalablytyped" %%% "ws" % "6.0-dt-20191125Z-c264c7")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        