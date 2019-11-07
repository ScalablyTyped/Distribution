organization := "org.scalablytyped"
name := "rx-node"
version := "0.0-unknown-dt-20190322Z-64a9ba"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "node" % "12.12-dt-20191105Z-2397f3",
  "org.scalablytyped" %%% "rx-core" % "4.0-dt-20190322Z-bbe0c5",
  "org.scalablytyped" %%% "rx-lite" % "4.0-dt-20190322Z-762cb5",
  "org.scalablytyped" %%% "rx-lite-aggregates" % "4.0-dt-20190322Z-623e14",
  "org.scalablytyped" %%% "std" % "3.7-1c17cf")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        