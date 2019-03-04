organization := "org.scalablytyped"
name := "protractor-browser-logs"
version := "1.0-dt-20190212Z-ac201e"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "adm-zip" % "0.4-dt-20190202Z-6b0110",
  "org.scalablytyped" %%% "ansi-styles" % "3.2.1-dt-20181017Z-15d04a",
  "org.scalablytyped" %%% "blocking-proxy" % "1.0.1-cfada1",
  "org.scalablytyped" %%% "caseless" % "0.12-dt-20180214Z-197130",
  "org.scalablytyped" %%% "chalk" % "2.4.2-6ee70e",
  "org.scalablytyped" %%% "color-name" % "1.1-dt-20190212Z-1a1d0f",
  "org.scalablytyped" %%% "del" % "3.0-dt-20180311Z-79d22b",
  "org.scalablytyped" %%% "escape-string-regexp" % "1.0-dt-20180721Z-38137e",
  "org.scalablytyped" %%% "form-data" % "2.2-dt-20181119Z-ffa40c",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20180920Z-b3a88d",
  "org.scalablytyped" %%% "ini" % "v1.3.3-dt-20181121Z-beeb53",
  "org.scalablytyped" %%% "jasmine" % "3.3-dt-20190212Z-c0aff1",
  "org.scalablytyped" %%% "jasminewd2" % "2.0-dt-20181026Z-7098d3",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180214Z-f71186",
  "org.scalablytyped" %%% "minimist" % "1.2.0-dt-20180214Z-5de375",
  "org.scalablytyped" %%% "node" % "11.10-dt-20190228Z-fd0a52",
  "org.scalablytyped" %%% "optimist" % "0.0-unknown-dt-20180214Z-17cb16",
  "org.scalablytyped" %%% "protractor" % "5.4.2-675b12",
  "org.scalablytyped" %%% "q" % "1.5-dt-20181124Z-ea0c51",
  "org.scalablytyped" %%% "request" % "2.48-dt-20190117Z-e9e8b4",
  "org.scalablytyped" %%% "rimraf" % "2.0-dt-20180214Z-f95ca5",
  "org.scalablytyped" %%% "selenium-webdriver" % "3.0-dt-20190212Z-730aa6",
  "org.scalablytyped" %%% "semver" % "5.5-dt-20180214Z-cfbe1c",
  "org.scalablytyped" %%% "source-map-support" % "0.4-dt-20190212Z-adb224",
  "org.scalablytyped" %%% "std" % "3.3-05be79",
  "org.scalablytyped" %%% "supports-color" % "5.3-dt-20180409Z-bedf31",
  "org.scalablytyped" %%% "tough-cookie" % "2.3-dt-20190117Z-3a715e",
  "org.scalablytyped" %%% "webdriver-js-extender" % "2.1.0-b7b8eb",
  "org.scalablytyped" %%% "webdriver-manager" % "12.1.1-db4eea",
  "org.scalablytyped" %%% "xml2js" % "0.4-dt-20180606Z-d7fa62")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        