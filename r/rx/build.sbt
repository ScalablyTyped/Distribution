organization := "org.scalablytyped"
name := "rx"
version := "4.1-dt-20190322Z-65936f"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "rx-core" % "4.0-dt-20190322Z-2bc65c",
  "org.scalablytyped" %%% "rx-core-binding" % "4.0-dt-20190322Z-0e948f",
  "org.scalablytyped" %%% "rx-lite" % "4.0-dt-20190322Z-1799fb",
  "org.scalablytyped" %%% "rx-lite-aggregates" % "4.0-dt-20190322Z-358478",
  "org.scalablytyped" %%% "rx-lite-async" % "4.0-dt-20181116Z-15dcbf",
  "org.scalablytyped" %%% "rx-lite-backpressure" % "4.0-dt-20180214Z-fbd20d",
  "org.scalablytyped" %%% "rx-lite-coincidence" % "4.0-dt-20190322Z-c16d36",
  "org.scalablytyped" %%% "rx-lite-experimental" % "4.0-dt-20180214Z-60b254",
  "org.scalablytyped" %%% "rx-lite-joinpatterns" % "4.0-dt-20180214Z-a9c0f8",
  "org.scalablytyped" %%% "rx-lite-testing" % "4.0-dt-20180214Z-c8c1a6",
  "org.scalablytyped" %%% "rx-lite-time" % "4.0-dt-20190322Z-58cd21",
  "org.scalablytyped" %%% "rx-lite-virtualtime" % "4.0-dt-20190322Z-59bc09",
  "org.scalablytyped" %%% "std" % "3.7-953338")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        