organization := "org.scalablytyped"
name := "rollup-plugin-node-resolve"
version := "4.2.3-96d88a"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "estree" % "0.0-unknown-dt-20190322Z-4bb05f",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190503Z-6753fb",
  "org.scalablytyped" %%% "resolve" % "0.0-unknown-dt-20190322Z-910ce0",
  "org.scalablytyped" %%% "rollup" % "1.11.0-5e03b4",
  "org.scalablytyped" %%% "std" % "3.4-8a92b2")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        