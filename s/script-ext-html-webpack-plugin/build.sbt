organization := "org.scalablytyped"
name := "script-ext-html-webpack-plugin"
version := "2.1-dt-20190712Z-19d9ef"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "anymatch" % "1.3-dt-20190212Z-84e0a0",
  "org.scalablytyped" %%% "node" % "12.12-dt-20191126Z-959704",
  "org.scalablytyped" %%% "source-list-map" % "v0.1.6-dt-20190322Z-67a687",
  "org.scalablytyped" %%% "source-map" % "0.7.3-651620",
  "org.scalablytyped" %%% "std" % "3.7-1d724d",
  "org.scalablytyped" %%% "tapable" % "v1.0.0-dt-20190322Z-7c63f1",
  "org.scalablytyped" %%% "uglify-js" % "3.0-dt-20181015Z-c659dd",
  "org.scalablytyped" %%% "webpack" % "4.41-dt-20191116Z-bfd05e",
  "org.scalablytyped" %%% "webpack-sources" % "0.1-dt-20180625Z-05c57b")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        