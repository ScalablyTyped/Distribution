organization := "org.scalablytyped"
name := "protractor"
version := "5.4.2-8f79a7"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "blocking-proxy" % "1.0.1-528be8",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190606Z-b7fe68",
  "org.scalablytyped" %%% "q" % "1.5-dt-20190313Z-4c7a25",
  "org.scalablytyped" %%% "selenium-webdriver" % "4.0-dt-20190329Z-f04b48",
  "org.scalablytyped" %%% "std" % "3.5-f010ac",
  "org.scalablytyped" %%% "webdriver-js-extender" % "2.1.0-c66795")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        