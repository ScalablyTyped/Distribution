organization := "org.scalablytyped"
name := "restify-cors-middleware"
version := "1.0-dt-20180214Z-b3f071"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "bunyan" % "1.8-dt-20200226Z-10683e",
  "org.scalablytyped" %%% "formidable" % "1.0.16-dt-20200225Z-596d1b",
  "org.scalablytyped" %%% "node" % "13.11-dt-20200402Z-9a87f0",
  "org.scalablytyped" %%% "restify" % "8.4-dt-20200225Z-bb657f",
  "org.scalablytyped" %%% "spdy" % "3.4-dt-20200227Z-48dded",
  "org.scalablytyped" %%% "std" % "3.8-a0108c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
