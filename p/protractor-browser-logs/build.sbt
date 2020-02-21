organization := "org.scalablytyped"
name := "protractor-browser-logs"
version := "1.0-dt-20200212Z-db14ee"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "blocking-proxy" % "1.0.1-fc8a10",
  "org.scalablytyped" %%% "node" % "13.7-dt-20200211Z-d6af7e",
  "org.scalablytyped" %%% "protractor" % "5.4.3-d96f3c",
  "org.scalablytyped" %%% "q" % "1.5-dt-20190313Z-518c7a",
  "org.scalablytyped" %%% "selenium-webdriver" % "4.0-dt-20200214Z-e3c71c",
  "org.scalablytyped" %%% "std" % "3.7-1b8369",
  "org.scalablytyped" %%% "webdriver-js-extender" % "2.1.0-bc492a")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
