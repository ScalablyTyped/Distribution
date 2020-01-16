organization := "org.scalablytyped"
name := "protractor-browser-logs"
version := "1.0-dt-20190329Z-3ca17a"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "blocking-proxy" % "1.0.1-6b4ddf",
  "org.scalablytyped" %%% "node" % "13.1-dt-20200115Z-14f523",
  "org.scalablytyped" %%% "protractor" % "5.4.2-21db52",
  "org.scalablytyped" %%% "q" % "1.5-dt-20190313Z-e03f45",
  "org.scalablytyped" %%% "selenium-webdriver" % "4.0-dt-20191216Z-952b88",
  "org.scalablytyped" %%% "std" % "3.7-b6d959",
  "org.scalablytyped" %%% "webdriver-js-extender" % "2.1.0-700e9c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        