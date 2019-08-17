organization := "org.scalablytyped"
name := "rx-node"
version := "0.0-unknown-dt-20190322Z-5cf2ac"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "node" % "12.7-dt-20190815Z-2dc4df",
  "org.scalablytyped" %%% "rx-core" % "4.0-dt-20190322Z-7ea84b",
  "org.scalablytyped" %%% "rx-lite" % "4.0-dt-20190322Z-1ba79e",
  "org.scalablytyped" %%% "rx-lite-aggregates" % "4.0-dt-20190322Z-371ddc",
  "org.scalablytyped" %%% "std" % "3.5-cd493c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        