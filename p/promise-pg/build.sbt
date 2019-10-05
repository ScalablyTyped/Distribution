organization := "org.scalablytyped"
name := "promise-pg"
version := "0.0-unknown-dt-20190322Z-f20b20"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "node" % "12.7-dt-20191003Z-a35ed6",
  "org.scalablytyped" %%% "pg" % "7.11-dt-20190926Z-b666bc",
  "org.scalablytyped" %%% "pg-types" % "1.11-dt-20180214Z-45afbf",
  "org.scalablytyped" %%% "q" % "1.5-dt-20190313Z-c2a163",
  "org.scalablytyped" %%% "std" % "3.6-abb6d3")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        