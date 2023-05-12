organization := "org.scalablytyped"
name := "protractor-browser-logs"
version := "1.0-dt-20211202Z-6b4338"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "blocking-proxy" % "1.0.1-db11d6",
  "org.scalablytyped" %%% "node" % "20.1-dt-20230511Z-0320fc",
  "org.scalablytyped" %%% "protractor" % "7.0.0-d2013c",
  "org.scalablytyped" %%% "q" % "1.5-dt-20221230Z-f67b26",
  "org.scalablytyped" %%% "selenium-webdriver" % "4.1-dt-20230429Z-018880",
  "org.scalablytyped" %%% "std" % "5.0-e63739",
  "org.scalablytyped" %%% "webdriver-js-extender" % "2.2.0-826e75",
  "org.scalablytyped" %%% "ws" % "8.5-dt-20221230Z-106f12")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
