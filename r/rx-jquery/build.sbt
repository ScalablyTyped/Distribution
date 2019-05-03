organization := "org.scalablytyped"
name := "rx-jquery"
version := "0.0-unknown-dt-20190322Z-89d3a7"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "jquery" % "3.3-dt-20190108Z-f3f7a8",
  "org.scalablytyped" %%% "rx-core" % "4.0-dt-20190322Z-b18b5a",
  "org.scalablytyped" %%% "rx-core-binding" % "4.0-dt-20190322Z-6fe5ad",
  "org.scalablytyped" %%% "rx-lite" % "4.0-dt-20190322Z-398942",
  "org.scalablytyped" %%% "rx-lite-aggregates" % "4.0-dt-20190322Z-0fdb45",
  "org.scalablytyped" %%% "rx-lite-async" % "4.0-dt-20181116Z-6f4008",
  "org.scalablytyped" %%% "rx-lite-backpressure" % "4.0-dt-20180214Z-7f20bc",
  "org.scalablytyped" %%% "rx-lite-coincidence" % "4.0-dt-20190322Z-d957de",
  "org.scalablytyped" %%% "rx-lite-experimental" % "4.0-dt-20180214Z-7dd9ee",
  "org.scalablytyped" %%% "rx-lite-joinpatterns" % "4.0-dt-20180214Z-643086",
  "org.scalablytyped" %%% "rx-lite-testing" % "4.0-dt-20180214Z-3f87f3",
  "org.scalablytyped" %%% "rx-lite-time" % "4.0-dt-20190322Z-07252c",
  "org.scalablytyped" %%% "rx-lite-virtualtime" % "4.0-dt-20190322Z-eb96e7",
  "org.scalablytyped" %%% "sizzle" % "2.3-dt-20181006Z-fbd298",
  "org.scalablytyped" %%% "std" % "3.4-8a92b2")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        