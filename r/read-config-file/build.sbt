organization := "org.scalablytyped"
name := "read-config-file"
version := "3.2.2-e7b5a2"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "ajv" % "6.10.0-95decb",
  "org.scalablytyped" %%% "dotenv" % "6.1-dt-20190329Z-634838",
  "org.scalablytyped" %%% "lazy-val" % "1.0.4-39fe74",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190517Z-1fb914",
  "org.scalablytyped" %%% "std" % "3.4-8a92b2")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        