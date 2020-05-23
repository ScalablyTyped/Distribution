organization := "org.scalablytyped"
name := "rx_dot_wamp"
version := "0.5.0-dt-20200515Z-2e5992"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "autobahn" % "18.10-dt-20200515Z-e16a56",
  "org.scalablytyped" %%% "rx-core" % "4.0-dt-20200515Z-cad6e8",
  "org.scalablytyped" %%% "rx-lite" % "4.0-dt-20200515Z-a3fd19",
  "org.scalablytyped" %%% "rx-lite-aggregates" % "4.0-dt-20200515Z-20eeae",
  "org.scalablytyped" %%% "std" % "3.9-18cbeb",
  "org.scalablytyped" %%% "when" % "2.4.0-dt-20200515Z-ebd0ca")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
