organization := "org.scalablytyped"
name := "redux-first-router-restore-scroll"
version := "1.2-dt-20190730Z-c922b1"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "history" % "4.7.2-dt-20200226Z-849324",
  "org.scalablytyped" %%% "redux" % "4.0.5-069469",
  "org.scalablytyped" %%% "redux-first-router" % "2.1-dt-20200225Z-982f8e",
  "org.scalablytyped" %%% "std" % "3.8-9b2470")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
