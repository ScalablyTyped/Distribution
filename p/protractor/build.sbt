organization := "org.scalablytyped"
name := "protractor"
version := "5.4.2-c27402"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "adm-zip" % "v0.4.4-dt-20180214Z-65ae4c",
  "org.scalablytyped" %%% "ansi-styles" % "3.2.1-dt-20181017Z-21090e",
  "org.scalablytyped" %%% "blocking-proxy" % "1.0.1-bfda06",
  "org.scalablytyped" %%% "caseless" % "0.12-dt-20180214Z-0334cd",
  "org.scalablytyped" %%% "chalk" % "2.4.2-8e87c7",
  "org.scalablytyped" %%% "color-name" % "1.1-dt-20180214Z-de46de",
  "org.scalablytyped" %%% "del" % "3.0-dt-20180311Z-dc3ebc",
  "org.scalablytyped" %%% "escape-string-regexp" % "1.0-dt-20180721Z-98c322",
  "org.scalablytyped" %%% "form-data" % "2.2-dt-20181119Z-7c0763",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20180920Z-64d14d",
  "org.scalablytyped" %%% "ini" % "v1.3.3-dt-20181121Z-4ce0d5",
  "org.scalablytyped" %%% "jasmine" % "3.3-dt-20190118Z-f7961f",
  "org.scalablytyped" %%% "jasminewd2" % "2.0-dt-20181026Z-e26789",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180214Z-785a8e",
  "org.scalablytyped" %%% "minimist" % "1.2.0-dt-20180214Z-94b6ad",
  "org.scalablytyped" %%% "node" % "10.12-dt-20190129Z-8da1df",
  "org.scalablytyped" %%% "optimist" % "0.0-unknown-dt-20180214Z-191539",
  "org.scalablytyped" %%% "q" % "1.5-dt-20181124Z-b7ac87",
  "org.scalablytyped" %%% "request" % "2.48-dt-20190117Z-c301e1",
  "org.scalablytyped" %%% "rimraf" % "2.0-dt-20180214Z-2a10d6",
  "org.scalablytyped" %%% "selenium-webdriver" % "3.0-dt-20181204Z-4b2ee4",
  "org.scalablytyped" %%% "semver" % "5.5-dt-20180214Z-45dbbd",
  "org.scalablytyped" %%% "source-map-support" % "0.4-dt-20180523Z-0f4428",
  "org.scalablytyped" %%% "std" % "3.3.1-6e0314",
  "org.scalablytyped" %%% "supports-color" % "5.3-dt-20180409Z-efeb04",
  "org.scalablytyped" %%% "tough-cookie" % "2.3-dt-20190117Z-3631a3",
  "org.scalablytyped" %%% "webdriver-js-extender" % "2.1.0-f5446f",
  "org.scalablytyped" %%% "webdriver-manager" % "12.1.0-f2f969",
  "org.scalablytyped" %%% "xml2js" % "0.4-dt-20180606Z-d55f12")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        