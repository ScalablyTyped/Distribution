organization := "org.scalablytyped"
name := "protractor"
version := "5.4.2-ea6361"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "adm-zip" % "0.4-dt-20190202Z-2d2b43",
  "org.scalablytyped" %%% "ansi-styles" % "3.2.1-dt-20181017Z-052e82",
  "org.scalablytyped" %%% "blocking-proxy" % "1.0.1-5dad81",
  "org.scalablytyped" %%% "braces" % "2.3-dt-20180214Z-edb918",
  "org.scalablytyped" %%% "caseless" % "0.12-dt-20190311Z-768261",
  "org.scalablytyped" %%% "chalk" % "2.4.2-6d01d0",
  "org.scalablytyped" %%% "color-name" % "1.1-dt-20190212Z-f1b784",
  "org.scalablytyped" %%% "del" % "4.0.0-5faff4",
  "org.scalablytyped" %%% "dir-glob" % "2.0-dt-20181212Z-6b9642",
  "org.scalablytyped" %%% "escape-string-regexp" % "1.0-dt-20180721Z-1f537b",
  "org.scalablytyped" %%% "fast-glob" % "2.2.6-69e556",
  "org.scalablytyped" %%% "form-data" % "2.2-dt-20181119Z-2e240d",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20180920Z-288ee1",
  "org.scalablytyped" %%% "glob-parent" % "3.1-dt-20180214Z-ec6929",
  "org.scalablytyped" %%% "glob-to-regexp" % "0.4-dt-20180607Z-9d06cf",
  "org.scalablytyped" %%% "globby" % "9.1.0-14a2d1",
  "org.scalablytyped" %%% "ignore" % "3.3.10-bb014f",
  "org.scalablytyped" %%% "ini" % "v1.3.3-dt-20181121Z-5720f4",
  "org.scalablytyped" %%% "is-glob" % "4.0-dt-20180214Z-399c7b",
  "org.scalablytyped" %%% "is-path-cwd" % "1.0-dt-20180214Z-e451aa",
  "org.scalablytyped" %%% "is-path-in-cwd" % "1.0-dt-20180214Z-b65fce",
  "org.scalablytyped" %%% "jasmine" % "3.3-dt-20190212Z-884fde",
  "org.scalablytyped" %%% "jasminewd2" % "2.0-dt-20181026Z-d9e865",
  "org.scalablytyped" %%% "merge2" % "1.1-dt-20180214Z-8d8873",
  "org.scalablytyped" %%% "micromatch" % "3.1-dt-20180214Z-3ed78d",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180214Z-0a2b2c",
  "org.scalablytyped" %%% "minimist" % "1.2.0-dt-20180214Z-b5ce4c",
  "org.scalablytyped" %%% "mrmlnc__readdir-enhanced" % "2.2.1-84f869",
  "org.scalablytyped" %%% "node" % "11.11-dt-20190312Z-f6d9fe",
  "org.scalablytyped" %%% "nodelib__fs_dot_stat" % "1.1.3-c86c20",
  "org.scalablytyped" %%% "optimist" % "0.0-unknown-dt-20180214Z-ebcd79",
  "org.scalablytyped" %%% "p-map" % "2.0.0-8063aa",
  "org.scalablytyped" %%% "pify" % "3.0.0-dt-20180501Z-937816",
  "org.scalablytyped" %%% "q" % "1.5-dt-20181124Z-56253f",
  "org.scalablytyped" %%% "request" % "2.48-dt-20190117Z-3de9e4",
  "org.scalablytyped" %%% "rimraf" % "2.0-dt-20180214Z-a1c724",
  "org.scalablytyped" %%% "selenium-webdriver" % "3.0-dt-20190212Z-40f0fe",
  "org.scalablytyped" %%% "semver" % "5.5-dt-20180214Z-cc5b51",
  "org.scalablytyped" %%% "slash" % "2.0-dt-20181224Z-adddb4",
  "org.scalablytyped" %%% "source-map-support" % "0.5-dt-20190224Z-7ff9df",
  "org.scalablytyped" %%% "std" % "3.3-ec2942",
  "org.scalablytyped" %%% "supports-color" % "5.3-dt-20180409Z-155129",
  "org.scalablytyped" %%% "tough-cookie" % "2.3-dt-20190117Z-0cc572",
  "org.scalablytyped" %%% "webdriver-js-extender" % "2.1.0-3aa39d",
  "org.scalablytyped" %%% "webdriver-manager" % "12.1.1-c0a90e",
  "org.scalablytyped" %%% "xml2js" % "0.4-dt-20180606Z-0210f1")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        