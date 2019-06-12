organization := "org.scalablytyped"
name := "rx"
version := "4.1-dt-20190322Z-491c3f"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "rx-core" % "4.0-dt-20190322Z-15bd27",
  "org.scalablytyped" %%% "rx-core-binding" % "4.0-dt-20190322Z-a1f3ca",
  "org.scalablytyped" %%% "rx-lite" % "4.0-dt-20190322Z-e9d43f",
  "org.scalablytyped" %%% "rx-lite-aggregates" % "4.0-dt-20190322Z-930cfa",
  "org.scalablytyped" %%% "rx-lite-async" % "4.0-dt-20181116Z-16a465",
  "org.scalablytyped" %%% "rx-lite-backpressure" % "4.0-dt-20180214Z-dc3054",
  "org.scalablytyped" %%% "rx-lite-coincidence" % "4.0-dt-20190322Z-1378f5",
  "org.scalablytyped" %%% "rx-lite-experimental" % "4.0-dt-20180214Z-1220c6",
  "org.scalablytyped" %%% "rx-lite-joinpatterns" % "4.0-dt-20180214Z-3b2dc4",
  "org.scalablytyped" %%% "rx-lite-testing" % "4.0-dt-20180214Z-c3a693",
  "org.scalablytyped" %%% "rx-lite-time" % "4.0-dt-20190322Z-2f4044",
  "org.scalablytyped" %%% "rx-lite-virtualtime" % "4.0-dt-20190322Z-fa50e9",
  "org.scalablytyped" %%% "std" % "3.5-c5d119")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        