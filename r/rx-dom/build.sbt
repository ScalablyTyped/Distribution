organization := "org.scalablytyped"
name := "rx-dom"
version := "7.0-dt-20180214Z-4fa8dd"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "rx" % "4.1-dt-20190322Z-425072",
  "org.scalablytyped" %%% "rx-core" % "4.0-dt-20190322Z-a6bcd2",
  "org.scalablytyped" %%% "rx-core-binding" % "4.0-dt-20190322Z-16c5e0",
  "org.scalablytyped" %%% "rx-lite" % "4.0-dt-20190322Z-f95e82",
  "org.scalablytyped" %%% "rx-lite-aggregates" % "4.0-dt-20190322Z-8a670c",
  "org.scalablytyped" %%% "rx-lite-async" % "4.0-dt-20181116Z-c2ea69",
  "org.scalablytyped" %%% "rx-lite-backpressure" % "4.0-dt-20180214Z-9fd046",
  "org.scalablytyped" %%% "rx-lite-coincidence" % "4.0-dt-20190322Z-18fb7b",
  "org.scalablytyped" %%% "rx-lite-experimental" % "4.0-dt-20180214Z-f8e8ce",
  "org.scalablytyped" %%% "rx-lite-joinpatterns" % "4.0-dt-20180214Z-34f774",
  "org.scalablytyped" %%% "rx-lite-testing" % "4.0-dt-20180214Z-c9bcb3",
  "org.scalablytyped" %%% "rx-lite-time" % "4.0-dt-20190322Z-665b32",
  "org.scalablytyped" %%% "rx-lite-virtualtime" % "4.0-dt-20190322Z-1f2229",
  "org.scalablytyped" %%% "std" % "3.4-6f75bc")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        