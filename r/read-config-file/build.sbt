organization := "org.scalablytyped"
name := "read-config-file"
version := "3.2.2-4f65da"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "ajv" % "6.10.2-d6325f",
  "org.scalablytyped" %%% "dotenv" % "6.1-dt-20190329Z-c1ef2a",
  "org.scalablytyped" %%% "lazy-val" % "1.0.4-09a7af",
  "org.scalablytyped" %%% "node" % "12.7-dt-20190820Z-c250b3",
  "org.scalablytyped" %%% "std" % "3.6-c16502")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        