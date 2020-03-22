organization := "org.scalablytyped"
name := "rsocket-websocket-client"
version := "0.0-dt-20191126Z-72117d"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "node" % "13.7-dt-20200211Z-b30bde",
  "org.scalablytyped" %%% "rsocket-core" % "0.0-dt-20200207Z-a44a06",
  "org.scalablytyped" %%% "rsocket-flowable" % "0.0-dt-20191126Z-e6d339",
  "org.scalablytyped" %%% "rsocket-types" % "0.0-dt-20191126Z-4b1898",
  "org.scalablytyped" %%% "std" % "3.8-a0108c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
