organization := "org.scalablytyped"
name := "restify-plugins"
version := "1.5-dt-20200515Z-1446d7"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "bunyan" % "1.8-dt-20200515Z-0d29cd",
  "org.scalablytyped" %%% "formidable" % "1.0.16-dt-20200515Z-e84748",
  "org.scalablytyped" %%% "node" % "14.0-dt-20200521Z-3aabb7",
  "org.scalablytyped" %%% "restify" % "8.4-dt-20200515Z-ec2a00",
  "org.scalablytyped" %%% "spdy" % "3.4-dt-20200227Z-3b1b1c",
  "org.scalablytyped" %%% "std" % "3.9-18cbeb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
