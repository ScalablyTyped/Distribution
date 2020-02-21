organization := "org.scalablytyped"
name := "rx-jquery"
version := "0.0-unknown-dt-20190322Z-abe839"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "jquery" % "3.3-dt-20200204Z-ce7107",
  "org.scalablytyped" %%% "rx-core" % "4.0-dt-20190322Z-9ca714",
  "org.scalablytyped" %%% "rx-core-binding" % "4.0-dt-20190322Z-9f1fcd",
  "org.scalablytyped" %%% "rx-lite" % "4.0-dt-20190322Z-0e39ea",
  "org.scalablytyped" %%% "rx-lite-aggregates" % "4.0-dt-20190322Z-ba68fd",
  "org.scalablytyped" %%% "rx-lite-async" % "4.0-dt-20181116Z-26db31",
  "org.scalablytyped" %%% "rx-lite-backpressure" % "4.0-dt-20180214Z-37755f",
  "org.scalablytyped" %%% "rx-lite-coincidence" % "4.0-dt-20190322Z-45a9d7",
  "org.scalablytyped" %%% "rx-lite-experimental" % "4.0-dt-20180214Z-155e8c",
  "org.scalablytyped" %%% "rx-lite-joinpatterns" % "4.0-dt-20180214Z-cc532d",
  "org.scalablytyped" %%% "rx-lite-testing" % "4.0-dt-20180214Z-d952d1",
  "org.scalablytyped" %%% "rx-lite-time" % "4.0-dt-20190322Z-3d9e4f",
  "org.scalablytyped" %%% "rx-lite-virtualtime" % "4.0-dt-20190322Z-4f3db9",
  "org.scalablytyped" %%% "sizzle" % "2.3-dt-20181006Z-a68146",
  "org.scalablytyped" %%% "std" % "3.7-1b8369")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
