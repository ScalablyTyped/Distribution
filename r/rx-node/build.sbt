organization := "org.scalablytyped"
name := "rx-node"
version := "0.0-unknown-dt-20190322Z-1a13f1"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "node" % "12.12-dt-20191123Z-382692",
  "org.scalablytyped" %%% "rx-core" % "4.0-dt-20190322Z-70806d",
  "org.scalablytyped" %%% "rx-lite" % "4.0-dt-20190322Z-1bb289",
  "org.scalablytyped" %%% "rx-lite-aggregates" % "4.0-dt-20190322Z-1d690f",
  "org.scalablytyped" %%% "std" % "3.7-1d724d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        