organization := "org.scalablytyped"
name := "sc-hot-reboot"
version := "1.0-dt-20190224Z-ba6911"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "anymatch" % "1.3-dt-20190212Z-63350e",
  "org.scalablytyped" %%% "braces" % "2.3-dt-20180214Z-7fa312",
  "org.scalablytyped" %%% "chokidar" % "2.1.5-a8059a",
  "org.scalablytyped" %%% "glob-parent" % "3.1-dt-20180214Z-f2c726",
  "org.scalablytyped" %%% "inherits" % "0.0-unknown-dt-20190322Z-2a9acd",
  "org.scalablytyped" %%% "is-binary-path" % "2.0-dt-20180214Z-56a50c",
  "org.scalablytyped" %%% "is-glob" % "4.0-dt-20180214Z-35474d",
  "org.scalablytyped" %%% "jsonwebtoken" % "8.3-dt-20190304Z-7d898d",
  "org.scalablytyped" %%% "node" % "11.11-dt-20190325Z-000e7b",
  "org.scalablytyped" %%% "normalize-path" % "3.0-dt-20181225Z-e46ce6",
  "org.scalablytyped" %%% "path-is-absolute" % "1.0-dt-20180214Z-096348",
  "org.scalablytyped" %%% "sc-auth" % "5.0-dt-20181130Z-6a83c6",
  "org.scalablytyped" %%% "socketcluster" % "14.0-dt-20190212Z-c09bb8",
  "org.scalablytyped" %%% "std" % "3.3-14e863",
  "org.scalablytyped" %%% "upath" % "1.1.2-41f636")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        