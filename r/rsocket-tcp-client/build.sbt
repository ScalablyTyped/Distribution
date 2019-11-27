organization := "org.scalablytyped"
name := "rsocket-tcp-client"
version := "0.0-dt-20191126Z-1d3e59"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "node" % "12.12-dt-20191126Z-08e889",
  "org.scalablytyped" %%% "rsocket-core" % "0.0-dt-20191126Z-d8ae07",
  "org.scalablytyped" %%% "rsocket-flowable" % "0.0-dt-20191126Z-e7f407",
  "org.scalablytyped" %%% "rsocket-types" % "0.0-dt-20191126Z-0de406",
  "org.scalablytyped" %%% "std" % "3.7-1d724d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        