organization := "org.scalablytyped"
name := "rx_dot_wamp"
version := "0.5.0-dt-20190322Z-479af2"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "autobahn" % "18.10-dt-20190311Z-f207d4",
  "org.scalablytyped" %%% "rx-core" % "4.0-dt-20190322Z-9ca714",
  "org.scalablytyped" %%% "rx-lite" % "4.0-dt-20190322Z-0e39ea",
  "org.scalablytyped" %%% "rx-lite-aggregates" % "4.0-dt-20190322Z-ba68fd",
  "org.scalablytyped" %%% "std" % "3.7-1b8369",
  "org.scalablytyped" %%% "when" % "2.4.0-dt-20190322Z-8133de")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
