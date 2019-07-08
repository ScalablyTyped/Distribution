organization := "org.scalablytyped"
name := "promise-ftp"
version := "1.3-dt-20190524Z-b03322"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20190524Z-aebf09",
  "org.scalablytyped" %%% "ftp" % "0.3.8-dt-20190322Z-4ccd9e",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190703Z-a67e53",
  "org.scalablytyped" %%% "promise-ftp-common" % "1.1-dt-20180709Z-d4bcd7",
  "org.scalablytyped" %%% "std" % "3.5-983486")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        