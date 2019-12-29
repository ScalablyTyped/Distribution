organization := "org.scalablytyped"
name := "rx_dot_wamp"
version := "0.5.0-dt-20190322Z-cdadde"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "autobahn" % "18.10-dt-20190311Z-e86532",
  "org.scalablytyped" %%% "rx-core" % "4.0-dt-20190322Z-2bc65c",
  "org.scalablytyped" %%% "rx-lite" % "4.0-dt-20190322Z-1799fb",
  "org.scalablytyped" %%% "rx-lite-aggregates" % "4.0-dt-20190322Z-358478",
  "org.scalablytyped" %%% "std" % "3.7-953338",
  "org.scalablytyped" %%% "when" % "2.4.0-dt-20190322Z-2279a6")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        