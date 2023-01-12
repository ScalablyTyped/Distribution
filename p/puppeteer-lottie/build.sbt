organization := "org.scalablytyped"
name := "puppeteer-lottie"
version := "1.1-dt-20221102Z-344f6c"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "debug" % "4.1-dt-20211202Z-abc15b",
  "org.scalablytyped" %%% "devtools-protocol" % "0.0.1070637-f8078b",
  "org.scalablytyped" %%% "lottie-web" % "5.9.6-ca0680",
  "org.scalablytyped" %%% "ms" % "v0.7.1-dt-20220818Z-d75a3b",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-874609",
  "org.scalablytyped" %%% "puppeteer" % "19.2.2-a606ef",
  "org.scalablytyped" %%% "puppeteer-core" % "19.2.2-cc2dbd",
  "org.scalablytyped" %%% "std" % "4.9-ecb5eb",
  "org.scalablytyped" %%% "ws" % "8.5-dt-20220624Z-507aa7")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
