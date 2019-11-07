organization := "org.scalablytyped"
name := "rx"
version := "4.1-dt-20190322Z-8f0f9e"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "rx-core" % "4.0-dt-20190322Z-bbe0c5",
  "org.scalablytyped" %%% "rx-core-binding" % "4.0-dt-20190322Z-e6bc4c",
  "org.scalablytyped" %%% "rx-lite" % "4.0-dt-20190322Z-762cb5",
  "org.scalablytyped" %%% "rx-lite-aggregates" % "4.0-dt-20190322Z-623e14",
  "org.scalablytyped" %%% "rx-lite-async" % "4.0-dt-20181116Z-eaaaaf",
  "org.scalablytyped" %%% "rx-lite-backpressure" % "4.0-dt-20180214Z-57abc2",
  "org.scalablytyped" %%% "rx-lite-coincidence" % "4.0-dt-20190322Z-0a91f5",
  "org.scalablytyped" %%% "rx-lite-experimental" % "4.0-dt-20180214Z-f1c055",
  "org.scalablytyped" %%% "rx-lite-joinpatterns" % "4.0-dt-20180214Z-e36031",
  "org.scalablytyped" %%% "rx-lite-testing" % "4.0-dt-20180214Z-1494c6",
  "org.scalablytyped" %%% "rx-lite-time" % "4.0-dt-20190322Z-3aff07",
  "org.scalablytyped" %%% "rx-lite-virtualtime" % "4.0-dt-20190322Z-146654",
  "org.scalablytyped" %%% "std" % "3.7-1c17cf")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        