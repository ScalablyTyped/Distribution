organization := "org.scalablytyped"
name := "rx_dot_wamp"
version := "0.5.0-dt-20190322Z-23b3dd"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "autobahn" % "18.10-dt-20190311Z-737cbf",
  "org.scalablytyped" %%% "rx-core" % "4.0-dt-20190322Z-6379b0",
  "org.scalablytyped" %%% "rx-lite" % "4.0-dt-20190322Z-146946",
  "org.scalablytyped" %%% "rx-lite-aggregates" % "4.0-dt-20190322Z-9a0590",
  "org.scalablytyped" %%% "std" % "3.7-96076c",
  "org.scalablytyped" %%% "when" % "2.4.0-dt-20190322Z-3f8b07")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        