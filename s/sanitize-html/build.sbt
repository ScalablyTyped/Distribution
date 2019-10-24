organization := "org.scalablytyped"
name := "sanitize-html"
version := "1.20.1-dt-20190916Z-b5ab4d"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "domhandler" % "2.4-dt-20190326Z-9987b0",
  "org.scalablytyped" %%% "domutils" % "1.7-dt-20190326Z-3c9cbb",
  "org.scalablytyped" %%% "htmlparser2" % "v3.10.x-dt-20190712Z-da0055",
  "org.scalablytyped" %%% "node" % "12.11-dt-20191023Z-ebe9d8",
  "org.scalablytyped" %%% "std" % "3.6-b80e7a")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        