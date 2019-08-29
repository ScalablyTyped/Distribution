organization := "org.scalablytyped"
name := "rx-jquery"
version := "0.0-unknown-dt-20190322Z-d7d580"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "jquery" % "3.3-dt-20190815Z-e99267",
  "org.scalablytyped" %%% "rx-core" % "4.0-dt-20190322Z-94909f",
  "org.scalablytyped" %%% "rx-core-binding" % "4.0-dt-20190322Z-c16d21",
  "org.scalablytyped" %%% "rx-lite" % "4.0-dt-20190322Z-3e8b9d",
  "org.scalablytyped" %%% "rx-lite-aggregates" % "4.0-dt-20190322Z-56360f",
  "org.scalablytyped" %%% "rx-lite-async" % "4.0-dt-20181116Z-549c6b",
  "org.scalablytyped" %%% "rx-lite-backpressure" % "4.0-dt-20180214Z-bc7ab3",
  "org.scalablytyped" %%% "rx-lite-coincidence" % "4.0-dt-20190322Z-c27f80",
  "org.scalablytyped" %%% "rx-lite-experimental" % "4.0-dt-20180214Z-d71a6f",
  "org.scalablytyped" %%% "rx-lite-joinpatterns" % "4.0-dt-20180214Z-c5ebb6",
  "org.scalablytyped" %%% "rx-lite-testing" % "4.0-dt-20180214Z-0a8b6a",
  "org.scalablytyped" %%% "rx-lite-time" % "4.0-dt-20190322Z-24a71f",
  "org.scalablytyped" %%% "rx-lite-virtualtime" % "4.0-dt-20190322Z-bad4b1",
  "org.scalablytyped" %%% "sizzle" % "2.3-dt-20181006Z-830e2a",
  "org.scalablytyped" %%% "std" % "3.6-c16502")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        