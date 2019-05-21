organization := "org.scalablytyped"
name := "rappid"
version := "1.5-dt-20190213Z-3439d6"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "backbone" % "1.4.0-dt-20190514Z-4277e1",
  "org.scalablytyped" %%% "jointjs" % "2.2.1-cf5745",
  "org.scalablytyped" %%% "jquery" % "3.3-dt-20190108Z-49ff4d",
  "org.scalablytyped" %%% "sizzle" % "2.3-dt-20181006Z-fbd298",
  "org.scalablytyped" %%% "std" % "3.4-8a92b2",
  "org.scalablytyped" %%% "underscore" % "1.8-dt-20190515Z-14342b")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        