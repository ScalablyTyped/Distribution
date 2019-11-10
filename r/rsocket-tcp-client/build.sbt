organization := "org.scalablytyped"
name := "rsocket-tcp-client"
version := "0.0-dt-20190708Z-281db3"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "node" % "12.12-dt-20191108Z-6cbaae",
  "org.scalablytyped" %%% "rsocket-core" % "0.0-dt-20190708Z-d0c829",
  "org.scalablytyped" %%% "rsocket-flowable" % "0.0-dt-20190708Z-6c8884",
  "org.scalablytyped" %%% "rsocket-types" % "0.0-dt-20190708Z-a3e50d",
  "org.scalablytyped" %%% "std" % "3.7-1c17cf")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        