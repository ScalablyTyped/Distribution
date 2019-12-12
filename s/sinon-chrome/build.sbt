organization := "org.scalablytyped"
name := "sinon-chrome"
version := "v2.2.4-dt-20190322Z-ed9f82"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "chrome" % "0.0-unknown-dt-20191126Z-637738",
  "org.scalablytyped" %%% "filesystem" % "0.0-unknown-dt-20190322Z-8283e4",
  "org.scalablytyped" %%% "filewriter" % "0.0-unknown-dt-20190322Z-e77311",
  "org.scalablytyped" %%% "sinon" % "7.5-dt-20191120Z-c3a1fc",
  "org.scalablytyped" %%% "std" % "3.7-1d724d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        