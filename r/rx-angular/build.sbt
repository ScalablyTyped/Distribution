organization := "org.scalablytyped"
name := "rx-angular"
version := "0.0-unknown-dt-20190322Z-a1b101"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "angular" % "1.6-dt-20190206Z-43c701",
  "org.scalablytyped" %%% "rx-core" % "4.0-dt-20190322Z-15bd27",
  "org.scalablytyped" %%% "rx-lite" % "4.0-dt-20190322Z-e9d43f",
  "org.scalablytyped" %%% "rx-lite-aggregates" % "4.0-dt-20190322Z-930cfa",
  "org.scalablytyped" %%% "std" % "3.5-c5d119")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        