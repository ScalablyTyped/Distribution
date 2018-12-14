organization := "org.scalablytyped"
name := "sinon-chrome"
version := "v2.2.4-dt-20181213Z-4ae6af"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "chrome" % "0.0-unknown-dt-20181120Z-e89ec6",
  "org.scalablytyped" %%% "filesystem" % "0.0-unknown-dt-20180910Z-430f10",
  "org.scalablytyped" %%% "filewriter" % "0.0-unknown-dt-20180910Z-dbeaa2",
  "org.scalablytyped" %%% "sinon" % "7.0-dt-20181213Z-3ccc57",
  "org.scalablytyped" %%% "std" % "3.2.2-beaa2f")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        