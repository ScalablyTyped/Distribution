organization := "org.scalablytyped"
name := "rx-node"
version := "0.0-unknown-dt-20190322Z-51a5cd"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "node" % "13.1-dt-20200117Z-4be21b",
  "org.scalablytyped" %%% "rx-core" % "4.0-dt-20190322Z-6379b0",
  "org.scalablytyped" %%% "rx-lite" % "4.0-dt-20190322Z-146946",
  "org.scalablytyped" %%% "rx-lite-aggregates" % "4.0-dt-20190322Z-9a0590",
  "org.scalablytyped" %%% "std" % "3.7-96076c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        