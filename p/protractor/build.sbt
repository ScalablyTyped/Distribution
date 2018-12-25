organization := "org.scalablytyped"
name := "protractor"
version := "5.4.2-2e401a"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "adm-zip" % "v0.4.4-dt-20180214Z-275819",
  "org.scalablytyped" %%% "ansi-styles" % "3.2.1-dt-20181017Z-6fdba3",
  "org.scalablytyped" %%% "blocking-proxy" % "1.0.1-86b2b8",
  "org.scalablytyped" %%% "caseless" % "0.12-dt-20180214Z-e33499",
  "org.scalablytyped" %%% "chalk" % "2.4.1-44ad3c",
  "org.scalablytyped" %%% "color-name" % "1.1-dt-20180214Z-633954",
  "org.scalablytyped" %%% "del" % "3.0-dt-20180311Z-54107f",
  "org.scalablytyped" %%% "escape-string-regexp" % "1.0-dt-20180721Z-cb7b0b",
  "org.scalablytyped" %%% "form-data" % "2.2-dt-20181119Z-bda47a",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20180920Z-790699",
  "org.scalablytyped" %%% "ini" % "v1.3.3-dt-20181121Z-fb93f7",
  "org.scalablytyped" %%% "jasmine" % "3.3-dt-20181218Z-1fafdb",
  "org.scalablytyped" %%% "jasminewd2" % "2.0-dt-20181026Z-595385",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180214Z-7791d7",
  "org.scalablytyped" %%% "minimist" % "1.2.0-dt-20180214Z-077fe7",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-e45326",
  "org.scalablytyped" %%% "optimist" % "0.0-unknown-dt-20180214Z-ed7fcc",
  "org.scalablytyped" %%% "q" % "1.5-dt-20181124Z-725d84",
  "org.scalablytyped" %%% "request" % "2.48-dt-20181105Z-2246af",
  "org.scalablytyped" %%% "rimraf" % "2.0-dt-20180214Z-dc4b5e",
  "org.scalablytyped" %%% "selenium-webdriver" % "3.0-dt-20181204Z-701cba",
  "org.scalablytyped" %%% "semver" % "5.5-dt-20180214Z-e2fd38",
  "org.scalablytyped" %%% "source-map-support" % "0.4-dt-20180523Z-a75495",
  "org.scalablytyped" %%% "std" % "3.2.2-669a73",
  "org.scalablytyped" %%% "supports-color" % "5.3-dt-20180409Z-5f497b",
  "org.scalablytyped" %%% "tough-cookie" % "2.3-dt-20181015Z-a6a64a",
  "org.scalablytyped" %%% "webdriver-js-extender" % "2.1.0-770429",
  "org.scalablytyped" %%% "webdriver-manager" % "12.1.0-facfb3",
  "org.scalablytyped" %%% "xml2js" % "0.4-dt-20180606Z-992678")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        