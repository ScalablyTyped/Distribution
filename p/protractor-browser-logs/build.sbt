organization := "org.scalablytyped"
name := "protractor-browser-logs"
version := "1.0-dt-20211202Z-9d9320"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "blocking-proxy" % "1.0.1-40c9a1",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221020Z-d73de4",
  "org.scalablytyped" %%% "protractor" % "7.0.0-4c7cc1",
  "org.scalablytyped" %%% "q" % "1.5-dt-20220819Z-1566b2",
  "org.scalablytyped" %%% "selenium-webdriver" % "4.1-dt-20221018Z-e8d527",
  "org.scalablytyped" %%% "std" % "4.8-3c7765",
  "org.scalablytyped" %%% "webdriver-js-extender" % "2.2.0-8d1a99",
  "org.scalablytyped" %%% "ws" % "8.5-dt-20220624Z-a7f58f")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
