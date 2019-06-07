organization := "org.scalablytyped"
name := "rx-node"
version := "0.0-unknown-dt-20190322Z-dae0a1"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190606Z-b7fe68",
  "org.scalablytyped" %%% "rx-core" % "4.0-dt-20190322Z-936640",
  "org.scalablytyped" %%% "rx-lite" % "4.0-dt-20190322Z-e8b2c8",
  "org.scalablytyped" %%% "rx-lite-aggregates" % "4.0-dt-20190322Z-31857f",
  "org.scalablytyped" %%% "std" % "3.5-f010ac")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        