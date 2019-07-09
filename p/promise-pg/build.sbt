organization := "org.scalablytyped"
name := "promise-pg"
version := "0.0-unknown-dt-20190322Z-78c6d7"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "node" % "12.6-dt-20190708Z-e1e986",
  "org.scalablytyped" %%% "pg" % "7.4-dt-20190319Z-5bf0e2",
  "org.scalablytyped" %%% "pg-types" % "1.11-dt-20180214Z-249a99",
  "org.scalablytyped" %%% "q" % "1.5-dt-20190313Z-af1529",
  "org.scalablytyped" %%% "std" % "3.5-983486")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        