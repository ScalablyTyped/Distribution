organization := "org.scalablytyped"
name := "protractor-browser-logs"
version := "1.0-dt-20180910Z-bc7f7a"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "adm-zip" % "v0.4.4-dt-20180910Z-f4a818",
  "org.scalablytyped" %%% "ansi-styles" % "3.2.1-dt-20181018Z-226182",
  "org.scalablytyped" %%% "blocking-proxy" % "1.0.1-ade46e",
  "org.scalablytyped" %%% "caseless" % "0.12-dt-20180910Z-a94dbd",
  "org.scalablytyped" %%% "chalk" % "2.4.1-c5701d",
  "org.scalablytyped" %%% "color-name" % "1.1-dt-20180910Z-7f8b58",
  "org.scalablytyped" %%% "del" % "3.0-dt-20180910Z-a82d27",
  "org.scalablytyped" %%% "escape-string-regexp" % "1.0-dt-20180910Z-ca86dd",
  "org.scalablytyped" %%% "form-data" % "2.2-dt-20181120Z-26a7b4",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20180927Z-274633",
  "org.scalablytyped" %%% "ini" % "v1.3.3-dt-20181129Z-35a1a5",
  "org.scalablytyped" %%% "jasmine" % "3.3-dt-20181214Z-9bd0fc",
  "org.scalablytyped" %%% "jasminewd2" % "2.0-dt-20181109Z-9dc1ce",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180910Z-c002a7",
  "org.scalablytyped" %%% "minimist" % "1.2.0-dt-20180910Z-ab6005",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181214Z-702cdc",
  "org.scalablytyped" %%% "optimist" % "0.0-unknown-dt-20180910Z-a6ca3c",
  "org.scalablytyped" %%% "protractor" % "5.4.1-011bb1",
  "org.scalablytyped" %%% "q" % "1.5-dt-20181206Z-38e17c",
  "org.scalablytyped" %%% "request" % "2.48-dt-20181105Z-ee0213",
  "org.scalablytyped" %%% "rimraf" % "2.0-dt-20180910Z-599027",
  "org.scalablytyped" %%% "selenium-webdriver" % "3.0-dt-20181213Z-89c1db",
  "org.scalablytyped" %%% "semver" % "5.5-dt-20180910Z-8ca982",
  "org.scalablytyped" %%% "source-map-support" % "0.4-dt-20180910Z-5d16f0",
  "org.scalablytyped" %%% "std" % "3.2.2-beaa2f",
  "org.scalablytyped" %%% "supports-color" % "5.3-dt-20180910Z-7348e2",
  "org.scalablytyped" %%% "tough-cookie" % "2.3-dt-20181104Z-eb91fb",
  "org.scalablytyped" %%% "webdriver-js-extender" % "2.1.0-a84174",
  "org.scalablytyped" %%% "webdriver-manager" % "12.1.0-c05efd",
  "org.scalablytyped" %%% "xml2js" % "0.4-dt-20180910Z-2418ac")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        