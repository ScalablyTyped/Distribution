organization := "org.scalablytyped"
name := "sinon-chrome"
version := "v2.2.4-dt-20190322Z-c89349"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "chrome" % "0.0-unknown-dt-20190322Z-0c1b96",
  "org.scalablytyped" %%% "filesystem" % "0.0-unknown-dt-20190322Z-e059a1",
  "org.scalablytyped" %%% "filewriter" % "0.0-unknown-dt-20190322Z-a98cac",
  "org.scalablytyped" %%% "sinon" % "7.0-dt-20190313Z-2449d4",
  "org.scalablytyped" %%% "std" % "3.3-ec2942")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        