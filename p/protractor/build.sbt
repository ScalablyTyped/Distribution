organization := "org.scalablytyped"
name := "protractor"
version := "5.4.2-0b7d04"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "adm-zip" % "0.4-dt-20190202Z-46223f",
  "org.scalablytyped" %%% "ansi-styles" % "3.2.1-dt-20181017Z-99c1e4",
  "org.scalablytyped" %%% "blocking-proxy" % "1.0.1-4ca5e9",
  "org.scalablytyped" %%% "caseless" % "0.12-dt-20180214Z-708eba",
  "org.scalablytyped" %%% "chalk" % "2.4.2-d27947",
  "org.scalablytyped" %%% "color-name" % "1.1-dt-20190212Z-c289fb",
  "org.scalablytyped" %%% "del" % "3.0-dt-20180311Z-693ac9",
  "org.scalablytyped" %%% "escape-string-regexp" % "1.0-dt-20180721Z-ccd3b7",
  "org.scalablytyped" %%% "form-data" % "2.2-dt-20181119Z-41ab3d",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20180920Z-eb36a4",
  "org.scalablytyped" %%% "ini" % "v1.3.3-dt-20181121Z-bd0545",
  "org.scalablytyped" %%% "jasmine" % "3.3-dt-20190212Z-ae174c",
  "org.scalablytyped" %%% "jasminewd2" % "2.0-dt-20181026Z-62efc4",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180214Z-8c05a2",
  "org.scalablytyped" %%% "minimist" % "1.2.0-dt-20180214Z-e2a650",
  "org.scalablytyped" %%% "node" % "11.9-dt-20190222Z-99335f",
  "org.scalablytyped" %%% "optimist" % "0.0-unknown-dt-20180214Z-83c536",
  "org.scalablytyped" %%% "q" % "1.5-dt-20181124Z-84c23d",
  "org.scalablytyped" %%% "request" % "2.48-dt-20190117Z-c50522",
  "org.scalablytyped" %%% "rimraf" % "2.0-dt-20180214Z-e45d34",
  "org.scalablytyped" %%% "selenium-webdriver" % "3.0-dt-20190212Z-bc42c5",
  "org.scalablytyped" %%% "semver" % "5.5-dt-20180214Z-703481",
  "org.scalablytyped" %%% "source-map-support" % "0.4-dt-20190212Z-72814c",
  "org.scalablytyped" %%% "std" % "3.3-6e4388",
  "org.scalablytyped" %%% "supports-color" % "5.3-dt-20180409Z-cc56f3",
  "org.scalablytyped" %%% "tough-cookie" % "2.3-dt-20190117Z-62e3dd",
  "org.scalablytyped" %%% "webdriver-js-extender" % "2.1.0-c237cc",
  "org.scalablytyped" %%% "webdriver-manager" % "12.1.1-6f590a",
  "org.scalablytyped" %%% "xml2js" % "0.4-dt-20180606Z-f54fa8")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        