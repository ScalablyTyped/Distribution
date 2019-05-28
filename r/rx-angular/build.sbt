organization := "org.scalablytyped"
name := "rx-angular"
version := "0.0-unknown-dt-20190322Z-85e790"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "angular" % "1.6-dt-20190206Z-016930",
  "org.scalablytyped" %%% "rx-core" % "4.0-dt-20190322Z-b18b5a",
  "org.scalablytyped" %%% "rx-lite" % "4.0-dt-20190322Z-a946f6",
  "org.scalablytyped" %%% "rx-lite-aggregates" % "4.0-dt-20190322Z-0fdb45",
  "org.scalablytyped" %%% "std" % "3.4-8a92b2")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        