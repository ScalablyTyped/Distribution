organization := "org.scalablytyped"
name := "sanitize-html"
version := "1.20.1-dt-20190711Z-b0e71f"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "domhandler" % "2.4-dt-20190326Z-b43987",
  "org.scalablytyped" %%% "domutils" % "1.7-dt-20190326Z-5fc779",
  "org.scalablytyped" %%% "htmlparser2" % "v3.10.x-dt-20190712Z-7b740c",
  "org.scalablytyped" %%% "node" % "12.7-dt-20190911Z-da4655",
  "org.scalablytyped" %%% "std" % "3.6-c16502")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        