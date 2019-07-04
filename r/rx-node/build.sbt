organization := "org.scalablytyped"
name := "rx-node"
version := "0.0-unknown-dt-20190322Z-eb0699"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190703Z-0260d9",
  "org.scalablytyped" %%% "rx-core" % "4.0-dt-20190322Z-42a185",
  "org.scalablytyped" %%% "rx-lite" % "4.0-dt-20190322Z-ef54ce",
  "org.scalablytyped" %%% "rx-lite-aggregates" % "4.0-dt-20190322Z-89af0b",
  "org.scalablytyped" %%% "std" % "3.5-d4a303")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        