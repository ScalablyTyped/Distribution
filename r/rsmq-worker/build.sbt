organization := "org.scalablytyped"
name := "rsmq-worker"
version := "0.3.5-dt-20190322Z-c3a213"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190514Z-07594f",
  "org.scalablytyped" %%% "redis" % "2.8-dt-20190326Z-1b071b",
  "org.scalablytyped" %%% "rsmq" % "0.3.16-dt-20190322Z-253b5f",
  "org.scalablytyped" %%% "std" % "3.4-8a92b2")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        