organization := "org.scalablytyped"
name := "sinon-chrome"
version := "v2.2.4-dt-20181212Z-59b427"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "chrome" % "0.0-unknown-dt-20190218Z-9963d2",
  "org.scalablytyped" %%% "filesystem" % "0.0-unknown-dt-20180827Z-f5bcdf",
  "org.scalablytyped" %%% "filewriter" % "0.0-unknown-dt-20180214Z-a98cac",
  "org.scalablytyped" %%% "sinon" % "7.0-dt-20190313Z-2449d4",
  "org.scalablytyped" %%% "std" % "3.3-ec2942")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        