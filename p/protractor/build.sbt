organization := "org.scalablytyped"
name := "protractor"
version := "5.4.3-bf3634"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "blocking-proxy" % "1.0.1-47d697",
  "org.scalablytyped" %%% "node" % "13.7-dt-20200211Z-b30bde",
  "org.scalablytyped" %%% "q" % "1.5-dt-20190313Z-aa5e08",
  "org.scalablytyped" %%% "selenium-webdriver" % "4.0-dt-20200214Z-146cad",
  "org.scalablytyped" %%% "std" % "3.8-a0108c",
  "org.scalablytyped" %%% "webdriver-js-extender" % "2.1.0-dbe280")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
