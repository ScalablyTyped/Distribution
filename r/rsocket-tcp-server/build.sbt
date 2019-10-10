organization := "org.scalablytyped"
name := "rsocket-tcp-server"
version := "0.0-dt-20190708Z-8ad003"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "node" % "12.7-dt-20191008Z-8637fd",
  "org.scalablytyped" %%% "rsocket-core" % "0.0-dt-20190708Z-91a96b",
  "org.scalablytyped" %%% "rsocket-flowable" % "0.0-dt-20190708Z-1ad808",
  "org.scalablytyped" %%% "rsocket-types" % "0.0-dt-20190708Z-c66a65",
  "org.scalablytyped" %%% "std" % "3.6-abb6d3")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        