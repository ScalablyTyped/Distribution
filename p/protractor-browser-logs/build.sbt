organization := "org.scalablytyped"
name := "protractor-browser-logs"
version := "1.0-dt-20190329Z-eaced3"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "adm-zip" % "0.4-dt-20190202Z-7458c4",
  "org.scalablytyped" %%% "ansi-styles" % "3.2.1-dt-20190322Z-d84c1e",
  "org.scalablytyped" %%% "blocking-proxy" % "1.0.1-8281f4",
  "org.scalablytyped" %%% "braces" % "2.3-dt-20180214Z-306649",
  "org.scalablytyped" %%% "caseless" % "0.12-dt-20190311Z-67548d",
  "org.scalablytyped" %%% "chalk" % "2.4.2-ca1e30",
  "org.scalablytyped" %%% "color-name" % "1.1-dt-20190212Z-5a34a6",
  "org.scalablytyped" %%% "del" % "4.1.0-5f8faf",
  "org.scalablytyped" %%% "dir-glob" % "2.0-dt-20181212Z-a8a63d",
  "org.scalablytyped" %%% "escape-string-regexp" % "1.0-dt-20190322Z-faeaa3",
  "org.scalablytyped" %%% "fast-glob" % "2.2.6-639d8c",
  "org.scalablytyped" %%% "form-data" % "2.2-dt-20181119Z-57c0e7",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20180920Z-ce8e08",
  "org.scalablytyped" %%% "glob-parent" % "3.1-dt-20190329Z-819655",
  "org.scalablytyped" %%% "glob-to-regexp" % "0.4-dt-20180607Z-95102e",
  "org.scalablytyped" %%% "globby" % "9.2.0-43bdf7",
  "org.scalablytyped" %%% "ignore" % "3.3.10-4b81ac",
  "org.scalablytyped" %%% "ini" % "v1.3.3-dt-20190322Z-654e49",
  "org.scalablytyped" %%% "is-glob" % "4.0-dt-20190329Z-4226a6",
  "org.scalablytyped" %%% "is-path-cwd" % "1.0-dt-20180214Z-1abd94",
  "org.scalablytyped" %%% "is-path-in-cwd" % "1.0-dt-20180214Z-81c8ba",
  "org.scalablytyped" %%% "jasmine" % "3.3-dt-20190316Z-0cfe5d",
  "org.scalablytyped" %%% "jasminewd2" % "2.0-dt-20181026Z-18a6d8",
  "org.scalablytyped" %%% "merge2" % "1.1-dt-20180214Z-382d2d",
  "org.scalablytyped" %%% "micromatch" % "3.1-dt-20180214Z-64a8b0",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180214Z-e6c927",
  "org.scalablytyped" %%% "minimist" % "1.2.0-dt-20190322Z-8cca44",
  "org.scalablytyped" %%% "mrmlnc__readdir-enhanced" % "2.2.1-c50580",
  "org.scalablytyped" %%% "node" % "11.13-dt-20190330Z-7c1cfd",
  "org.scalablytyped" %%% "nodelib__fs_dot_stat" % "1.1.3-aee354",
  "org.scalablytyped" %%% "optimist" % "0.0-unknown-dt-20190322Z-87cc67",
  "org.scalablytyped" %%% "p-map" % "2.0.0-cc43fc",
  "org.scalablytyped" %%% "pify" % "3.0.0-dt-20190322Z-6f182f",
  "org.scalablytyped" %%% "protractor" % "5.4.2-8a126b",
  "org.scalablytyped" %%% "q" % "1.5-dt-20190313Z-c63ee9",
  "org.scalablytyped" %%% "request" % "2.48-dt-20190117Z-ca6c55",
  "org.scalablytyped" %%% "rimraf" % "2.0-dt-20180214Z-a798a1",
  "org.scalablytyped" %%% "selenium-webdriver" % "4.0-dt-20190329Z-aeb437",
  "org.scalablytyped" %%% "semver" % "6.0-dt-20190330Z-1b8b1f",
  "org.scalablytyped" %%% "slash" % "2.0-dt-20181224Z-a5cb3a",
  "org.scalablytyped" %%% "source-map-support" % "0.5-dt-20190224Z-1843b4",
  "org.scalablytyped" %%% "std" % "3.4-d52857",
  "org.scalablytyped" %%% "supports-color" % "5.3-dt-20180409Z-1b70da",
  "org.scalablytyped" %%% "tough-cookie" % "2.3-dt-20190117Z-972cef",
  "org.scalablytyped" %%% "webdriver-js-extender" % "2.1.0-299fad",
  "org.scalablytyped" %%% "webdriver-manager" % "12.1.1-47f2b3",
  "org.scalablytyped" %%% "xml2js" % "0.4-dt-20190402Z-f87566")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        