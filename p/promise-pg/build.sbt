organization := "org.scalablytyped"
name := "promise-pg"
version := "0.0-unknown-dt-20190322Z-9e3578"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "node" % "13.1-dt-20191226Z-155d58",
  "org.scalablytyped" %%% "pg" % "7.14-dt-20191223Z-8e6847",
  "org.scalablytyped" %%% "pg-types" % "1.11-dt-20191101Z-e11e2f",
  "org.scalablytyped" %%% "q" % "1.5-dt-20190313Z-e8577d",
  "org.scalablytyped" %%% "std" % "3.7-953338")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        