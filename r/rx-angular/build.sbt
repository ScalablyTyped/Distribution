organization := "org.scalablytyped"
name := "rx-angular"
version := "0.0-unknown-dt-20200515Z-22cc34"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "angular" % "1.7-dt-20200624Z-d22a75",
  "org.scalablytyped" %%% "rx-core" % "4.0-dt-20200515Z-268656",
  "org.scalablytyped" %%% "rx-lite" % "4.0-dt-20200515Z-1410a2",
  "org.scalablytyped" %%% "rx-lite-aggregates" % "4.0-dt-20200515Z-899297",
  "org.scalablytyped" %%% "std" % "3.9-c9f1f8")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
