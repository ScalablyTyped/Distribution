organization := "org.scalablytyped"
name := "redux-first-router-restore-scroll"
version := "1.2-dt-20180428Z-0c69ee"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "history" % "4.7.2-dt-20190322Z-796a7a",
  "org.scalablytyped" %%% "redux" % "4.0.4-567508",
  "org.scalablytyped" %%% "redux-first-router" % "2.1-dt-20190522Z-8c931f",
  "org.scalablytyped" %%% "std" % "3.5-65dbfc")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        