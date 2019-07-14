organization := "org.scalablytyped"
name := "retry-request"
version := "4.1.1-01f0ca"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "caseless" % "0.12-dt-20190311Z-ad8961",
  "org.scalablytyped" %%% "form-data" % "2.5.0-218ade",
  "org.scalablytyped" %%% "node" % "12.6-dt-20190709Z-570c89",
  "org.scalablytyped" %%% "request" % "2.48-dt-20190713Z-827831",
  "org.scalablytyped" %%% "std" % "3.5-983486",
  "org.scalablytyped" %%% "tough-cookie" % "2.3-dt-20190117Z-75d383")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        