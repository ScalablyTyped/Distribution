organization := "org.scalablytyped"
name := "rx"
version := "4.1-dt-20190322Z-b7e1d8"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "rx-core" % "4.0-dt-20190322Z-7ea84b",
  "org.scalablytyped" %%% "rx-core-binding" % "4.0-dt-20190322Z-4a8453",
  "org.scalablytyped" %%% "rx-lite" % "4.0-dt-20190322Z-1ba79e",
  "org.scalablytyped" %%% "rx-lite-aggregates" % "4.0-dt-20190322Z-371ddc",
  "org.scalablytyped" %%% "rx-lite-async" % "4.0-dt-20181116Z-2362af",
  "org.scalablytyped" %%% "rx-lite-backpressure" % "4.0-dt-20180214Z-a584e0",
  "org.scalablytyped" %%% "rx-lite-coincidence" % "4.0-dt-20190322Z-494747",
  "org.scalablytyped" %%% "rx-lite-experimental" % "4.0-dt-20180214Z-2014cd",
  "org.scalablytyped" %%% "rx-lite-joinpatterns" % "4.0-dt-20180214Z-c5ebb6",
  "org.scalablytyped" %%% "rx-lite-testing" % "4.0-dt-20180214Z-961100",
  "org.scalablytyped" %%% "rx-lite-time" % "4.0-dt-20190322Z-842b68",
  "org.scalablytyped" %%% "rx-lite-virtualtime" % "4.0-dt-20190322Z-99de9b",
  "org.scalablytyped" %%% "std" % "3.5-cd493c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        