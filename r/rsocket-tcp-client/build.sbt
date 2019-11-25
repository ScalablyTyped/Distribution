organization := "org.scalablytyped"
name := "rsocket-tcp-client"
version := "0.0-dt-20190708Z-9e479d"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "node" % "12.12-dt-20191123Z-382692",
  "org.scalablytyped" %%% "rsocket-core" % "0.0-dt-20191122Z-169bd9",
  "org.scalablytyped" %%% "rsocket-flowable" % "0.0-dt-20190708Z-5637e5",
  "org.scalablytyped" %%% "rsocket-types" % "0.0-dt-20191122Z-01c8c2",
  "org.scalablytyped" %%% "std" % "3.7-1d724d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        