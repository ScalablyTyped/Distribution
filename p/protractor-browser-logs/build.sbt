organization := "org.scalablytyped"
name := "protractor-browser-logs"
version := "1.0-dt-20180214Z-e9ff4c"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "adm-zip" % "v0.4.4-dt-20180214Z-f4577e",
  "org.scalablytyped" %%% "ansi-styles" % "3.2.1-dt-20181017Z-ec2bbb",
  "org.scalablytyped" %%% "blocking-proxy" % "1.0.1-ed68e8",
  "org.scalablytyped" %%% "caseless" % "0.12-dt-20180214Z-ac9f89",
  "org.scalablytyped" %%% "chalk" % "2.4.2-aa77e5",
  "org.scalablytyped" %%% "color-name" % "1.1-dt-20180214Z-786ea5",
  "org.scalablytyped" %%% "del" % "3.0-dt-20180311Z-17594b",
  "org.scalablytyped" %%% "escape-string-regexp" % "1.0-dt-20180721Z-433270",
  "org.scalablytyped" %%% "form-data" % "2.2-dt-20181119Z-82b728",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20180920Z-e3ca52",
  "org.scalablytyped" %%% "ini" % "v1.3.3-dt-20181121Z-b5c644",
  "org.scalablytyped" %%% "jasmine" % "3.3-dt-20190118Z-ad02dd",
  "org.scalablytyped" %%% "jasminewd2" % "2.0-dt-20181026Z-ef0732",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180214Z-db2a02",
  "org.scalablytyped" %%% "minimist" % "1.2.0-dt-20180214Z-fff6c3",
  "org.scalablytyped" %%% "node" % "10.12-dt-20190128Z-23a585",
  "org.scalablytyped" %%% "optimist" % "0.0-unknown-dt-20180214Z-c67775",
  "org.scalablytyped" %%% "protractor" % "5.4.2-474e51",
  "org.scalablytyped" %%% "q" % "1.5-dt-20181124Z-74c955",
  "org.scalablytyped" %%% "request" % "2.48-dt-20190117Z-1e65c9",
  "org.scalablytyped" %%% "rimraf" % "2.0-dt-20180214Z-d46727",
  "org.scalablytyped" %%% "selenium-webdriver" % "3.0-dt-20181204Z-b87e6c",
  "org.scalablytyped" %%% "semver" % "5.5-dt-20180214Z-d66e0c",
  "org.scalablytyped" %%% "source-map-support" % "0.4-dt-20180523Z-444403",
  "org.scalablytyped" %%% "std" % "3.2.4-2926f1",
  "org.scalablytyped" %%% "supports-color" % "5.3-dt-20180409Z-394486",
  "org.scalablytyped" %%% "tough-cookie" % "2.3-dt-20190117Z-4d2fe4",
  "org.scalablytyped" %%% "webdriver-js-extender" % "2.1.0-b69c10",
  "org.scalablytyped" %%% "webdriver-manager" % "12.1.0-28fa5f",
  "org.scalablytyped" %%% "xml2js" % "0.4-dt-20180606Z-4ba2ab")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        