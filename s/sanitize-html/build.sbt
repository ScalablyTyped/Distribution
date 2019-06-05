organization := "org.scalablytyped"
name := "sanitize-html"
version := "1.20.1-dt-20190603Z-70aa4a"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "domhandler" % "2.4-dt-20190326Z-1c7631",
  "org.scalablytyped" %%% "domutils" % "1.7-dt-20190326Z-de59bf",
  "org.scalablytyped" %%% "htmlparser2" % "v3.10.x-dt-20190326Z-3cd6f8",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190530Z-a47442",
  "org.scalablytyped" %%% "std" % "3.5-f010ac")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        