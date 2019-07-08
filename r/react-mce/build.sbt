organization := "org.scalablytyped"
name := "react-mce"
version := "0.6-dt-20180806Z-3153b0"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "csstype" % "2.6.5-523284",
  "org.scalablytyped" %%% "jquery" % "3.3-dt-20190624Z-b9b940",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190417Z-c6e514",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190703Z-5fe923",
  "org.scalablytyped" %%% "sizzle" % "2.3-dt-20181006Z-c53ffb",
  "org.scalablytyped" %%% "std" % "3.5-983486",
  "org.scalablytyped" %%% "tinymce" % "4.5-dt-20190514Z-f6d587")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        