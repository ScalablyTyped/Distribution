organization := "org.scalablytyped"
name := "rsocket-tcp-server"
version := "0.0-dt-20190708Z-e9599b"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "node" % "12.11-dt-20191015Z-4f243e",
  "org.scalablytyped" %%% "rsocket-core" % "0.0-dt-20190708Z-7cb951",
  "org.scalablytyped" %%% "rsocket-flowable" % "0.0-dt-20190708Z-ce27ac",
  "org.scalablytyped" %%% "rsocket-types" % "0.0-dt-20190708Z-d4112d",
  "org.scalablytyped" %%% "std" % "3.6-b80e7a")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        