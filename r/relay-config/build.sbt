organization := "org.scalablytyped"
name := "relay-config"
version := "6.0-dt-20190924Z-5dd945"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "graphql" % "14.5.8-8daf73",
  "org.scalablytyped" %%% "relay-compiler" % "7.0-dt-20191126Z-9272b3",
  "org.scalablytyped" %%% "relay-runtime" % "8.0-dt-20191227Z-c1feb3",
  "org.scalablytyped" %%% "std" % "3.7-953338",
  "org.scalablytyped" %%% "typescript" % "3.7.4-b5a092")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        