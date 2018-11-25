organization := "com.scalablytyped"
name := "protractor"
version := "5.4.1-49af41"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "adm-zip" % "v0.4.4-dt-20180910Z-06545f",
  "com.scalablytyped" %%% "ansi-styles" % "3.2.1-dt-20181018Z-16b038",
  "com.scalablytyped" %%% "blocking-proxy" % "1.0.1-a4aa10",
  "com.scalablytyped" %%% "caseless" % "0.12-dt-20180910Z-7ce57e",
  "com.scalablytyped" %%% "chalk" % "2.4.1-ea2afe",
  "com.scalablytyped" %%% "color-name" % "1.1-dt-20180910Z-566c3e",
  "com.scalablytyped" %%% "del" % "3.0-dt-20180910Z-6c2877",
  "com.scalablytyped" %%% "escape-string-regexp" % "1.0-dt-20180910Z-76e9e4",
  "com.scalablytyped" %%% "events" % "1.2-dt-20180910Z-abe6d1",
  "com.scalablytyped" %%% "form-data" % "2.2-dt-20181120Z-dc466d",
  "com.scalablytyped" %%% "glob" % "7.1-dt-20180927Z-5d44f9",
  "com.scalablytyped" %%% "ini" % "v1.3.3-dt-20180910Z-d4fedb",
  "com.scalablytyped" %%% "jasmine" % "3.3-dt-20181120Z-bc0c68",
  "com.scalablytyped" %%% "jasminewd2" % "2.0-dt-20181109Z-557265",
  "com.scalablytyped" %%% "minimatch" % "3.0-dt-20180910Z-298c87",
  "com.scalablytyped" %%% "minimist" % "1.2.0-dt-20180910Z-dd566d",
  "com.scalablytyped" %%% "node" % "10.12-dt-20181121Z-913134",
  "com.scalablytyped" %%% "optimist" % "0.0-unknown-dt-20180910Z-6c019e",
  "com.scalablytyped" %%% "q" % "1.5-dt-20180915Z-f3431e",
  "com.scalablytyped" %%% "request" % "2.48-dt-20181105Z-57e002",
  "com.scalablytyped" %%% "rimraf" % "2.0-dt-20180910Z-8fdfc5",
  "com.scalablytyped" %%% "selenium-webdriver" % "3.0-dt-20181109Z-62fa6d",
  "com.scalablytyped" %%% "semver" % "5.5-dt-20180910Z-eae856",
  "com.scalablytyped" %%% "source-map-support" % "0.4-dt-20180910Z-edffa1",
  "com.scalablytyped" %%% "std" % "3.1.3-0b55f4",
  "com.scalablytyped" %%% "supports-color" % "5.3-dt-20180910Z-f11a37",
  "com.scalablytyped" %%% "tough-cookie" % "2.3-dt-20181104Z-a9e24d",
  "com.scalablytyped" %%% "webdriver-js-extender" % "2.1.0-8d0ab8",
  "com.scalablytyped" %%% "webdriver-manager" % "12.1.0-88d749",
  "com.scalablytyped" %%% "xml2js" % "0.4-dt-20180910Z-1681c6",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        