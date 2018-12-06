organization := "org.scalablytyped"
name := "protractor"
version := "5.4.1-66aafe"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "adm-zip" % "v0.4.4-dt-20180910Z-bd763a",
  "org.scalablytyped" %%% "ansi-styles" % "3.2.1-dt-20181018Z-c75411",
  "org.scalablytyped" %%% "blocking-proxy" % "1.0.1-acf22b",
  "org.scalablytyped" %%% "caseless" % "0.12-dt-20180910Z-88463f",
  "org.scalablytyped" %%% "chalk" % "2.4.1-668e15",
  "org.scalablytyped" %%% "color-name" % "1.1-dt-20180910Z-2e1e39",
  "org.scalablytyped" %%% "del" % "3.0-dt-20180910Z-b079ad",
  "org.scalablytyped" %%% "escape-string-regexp" % "1.0-dt-20180910Z-7b7662",
  "org.scalablytyped" %%% "form-data" % "2.2-dt-20181120Z-961b6c",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20180927Z-63ba70",
  "org.scalablytyped" %%% "ini" % "v1.3.3-dt-20181129Z-9253c2",
  "org.scalablytyped" %%% "jasmine" % "3.3-dt-20181204Z-3b50b8",
  "org.scalablytyped" %%% "jasminewd2" % "2.0-dt-20181109Z-d6c4ae",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180910Z-4563df",
  "org.scalablytyped" %%% "minimist" % "1.2.0-dt-20180910Z-231fe7",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181203Z-d9c01e",
  "org.scalablytyped" %%% "optimist" % "0.0-unknown-dt-20180910Z-697cb7",
  "org.scalablytyped" %%% "q" % "1.5-dt-20181206Z-1f4c94",
  "org.scalablytyped" %%% "request" % "2.48-dt-20181105Z-2b1e0f",
  "org.scalablytyped" %%% "rimraf" % "2.0-dt-20180910Z-017a29",
  "org.scalablytyped" %%% "selenium-webdriver" % "3.0-dt-20181109Z-996d66",
  "org.scalablytyped" %%% "semver" % "5.5-dt-20180910Z-c36488",
  "org.scalablytyped" %%% "source-map-support" % "0.4-dt-20180910Z-762bad",
  "org.scalablytyped" %%% "std" % "3.2.1-edfe2b",
  "org.scalablytyped" %%% "supports-color" % "5.3-dt-20180910Z-b77f09",
  "org.scalablytyped" %%% "tough-cookie" % "2.3-dt-20181104Z-171ce9",
  "org.scalablytyped" %%% "webdriver-js-extender" % "2.1.0-064159",
  "org.scalablytyped" %%% "webdriver-manager" % "12.1.0-cc28e3",
  "org.scalablytyped" %%% "xml2js" % "0.4-dt-20180910Z-766ebf")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        