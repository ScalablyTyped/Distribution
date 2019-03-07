organization := "org.scalablytyped"
name := "protractor"
version := "5.4.2-df2e45"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "adm-zip" % "0.4-dt-20190202Z-059a54",
  "org.scalablytyped" %%% "ansi-styles" % "3.2.1-dt-20181017Z-15d04a",
  "org.scalablytyped" %%% "blocking-proxy" % "1.0.1-1a1238",
  "org.scalablytyped" %%% "braces" % "2.3-dt-20180214Z-d1a095",
  "org.scalablytyped" %%% "caseless" % "0.12-dt-20180214Z-197130",
  "org.scalablytyped" %%% "chalk" % "2.4.2-6ee70e",
  "org.scalablytyped" %%% "color-name" % "1.1-dt-20190212Z-1a1d0f",
  "org.scalablytyped" %%% "del" % "4.0.0-64ac48",
  "org.scalablytyped" %%% "escape-string-regexp" % "1.0-dt-20180721Z-38137e",
  "org.scalablytyped" %%% "fast-glob" % "2.2.6-26fb96",
  "org.scalablytyped" %%% "form-data" % "2.2-dt-20181119Z-545269",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20180920Z-448338",
  "org.scalablytyped" %%% "glob-parent" % "3.1-dt-20180214Z-57b73f",
  "org.scalablytyped" %%% "glob-to-regexp" % "0.4-dt-20180607Z-24e045",
  "org.scalablytyped" %%% "globby" % "8.0-dt-20180614Z-14a69c",
  "org.scalablytyped" %%% "ini" % "v1.3.3-dt-20181121Z-beeb53",
  "org.scalablytyped" %%% "is-glob" % "4.0-dt-20180214Z-2e5f61",
  "org.scalablytyped" %%% "is-path-cwd" % "1.0-dt-20180214Z-5e711a",
  "org.scalablytyped" %%% "is-path-in-cwd" % "1.0-dt-20180214Z-253e21",
  "org.scalablytyped" %%% "jasmine" % "3.3-dt-20190212Z-c0aff1",
  "org.scalablytyped" %%% "jasminewd2" % "2.0-dt-20181026Z-7098d3",
  "org.scalablytyped" %%% "merge2" % "1.1-dt-20180214Z-548674",
  "org.scalablytyped" %%% "micromatch" % "3.1-dt-20180214Z-493cc6",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180214Z-f71186",
  "org.scalablytyped" %%% "minimist" % "1.2.0-dt-20180214Z-5de375",
  "org.scalablytyped" %%% "mrmlnc__readdir-enhanced" % "2.2.1-72ef89",
  "org.scalablytyped" %%% "node" % "11.10-dt-20190302Z-6be09d",
  "org.scalablytyped" %%% "nodelib__fs_dot_stat" % "1.1.3-88109e",
  "org.scalablytyped" %%% "optimist" % "0.0-unknown-dt-20180214Z-17cb16",
  "org.scalablytyped" %%% "p-map" % "2.0.0-ab3a24",
  "org.scalablytyped" %%% "pify" % "3.0.0-dt-20180501Z-9a0452",
  "org.scalablytyped" %%% "q" % "1.5-dt-20181124Z-ea0c51",
  "org.scalablytyped" %%% "request" % "2.48-dt-20190117Z-60eef1",
  "org.scalablytyped" %%% "rimraf" % "2.0-dt-20180214Z-b223b7",
  "org.scalablytyped" %%% "selenium-webdriver" % "3.0-dt-20190212Z-730aa6",
  "org.scalablytyped" %%% "semver" % "5.5-dt-20180214Z-cfbe1c",
  "org.scalablytyped" %%% "source-map-support" % "0.5-dt-20190224Z-6bff05",
  "org.scalablytyped" %%% "std" % "3.3-05be79",
  "org.scalablytyped" %%% "supports-color" % "5.3-dt-20180409Z-bedf31",
  "org.scalablytyped" %%% "tough-cookie" % "2.3-dt-20190117Z-3a715e",
  "org.scalablytyped" %%% "webdriver-js-extender" % "2.1.0-b7b8eb",
  "org.scalablytyped" %%% "webdriver-manager" % "12.1.1-638568",
  "org.scalablytyped" %%% "xml2js" % "0.4-dt-20180606Z-201946")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        