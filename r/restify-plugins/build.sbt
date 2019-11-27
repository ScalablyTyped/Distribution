organization := "org.scalablytyped"
name := "restify-plugins"
version := "1.5-dt-20181015Z-dc014b"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "bunyan" % "1.8-dt-20190311Z-3d5c10",
  "org.scalablytyped" %%% "formidable" % "1.0.16-dt-20190322Z-c2f69c",
  "org.scalablytyped" %%% "node" % "12.12-dt-20191126Z-08e889",
  "org.scalablytyped" %%% "restify" % "8.4-dt-20191119Z-e42b11",
  "org.scalablytyped" %%% "spdy" % "3.4-dt-20181121Z-7ec113",
  "org.scalablytyped" %%% "std" % "3.7-1d724d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        