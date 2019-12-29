organization := "org.scalablytyped"
name := "react-mce"
version := "0.6-dt-20180806Z-11b262"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "csstype" % "2.6.6-32adec",
  "org.scalablytyped" %%% "jquery" % "3.3-dt-20191126Z-13d8c2",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190924Z-bfe2c5",
  "org.scalablytyped" %%% "react" % "16.9-dt-20191220Z-73a5bc",
  "org.scalablytyped" %%% "sizzle" % "2.3-dt-20181006Z-95a8d0",
  "org.scalablytyped" %%% "std" % "3.7-953338",
  "org.scalablytyped" %%% "tinymce" % "4.5-dt-20190821Z-f29904")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        