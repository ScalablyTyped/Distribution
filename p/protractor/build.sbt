organization := "org.scalablytyped"
name := "protractor"
version := "5.4.1-a29e7f"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "adm-zip" % "v0.4.4-dt-20180910Z-bd0571",
  "org.scalablytyped" %%% "ansi-styles" % "3.2.1-dt-20181018Z-9d8946",
  "org.scalablytyped" %%% "blocking-proxy" % "1.0.1-b772c5",
  "org.scalablytyped" %%% "caseless" % "0.12-dt-20180910Z-dcf8bd",
  "org.scalablytyped" %%% "chalk" % "2.4.1-d31457",
  "org.scalablytyped" %%% "color-name" % "1.1-dt-20180910Z-1e18f5",
  "org.scalablytyped" %%% "del" % "3.0-dt-20180910Z-e52b70",
  "org.scalablytyped" %%% "escape-string-regexp" % "1.0-dt-20180910Z-895ba8",
  "org.scalablytyped" %%% "form-data" % "2.2-dt-20181120Z-c69c6e",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20180927Z-82c87b",
  "org.scalablytyped" %%% "ini" % "v1.3.3-dt-20181129Z-a1823d",
  "org.scalablytyped" %%% "jasmine" % "3.3-dt-20181204Z-1d0ef7",
  "org.scalablytyped" %%% "jasminewd2" % "2.0-dt-20181109Z-2eb3c1",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180910Z-937a94",
  "org.scalablytyped" %%% "minimist" % "1.2.0-dt-20180910Z-18660e",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181203Z-646a31",
  "org.scalablytyped" %%% "optimist" % "0.0-unknown-dt-20180910Z-da2995",
  "org.scalablytyped" %%% "q" % "1.5-dt-20181206Z-ba2c26",
  "org.scalablytyped" %%% "request" % "2.48-dt-20181105Z-6fc249",
  "org.scalablytyped" %%% "rimraf" % "2.0-dt-20180910Z-3d2f63",
  "org.scalablytyped" %%% "selenium-webdriver" % "3.0-dt-20181109Z-08df7a",
  "org.scalablytyped" %%% "semver" % "5.5-dt-20180910Z-b342e2",
  "org.scalablytyped" %%% "source-map-support" % "0.4-dt-20180910Z-d1333e",
  "org.scalablytyped" %%% "std" % "3.2.2-edfe2b",
  "org.scalablytyped" %%% "supports-color" % "5.3-dt-20180910Z-e87018",
  "org.scalablytyped" %%% "tough-cookie" % "2.3-dt-20181104Z-a4b796",
  "org.scalablytyped" %%% "webdriver-js-extender" % "2.1.0-f6327b",
  "org.scalablytyped" %%% "webdriver-manager" % "12.1.0-606941",
  "org.scalablytyped" %%% "xml2js" % "0.4-dt-20180910Z-50608d")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        