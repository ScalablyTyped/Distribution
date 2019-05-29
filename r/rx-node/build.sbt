organization := "org.scalablytyped"
name := "rx-node"
version := "0.0-unknown-dt-20190322Z-c3ef8d"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190528Z-17198b",
  "org.scalablytyped" %%% "rx-core" % "4.0-dt-20190322Z-6ef090",
  "org.scalablytyped" %%% "rx-lite" % "4.0-dt-20190322Z-b81cfa",
  "org.scalablytyped" %%% "rx-lite-aggregates" % "4.0-dt-20190322Z-dc835c",
  "org.scalablytyped" %%% "std" % "3.4-ef47bb")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        