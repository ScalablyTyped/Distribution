organization := "org.scalablytyped"
name := "rsocket-websocket-server"
version := "0.0-dt-20191126Z-2381ec"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "node" % "13.1-dt-20200115Z-14f523",
  "org.scalablytyped" %%% "rsocket-core" % "0.0-dt-20191126Z-8008fa",
  "org.scalablytyped" %%% "rsocket-flowable" % "0.0-dt-20191126Z-ba5fbe",
  "org.scalablytyped" %%% "rsocket-types" % "0.0-dt-20191126Z-0acdfb",
  "org.scalablytyped" %%% "std" % "3.7-b6d959",
  "org.scalablytyped" %%% "ws" % "7.2-dt-20200115Z-9b706a")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        