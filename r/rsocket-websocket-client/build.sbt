organization := "org.scalablytyped"
name := "rsocket-websocket-client"
version := "0.0-dt-20191126Z-76ce6e"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "node" % "13.1-dt-20200103Z-51871a",
  "org.scalablytyped" %%% "rsocket-core" % "0.0-dt-20191126Z-5ff22e",
  "org.scalablytyped" %%% "rsocket-flowable" % "0.0-dt-20191126Z-ba5fbe",
  "org.scalablytyped" %%% "rsocket-types" % "0.0-dt-20191126Z-24e2f4",
  "org.scalablytyped" %%% "std" % "3.7-b6d959")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        