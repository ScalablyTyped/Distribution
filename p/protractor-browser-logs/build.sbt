organization := "org.scalablytyped"
name := "protractor-browser-logs"
version := "1.0-dt-20200226Z-ac934d"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "blocking-proxy" % "1.0.1-963ba7",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-ad1aba",
  "org.scalablytyped" %%% "protractor" % "7.0.0-274a25",
  "org.scalablytyped" %%% "q" % "1.5-dt-20201002Z-106b03",
  "org.scalablytyped" %%% "selenium-webdriver" % "4.0-dt-20201028Z-013717",
  "org.scalablytyped" %%% "std" % "4.1-c651d0",
  "org.scalablytyped" %%% "webdriver-js-extender" % "2.1.0-f0a797")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
