organization := "org.scalablytyped"
name := "rx-jquery"
version := "0.0-unknown-dt-20190322Z-014166"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "jquery" % "3.3-dt-20191126Z-36922a",
  "org.scalablytyped" %%% "rx-core" % "4.0-dt-20190322Z-70806d",
  "org.scalablytyped" %%% "rx-core-binding" % "4.0-dt-20190322Z-b27bbb",
  "org.scalablytyped" %%% "rx-lite" % "4.0-dt-20190322Z-1bb289",
  "org.scalablytyped" %%% "rx-lite-aggregates" % "4.0-dt-20190322Z-1d690f",
  "org.scalablytyped" %%% "rx-lite-async" % "4.0-dt-20181116Z-670d3c",
  "org.scalablytyped" %%% "rx-lite-backpressure" % "4.0-dt-20180214Z-e6cfcf",
  "org.scalablytyped" %%% "rx-lite-coincidence" % "4.0-dt-20190322Z-a2e3c4",
  "org.scalablytyped" %%% "rx-lite-experimental" % "4.0-dt-20180214Z-fefd63",
  "org.scalablytyped" %%% "rx-lite-joinpatterns" % "4.0-dt-20180214Z-a9c0f8",
  "org.scalablytyped" %%% "rx-lite-testing" % "4.0-dt-20180214Z-0b8c3a",
  "org.scalablytyped" %%% "rx-lite-time" % "4.0-dt-20190322Z-cbfa05",
  "org.scalablytyped" %%% "rx-lite-virtualtime" % "4.0-dt-20190322Z-f1e0ab",
  "org.scalablytyped" %%% "sizzle" % "2.3-dt-20181006Z-2d253b",
  "org.scalablytyped" %%% "std" % "3.7-1d724d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        