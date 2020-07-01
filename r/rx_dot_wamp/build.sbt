organization := "org.scalablytyped"
name := "rx_dot_wamp"
version := "0.5.0-dt-20200515Z-de2d46"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "autobahn" % "18.10-dt-20200515Z-63091a",
  "org.scalablytyped" %%% "rx-core" % "4.0-dt-20200515Z-268656",
  "org.scalablytyped" %%% "rx-lite" % "4.0-dt-20200515Z-1410a2",
  "org.scalablytyped" %%% "rx-lite-aggregates" % "4.0-dt-20200515Z-899297",
  "org.scalablytyped" %%% "std" % "3.9-c9f1f8",
  "org.scalablytyped" %%% "when" % "2.4.0-dt-20200515Z-b4c78c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
