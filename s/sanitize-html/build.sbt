organization := "org.scalablytyped"
name := "sanitize-html"
version := "1.18.2-dt-20190326Z-39947b"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "domhandler" % "2.4-dt-20190326Z-2605be",
  "org.scalablytyped" %%% "domutils" % "1.7-dt-20190326Z-e58f8f",
  "org.scalablytyped" %%% "htmlparser2" % "v3.10.x-dt-20190326Z-47c366",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190503Z-6753fb",
  "org.scalablytyped" %%% "std" % "3.4-8a92b2")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        