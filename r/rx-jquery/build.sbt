organization := "org.scalablytyped"
name := "rx-jquery"
version := "0.0-unknown-dt-20200515Z-9d5425"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "jquery" % "3.5-dt-20200621Z-33c88a",
  "org.scalablytyped" %%% "rx-core" % "4.0-dt-20200515Z-268656",
  "org.scalablytyped" %%% "rx-core-binding" % "4.0-dt-20200515Z-ec0778",
  "org.scalablytyped" %%% "rx-lite" % "4.0-dt-20200515Z-1410a2",
  "org.scalablytyped" %%% "rx-lite-aggregates" % "4.0-dt-20200515Z-899297",
  "org.scalablytyped" %%% "rx-lite-async" % "4.0-dt-20200515Z-1af43f",
  "org.scalablytyped" %%% "rx-lite-backpressure" % "4.0-dt-20200515Z-397cc2",
  "org.scalablytyped" %%% "rx-lite-coincidence" % "4.0-dt-20200515Z-15a605",
  "org.scalablytyped" %%% "rx-lite-experimental" % "4.0-dt-20200515Z-a86b93",
  "org.scalablytyped" %%% "rx-lite-joinpatterns" % "4.0-dt-20200515Z-636219",
  "org.scalablytyped" %%% "rx-lite-testing" % "4.0-dt-20200515Z-9672d7",
  "org.scalablytyped" %%% "rx-lite-time" % "4.0-dt-20200515Z-3ce537",
  "org.scalablytyped" %%% "rx-lite-virtualtime" % "4.0-dt-20200515Z-501803",
  "org.scalablytyped" %%% "sizzle" % "2.3-dt-20200515Z-775559",
  "org.scalablytyped" %%% "std" % "3.9-c9f1f8")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
