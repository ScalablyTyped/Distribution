organization := "org.scalablytyped"
name := "redux-first-router-restore-scroll"
version := "1.2-dt-20190730Z-bdae51"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "history" % "4.7.2-dt-20200114Z-accc59",
  "org.scalablytyped" %%% "redux" % "4.0.5-eabae9",
  "org.scalablytyped" %%% "redux-first-router" % "2.1-dt-20200106Z-5ddf80",
  "org.scalablytyped" %%% "std" % "3.7-b6d959")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        