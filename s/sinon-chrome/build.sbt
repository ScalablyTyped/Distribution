organization := "org.scalablytyped"
name := "sinon-chrome"
version := "v2.2.4-dt-20190322Z-06ab07"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "chrome" % "0.0-unknown-dt-20191126Z-8c8bc4",
  "org.scalablytyped" %%% "filesystem" % "0.0-unknown-dt-20190322Z-9a7432",
  "org.scalablytyped" %%% "filewriter" % "0.0-unknown-dt-20190322Z-8fdb2f",
  "org.scalablytyped" %%% "sinon" % "7.5-dt-20191120Z-4320a0",
  "org.scalablytyped" %%% "std" % "3.7-953338")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        