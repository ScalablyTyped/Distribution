organization := "org.scalablytyped"
name := "react-loadable-visibility"
version := "3.0-dt-20191126Z-ebbea3"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "anymatch" % "1.3-dt-20190212Z-d4520c",
  "org.scalablytyped" %%% "csstype" % "2.6.6-fd5644",
  "org.scalablytyped" %%% "loadable__component" % "5.10-dt-20190711Z-fb663d",
  "org.scalablytyped" %%% "node" % "13.1-dt-20200115Z-14f523",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190924Z-b24434",
  "org.scalablytyped" %%% "react" % "16.9-dt-20191220Z-22d23f",
  "org.scalablytyped" %%% "react-loadable" % "5.5-dt-20191209Z-230ae3",
  "org.scalablytyped" %%% "source-list-map" % "v0.1.6-dt-20190322Z-beaace",
  "org.scalablytyped" %%% "source-map" % "0.7.3-f4c7eb",
  "org.scalablytyped" %%% "std" % "3.7-b6d959",
  "org.scalablytyped" %%% "tapable" % "v1.0.0-dt-20200111Z-18f558",
  "org.scalablytyped" %%% "uglify-js" % "3.0-dt-20181015Z-0ca3a8",
  "org.scalablytyped" %%% "webpack" % "4.41-dt-20200107Z-c88c35",
  "org.scalablytyped" %%% "webpack-sources" % "0.1-dt-20180625Z-d3d687")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        