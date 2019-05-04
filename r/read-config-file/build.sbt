organization := "org.scalablytyped"
name := "read-config-file"
version := "3.2.2-e0cf30"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "ajv" % "6.10.0-7b460f",
  "org.scalablytyped" %%% "dotenv" % "6.1-dt-20190329Z-0db7ee",
  "org.scalablytyped" %%% "lazy-val" % "1.0.4-39fe74",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190503Z-6753fb",
  "org.scalablytyped" %%% "std" % "3.4-8a92b2")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        