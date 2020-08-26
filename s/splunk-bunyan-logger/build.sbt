organization := "org.scalablytyped"
name := "splunk-bunyan-logger"
version := "0.9-dt-20180705Z-f4ce3b"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "bunyan" % "1.8-dt-20200515Z-1ef598",
  "org.scalablytyped" %%% "caseless" % "0.12-dt-20200515Z-4c00a4",
  "org.scalablytyped" %%% "form-data" % "3.0.0-d641e7",
  "org.scalablytyped" %%% "node" % "14.0-dt-20200724Z-6c1ba3",
  "org.scalablytyped" %%% "request" % "2.48-dt-20200515Z-09fd47",
  "org.scalablytyped" %%% "splunk-logging" % "0.9-dt-20180705Z-9699ed",
  "org.scalablytyped" %%% "std" % "3.9-bafc13",
  "org.scalablytyped" %%% "tough-cookie" % "4.0-dt-20200515Z-1a740a")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
