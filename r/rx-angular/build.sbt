organization := "org.scalablytyped"
name := "rx-angular"
version := "0.0-unknown-dt-20200515Z-4bffe0"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "angular" % "1.7-dt-20200515Z-a0c425",
  "org.scalablytyped" %%% "rx-core" % "4.0-dt-20200515Z-cad6e8",
  "org.scalablytyped" %%% "rx-lite" % "4.0-dt-20200515Z-a3fd19",
  "org.scalablytyped" %%% "rx-lite-aggregates" % "4.0-dt-20200515Z-20eeae",
  "org.scalablytyped" %%% "std" % "3.9-18cbeb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
