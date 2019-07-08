organization := "org.scalablytyped"
name := "rx-jquery"
version := "0.0-unknown-dt-20190322Z-25c2df"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "jquery" % "3.3-dt-20190624Z-b9b940",
  "org.scalablytyped" %%% "rx-core" % "4.0-dt-20190322Z-5d07b3",
  "org.scalablytyped" %%% "rx-core-binding" % "4.0-dt-20190322Z-dd0e40",
  "org.scalablytyped" %%% "rx-lite" % "4.0-dt-20190322Z-6eb503",
  "org.scalablytyped" %%% "rx-lite-aggregates" % "4.0-dt-20190322Z-fdbc23",
  "org.scalablytyped" %%% "rx-lite-async" % "4.0-dt-20181116Z-1c6ec8",
  "org.scalablytyped" %%% "rx-lite-backpressure" % "4.0-dt-20180214Z-7ddd40",
  "org.scalablytyped" %%% "rx-lite-coincidence" % "4.0-dt-20190322Z-cd817e",
  "org.scalablytyped" %%% "rx-lite-experimental" % "4.0-dt-20180214Z-56180e",
  "org.scalablytyped" %%% "rx-lite-joinpatterns" % "4.0-dt-20180214Z-8f940a",
  "org.scalablytyped" %%% "rx-lite-testing" % "4.0-dt-20180214Z-cb5535",
  "org.scalablytyped" %%% "rx-lite-time" % "4.0-dt-20190322Z-0f287a",
  "org.scalablytyped" %%% "rx-lite-virtualtime" % "4.0-dt-20190322Z-206897",
  "org.scalablytyped" %%% "sizzle" % "2.3-dt-20181006Z-c53ffb",
  "org.scalablytyped" %%% "std" % "3.5-983486")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        