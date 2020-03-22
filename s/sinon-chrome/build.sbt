organization := "org.scalablytyped"
name := "sinon-chrome"
version := "v2.2.4-dt-20190322Z-562559"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "chrome" % "0.0-unknown-dt-20200211Z-ea5b3a",
  "org.scalablytyped" %%% "filesystem" % "0.0-unknown-dt-20190322Z-c151af",
  "org.scalablytyped" %%% "filewriter" % "0.0-unknown-dt-20190322Z-e61265",
  "org.scalablytyped" %%% "sinon" % "7.5-dt-20191120Z-d72a6c",
  "org.scalablytyped" %%% "std" % "3.8-a0108c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
