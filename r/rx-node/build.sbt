organization := "org.scalablytyped"
name := "rx-node"
version := "0.0-unknown-dt-20190322Z-e0276f"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "node" % "12.7-dt-20191003Z-e91184",
  "org.scalablytyped" %%% "rx-core" % "4.0-dt-20190322Z-94909f",
  "org.scalablytyped" %%% "rx-lite" % "4.0-dt-20190322Z-3e8b9d",
  "org.scalablytyped" %%% "rx-lite-aggregates" % "4.0-dt-20190322Z-56360f",
  "org.scalablytyped" %%% "std" % "3.6-c16502")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        