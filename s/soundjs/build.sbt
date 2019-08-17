organization := "org.scalablytyped"
name := "soundjs"
version := "0.6.0-dt-20190322Z-05b032"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "createjs-lib" % "0.0-unknown-dt-20190322Z-1c8906",
  "org.scalablytyped" %%% "preloadjs" % "0.6.2-dt-20190322Z-496e68",
  "org.scalablytyped" %%% "std" % "3.5-cd493c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        