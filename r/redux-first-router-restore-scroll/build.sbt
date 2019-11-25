organization := "org.scalablytyped"
name := "redux-first-router-restore-scroll"
version := "1.2-dt-20190730Z-6e8bcd"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "history" % "4.7.2-dt-20190822Z-4ceb2f",
  "org.scalablytyped" %%% "redux" % "4.0.4-c08a69",
  "org.scalablytyped" %%% "redux-first-router" % "2.1-dt-20190730Z-5c43be",
  "org.scalablytyped" %%% "std" % "3.7-1d724d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        