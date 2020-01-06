organization := "org.scalablytyped"
name := "rollup-plugin-delete"
version := "1.1.0-465891"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "del" % "5.1.0-b064e9",
  "org.scalablytyped" %%% "estree" % "0.0-unknown-dt-20191223Z-83fb5c",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20180920Z-064f00",
  "org.scalablytyped" %%% "globby" % "10.0.1-592d22",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180214Z-d2df64",
  "org.scalablytyped" %%% "node" % "13.1-dt-20200103Z-b9f880",
  "org.scalablytyped" %%% "rollup" % "1.27.14-1753cc",
  "org.scalablytyped" %%% "std" % "3.7-b6d959")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        