organization := "org.scalablytyped"
name := "rx-jquery"
version := "0.0-unknown-dt-20190322Z-ca187d"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "jquery" % "3.3-dt-20191126Z-d6bfbf",
  "org.scalablytyped" %%% "rx-core" % "4.0-dt-20190322Z-b91d25",
  "org.scalablytyped" %%% "rx-core-binding" % "4.0-dt-20190322Z-a62abb",
  "org.scalablytyped" %%% "rx-lite" % "4.0-dt-20190322Z-03325e",
  "org.scalablytyped" %%% "rx-lite-aggregates" % "4.0-dt-20190322Z-d3a16e",
  "org.scalablytyped" %%% "rx-lite-async" % "4.0-dt-20181116Z-2999a3",
  "org.scalablytyped" %%% "rx-lite-backpressure" % "4.0-dt-20180214Z-05a580",
  "org.scalablytyped" %%% "rx-lite-coincidence" % "4.0-dt-20190322Z-de9cc4",
  "org.scalablytyped" %%% "rx-lite-experimental" % "4.0-dt-20180214Z-9e687c",
  "org.scalablytyped" %%% "rx-lite-joinpatterns" % "4.0-dt-20180214Z-a9c0f8",
  "org.scalablytyped" %%% "rx-lite-testing" % "4.0-dt-20180214Z-ec4471",
  "org.scalablytyped" %%% "rx-lite-time" % "4.0-dt-20190322Z-13664f",
  "org.scalablytyped" %%% "rx-lite-virtualtime" % "4.0-dt-20190322Z-f616c3",
  "org.scalablytyped" %%% "sizzle" % "2.3-dt-20181006Z-a9f7cc",
  "org.scalablytyped" %%% "std" % "3.7-b6d959")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        