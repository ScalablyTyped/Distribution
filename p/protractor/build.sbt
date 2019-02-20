organization := "org.scalablytyped"
name := "protractor"
version := "5.4.2-30a9c5"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "adm-zip" % "0.4-dt-20190202Z-d77029",
  "org.scalablytyped" %%% "ansi-styles" % "3.2.1-dt-20181017Z-a737ef",
  "org.scalablytyped" %%% "blocking-proxy" % "1.0.1-e9e2e4",
  "org.scalablytyped" %%% "caseless" % "0.12-dt-20180214Z-bde245",
  "org.scalablytyped" %%% "chalk" % "2.4.2-413387",
  "org.scalablytyped" %%% "color-name" % "1.1-dt-20190212Z-048d4d",
  "org.scalablytyped" %%% "del" % "3.0-dt-20180311Z-12f3c6",
  "org.scalablytyped" %%% "escape-string-regexp" % "1.0-dt-20180721Z-964066",
  "org.scalablytyped" %%% "form-data" % "2.2-dt-20181119Z-7ab4be",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20180920Z-777de3",
  "org.scalablytyped" %%% "ini" % "v1.3.3-dt-20181121Z-60a0af",
  "org.scalablytyped" %%% "jasmine" % "3.3-dt-20190212Z-6c7283",
  "org.scalablytyped" %%% "jasminewd2" % "2.0-dt-20181026Z-40e39f",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180214Z-029f0e",
  "org.scalablytyped" %%% "minimist" % "1.2.0-dt-20180214Z-9fc7e9",
  "org.scalablytyped" %%% "node" % "11.9-dt-20190213Z-604ea6",
  "org.scalablytyped" %%% "optimist" % "0.0-unknown-dt-20180214Z-cf2d12",
  "org.scalablytyped" %%% "q" % "1.5-dt-20181124Z-306676",
  "org.scalablytyped" %%% "request" % "2.48-dt-20190117Z-9b7291",
  "org.scalablytyped" %%% "rimraf" % "2.0-dt-20180214Z-3fc4ff",
  "org.scalablytyped" %%% "selenium-webdriver" % "3.0-dt-20190212Z-d823f7",
  "org.scalablytyped" %%% "semver" % "5.5-dt-20180214Z-c9e889",
  "org.scalablytyped" %%% "source-map-support" % "0.4-dt-20190212Z-b3c520",
  "org.scalablytyped" %%% "std" % "3.3-0ec965",
  "org.scalablytyped" %%% "supports-color" % "5.3-dt-20180409Z-20da60",
  "org.scalablytyped" %%% "tough-cookie" % "2.3-dt-20190117Z-9af261",
  "org.scalablytyped" %%% "webdriver-js-extender" % "2.1.0-4042b4",
  "org.scalablytyped" %%% "webdriver-manager" % "12.1.1-bb8677",
  "org.scalablytyped" %%% "xml2js" % "0.4-dt-20180606Z-a99964")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        