organization := "org.scalablytyped"
name := "protractor-browser-logs"
version := "1.0-dt-20200226Z-575149"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "blocking-proxy" % "1.0.1-ef2bc8",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-814aa8",
  "org.scalablytyped" %%% "protractor" % "7.0.0-ebfdda",
  "org.scalablytyped" %%% "q" % "1.5-dt-20201002Z-f54a76",
  "org.scalablytyped" %%% "selenium-webdriver" % "4.0-dt-20201028Z-25e67c",
  "org.scalablytyped" %%% "std" % "4.1-044efb",
  "org.scalablytyped" %%% "webdriver-js-extender" % "2.1.0-9a4217")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
