organization := "org.scalablytyped"
name := "recharts"
version := "1.8-dt-20200320Z-e4408a"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "csstype" % "2.6.9-313239",
  "org.scalablytyped" %%% "d3-path" % "1.0-dt-20190212Z-ab650c",
  "org.scalablytyped" %%% "d3-shape" % "1.3-dt-20200225Z-cb4d23",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190924Z-11830c",
  "org.scalablytyped" %%% "react" % "16.9-dt-20200409Z-0bc722",
  "org.scalablytyped" %%% "std" % "3.8-9b2470")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
