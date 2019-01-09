organization := "org.scalablytyped"
name := "protractor-browser-logs"
version := "1.0-dt-20180214Z-68d782"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "adm-zip" % "v0.4.4-dt-20180214Z-7647f6",
  "org.scalablytyped" %%% "ansi-styles" % "3.2.1-dt-20181017Z-1b78a1",
  "org.scalablytyped" %%% "blocking-proxy" % "1.0.1-e3511a",
  "org.scalablytyped" %%% "caseless" % "0.12-dt-20180214Z-b68dab",
  "org.scalablytyped" %%% "chalk" % "2.4.2-38684c",
  "org.scalablytyped" %%% "color-name" % "1.1-dt-20180214Z-58487f",
  "org.scalablytyped" %%% "del" % "3.0-dt-20180311Z-757075",
  "org.scalablytyped" %%% "escape-string-regexp" % "1.0-dt-20180721Z-ec7424",
  "org.scalablytyped" %%% "form-data" % "2.2-dt-20181119Z-9cf838",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20180920Z-342f5f",
  "org.scalablytyped" %%% "ini" % "v1.3.3-dt-20181121Z-5d2bab",
  "org.scalablytyped" %%% "jasmine" % "3.3-dt-20181218Z-0e344d",
  "org.scalablytyped" %%% "jasminewd2" % "2.0-dt-20181026Z-59a4a6",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180214Z-82b5dc",
  "org.scalablytyped" %%% "minimist" % "1.2.0-dt-20180214Z-86ee84",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-2aa425",
  "org.scalablytyped" %%% "optimist" % "0.0-unknown-dt-20180214Z-67f458",
  "org.scalablytyped" %%% "protractor" % "5.4.2-17686d",
  "org.scalablytyped" %%% "q" % "1.5-dt-20181124Z-19ea0b",
  "org.scalablytyped" %%% "request" % "2.48-dt-20181105Z-a362a9",
  "org.scalablytyped" %%% "rimraf" % "2.0-dt-20180214Z-6d142e",
  "org.scalablytyped" %%% "selenium-webdriver" % "3.0-dt-20181204Z-1239c4",
  "org.scalablytyped" %%% "semver" % "5.5-dt-20180214Z-9e6585",
  "org.scalablytyped" %%% "source-map-support" % "0.4-dt-20180523Z-a3e4d1",
  "org.scalablytyped" %%% "std" % "3.2.2-f3cc98",
  "org.scalablytyped" %%% "supports-color" % "5.3-dt-20180409Z-729b1c",
  "org.scalablytyped" %%% "tough-cookie" % "2.3-dt-20181015Z-b0f6d7",
  "org.scalablytyped" %%% "webdriver-js-extender" % "2.1.0-9b4c18",
  "org.scalablytyped" %%% "webdriver-manager" % "12.1.0-930900",
  "org.scalablytyped" %%% "xml2js" % "0.4-dt-20180606Z-be6677")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        