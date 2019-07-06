organization := "org.scalablytyped"
name := "read-config-file"
version := "3.2.2-d54471"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "ajv" % "6.10.1-5dd642",
  "org.scalablytyped" %%% "dotenv" % "6.1-dt-20190329Z-ea5e31",
  "org.scalablytyped" %%% "lazy-val" % "1.0.4-806fa0",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190703Z-0260d9",
  "org.scalablytyped" %%% "std" % "3.5-d4a303")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        