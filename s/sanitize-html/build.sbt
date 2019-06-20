organization := "org.scalablytyped"
name := "sanitize-html"
version := "1.20.1-dt-20190603Z-b39457"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "domhandler" % "2.4-dt-20190326Z-c637a3",
  "org.scalablytyped" %%% "domutils" % "1.7-dt-20190326Z-a6599d",
  "org.scalablytyped" %%% "htmlparser2" % "v3.10.x-dt-20190326Z-f2a584",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190611Z-b8909f",
  "org.scalablytyped" %%% "std" % "3.5-d4a303")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        