organization := "com.scalablytyped"
name := "protractor"
version := "5.4.1-2b44cc"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "adm-zip" % "v0.4.4-dt-20181102Z-8a7f1a",
  "com.scalablytyped" %%% "ansi-styles" % "3.2.1-dt-20181102Z-d346e3",
  "com.scalablytyped" %%% "blocking-proxy" % "1.0.1-596464",
  "com.scalablytyped" %%% "caseless" % "0.12-dt-20181102Z-5bb15d",
  "com.scalablytyped" %%% "chalk" % "2.4.1-ef8d2c",
  "com.scalablytyped" %%% "color-name" % "1.1-dt-20181102Z-8ba882",
  "com.scalablytyped" %%% "del" % "3.0-dt-20181102Z-d597f2",
  "com.scalablytyped" %%% "escape-string-regexp" % "1.0-dt-20181102Z-6ced09",
  "com.scalablytyped" %%% "form-data" % "2.2-dt-20181116Z-a46e60",
  "com.scalablytyped" %%% "glob" % "7.1-dt-20181102Z-ea59e6",
  "com.scalablytyped" %%% "ini" % "v1.3.3-dt-20181102Z-12c85a",
  "com.scalablytyped" %%% "jasmine" % "2.8.0-dt-20181109Z-a8440a",
  "com.scalablytyped" %%% "jasminewd2" % "2.0-dt-20181109Z-1fb74a",
  "com.scalablytyped" %%% "minimatch" % "3.0-dt-20181102Z-8447c6",
  "com.scalablytyped" %%% "minimist" % "1.2.0-dt-20181102Z-8bed80",
  "com.scalablytyped" %%% "node" % "10.12-dt-20181116Z-806eaf",
  "com.scalablytyped" %%% "optimist" % "0.0-unknown-dt-20181102Z-ece993",
  "com.scalablytyped" %%% "q" % "1.5-dt-20181102Z-60bf7d",
  "com.scalablytyped" %%% "request" % "2.48-dt-20181105Z-64050c",
  "com.scalablytyped" %%% "rimraf" % "2.0-dt-20181102Z-f07fb0",
  "com.scalablytyped" %%% "selenium-webdriver" % "3.0-dt-20181109Z-b6c22f",
  "com.scalablytyped" %%% "semver" % "5.5-dt-20181102Z-92c73a",
  "com.scalablytyped" %%% "source-map-support" % "0.4-dt-20181102Z-cef98d",
  "com.scalablytyped" %%% "std" % "3.1.6-34214f",
  "com.scalablytyped" %%% "supports-color" % "5.3-dt-20181102Z-2c93a8",
  "com.scalablytyped" %%% "tough-cookie" % "2.3-dt-20181102Z-a43730",
  "com.scalablytyped" %%% "webdriver-js-extender" % "2.1.0-a198de",
  "com.scalablytyped" %%% "webdriver-manager" % "12.1.0-59f353",
  "com.scalablytyped" %%% "xml2js" % "0.4-dt-20181102Z-5b99b7",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        