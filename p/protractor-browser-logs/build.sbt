organization := "org.scalablytyped"
name := "protractor-browser-logs"
version := "1.0-dt-20190329Z-33eb05"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "blocking-proxy" % "1.0.1-0f7276",
  "org.scalablytyped" %%% "node" % "13.1-dt-20200117Z-4be21b",
  "org.scalablytyped" %%% "protractor" % "5.4.2-85080d",
  "org.scalablytyped" %%% "q" % "1.5-dt-20190313Z-890e43",
  "org.scalablytyped" %%% "selenium-webdriver" % "4.0-dt-20191216Z-2aefb6",
  "org.scalablytyped" %%% "std" % "3.7-96076c",
  "org.scalablytyped" %%% "webdriver-js-extender" % "2.1.0-cbbdf7")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        