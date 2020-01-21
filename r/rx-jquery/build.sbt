organization := "org.scalablytyped"
name := "rx-jquery"
version := "0.0-unknown-dt-20190322Z-aa7ffa"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "jquery" % "3.3-dt-20191126Z-e499a9",
  "org.scalablytyped" %%% "rx-core" % "4.0-dt-20190322Z-6379b0",
  "org.scalablytyped" %%% "rx-core-binding" % "4.0-dt-20190322Z-a36982",
  "org.scalablytyped" %%% "rx-lite" % "4.0-dt-20190322Z-146946",
  "org.scalablytyped" %%% "rx-lite-aggregates" % "4.0-dt-20190322Z-9a0590",
  "org.scalablytyped" %%% "rx-lite-async" % "4.0-dt-20181116Z-bb1226",
  "org.scalablytyped" %%% "rx-lite-backpressure" % "4.0-dt-20180214Z-ccb966",
  "org.scalablytyped" %%% "rx-lite-coincidence" % "4.0-dt-20190322Z-7aa72a",
  "org.scalablytyped" %%% "rx-lite-experimental" % "4.0-dt-20180214Z-1292f2",
  "org.scalablytyped" %%% "rx-lite-joinpatterns" % "4.0-dt-20180214Z-609f02",
  "org.scalablytyped" %%% "rx-lite-testing" % "4.0-dt-20180214Z-2f9f31",
  "org.scalablytyped" %%% "rx-lite-time" % "4.0-dt-20190322Z-14edf5",
  "org.scalablytyped" %%% "rx-lite-virtualtime" % "4.0-dt-20190322Z-7a17dd",
  "org.scalablytyped" %%% "sizzle" % "2.3-dt-20181006Z-8d2e4e",
  "org.scalablytyped" %%% "std" % "3.7-96076c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        