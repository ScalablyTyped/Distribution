organization := "com.scalablytyped"
name := "protractor-browser-logs"
version := "1.0-dt-20180910Z-b808c3"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "adm-zip" % "v0.4.4-dt-20180910Z-76d0ca",
  "com.scalablytyped" %%% "ansi-styles" % "3.2.1-dt-20181018Z-8b01ce",
  "com.scalablytyped" %%% "blocking-proxy" % "1.0.1-708a06",
  "com.scalablytyped" %%% "caseless" % "0.12-dt-20180910Z-2bf221",
  "com.scalablytyped" %%% "chalk" % "2.4.1-557431",
  "com.scalablytyped" %%% "color-name" % "1.1-dt-20180910Z-20e4ae",
  "com.scalablytyped" %%% "del" % "3.0-dt-20180910Z-17986e",
  "com.scalablytyped" %%% "escape-string-regexp" % "1.0-dt-20180910Z-450016",
  "com.scalablytyped" %%% "form-data" % "2.2-dt-20181120Z-52b360",
  "com.scalablytyped" %%% "glob" % "7.1-dt-20180927Z-b89aff",
  "com.scalablytyped" %%% "ini" % "v1.3.3-dt-20181129Z-b9b7a3",
  "com.scalablytyped" %%% "jasmine" % "3.3-dt-20181204Z-b1b044",
  "com.scalablytyped" %%% "jasminewd2" % "2.0-dt-20181109Z-0751f1",
  "com.scalablytyped" %%% "minimatch" % "3.0-dt-20180910Z-5ec0b9",
  "com.scalablytyped" %%% "minimist" % "1.2.0-dt-20180910Z-a475cc",
  "com.scalablytyped" %%% "node" % "10.12-dt-20181203Z-7004b3",
  "com.scalablytyped" %%% "optimist" % "0.0-unknown-dt-20180910Z-439920",
  "com.scalablytyped" %%% "protractor" % "5.4.1-e51e20",
  "com.scalablytyped" %%% "q" % "1.5-dt-20181206Z-726082",
  "com.scalablytyped" %%% "request" % "2.48-dt-20181105Z-67a93f",
  "com.scalablytyped" %%% "rimraf" % "2.0-dt-20180910Z-40a17a",
  "com.scalablytyped" %%% "selenium-webdriver" % "3.0-dt-20181109Z-20b479",
  "com.scalablytyped" %%% "semver" % "5.5-dt-20180910Z-b64c1e",
  "com.scalablytyped" %%% "source-map-support" % "0.4-dt-20180910Z-f317b3",
  "com.scalablytyped" %%% "std" % "3.2.1-4b40fd",
  "com.scalablytyped" %%% "supports-color" % "5.3-dt-20180910Z-a10740",
  "com.scalablytyped" %%% "tough-cookie" % "2.3-dt-20181104Z-65a037",
  "com.scalablytyped" %%% "webdriver-js-extender" % "2.1.0-a8f81c",
  "com.scalablytyped" %%% "webdriver-manager" % "12.1.0-bbec2b",
  "com.scalablytyped" %%% "xml2js" % "0.4-dt-20180910Z-7c981e",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        