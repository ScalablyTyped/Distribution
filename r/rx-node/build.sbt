organization := "org.scalablytyped"
name := "rx-node"
version := "0.0-unknown-dt-20190322Z-932557"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "node" % "12.7-dt-20191003Z-a35ed6",
  "org.scalablytyped" %%% "rx-core" % "4.0-dt-20190322Z-46a599",
  "org.scalablytyped" %%% "rx-lite" % "4.0-dt-20190322Z-164e8a",
  "org.scalablytyped" %%% "rx-lite-aggregates" % "4.0-dt-20190322Z-5c855c",
  "org.scalablytyped" %%% "std" % "3.6-abb6d3")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        