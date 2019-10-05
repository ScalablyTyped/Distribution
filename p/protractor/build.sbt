organization := "org.scalablytyped"
name := "protractor"
version := "5.4.2-9600fa"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "blocking-proxy" % "1.0.1-8e4309",
  "org.scalablytyped" %%% "node" % "12.7-dt-20191003Z-a35ed6",
  "org.scalablytyped" %%% "q" % "1.5-dt-20190313Z-c2a163",
  "org.scalablytyped" %%% "selenium-webdriver" % "4.0-dt-20190924Z-a4377e",
  "org.scalablytyped" %%% "std" % "3.6-abb6d3",
  "org.scalablytyped" %%% "webdriver-js-extender" % "2.1.0-027968")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        