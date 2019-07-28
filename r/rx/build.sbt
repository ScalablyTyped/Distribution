organization := "org.scalablytyped"
name := "rx"
version := "4.1-dt-20190322Z-9507fd"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "rx-core" % "4.0-dt-20190322Z-a04c25",
  "org.scalablytyped" %%% "rx-core-binding" % "4.0-dt-20190322Z-1a75b3",
  "org.scalablytyped" %%% "rx-lite" % "4.0-dt-20190322Z-e49a5e",
  "org.scalablytyped" %%% "rx-lite-aggregates" % "4.0-dt-20190322Z-afed46",
  "org.scalablytyped" %%% "rx-lite-async" % "4.0-dt-20181116Z-fa2f97",
  "org.scalablytyped" %%% "rx-lite-backpressure" % "4.0-dt-20180214Z-8afbe6",
  "org.scalablytyped" %%% "rx-lite-coincidence" % "4.0-dt-20190322Z-083e5f",
  "org.scalablytyped" %%% "rx-lite-experimental" % "4.0-dt-20180214Z-d3fe7c",
  "org.scalablytyped" %%% "rx-lite-joinpatterns" % "4.0-dt-20180214Z-7fd496",
  "org.scalablytyped" %%% "rx-lite-testing" % "4.0-dt-20180214Z-076dc1",
  "org.scalablytyped" %%% "rx-lite-time" % "4.0-dt-20190322Z-aee230",
  "org.scalablytyped" %%% "rx-lite-virtualtime" % "4.0-dt-20190322Z-3a11b2",
  "org.scalablytyped" %%% "std" % "3.5-65dbfc")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        