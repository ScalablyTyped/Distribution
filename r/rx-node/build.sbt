organization := "org.scalablytyped"
name := "rx-node"
version := "0.0-unknown-dt-20190322Z-13c38e"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "node" % "12.7-dt-20190815Z-317602",
  "org.scalablytyped" %%% "rx-core" % "4.0-dt-20190322Z-a04c25",
  "org.scalablytyped" %%% "rx-lite" % "4.0-dt-20190322Z-e49a5e",
  "org.scalablytyped" %%% "rx-lite-aggregates" % "4.0-dt-20190322Z-afed46",
  "org.scalablytyped" %%% "std" % "3.5-65dbfc")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        