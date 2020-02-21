organization := "org.scalablytyped"
name := "rollup-plugin-delete"
version := "1.2.0-002f47"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "del" % "5.1.0-c9bb26",
  "org.scalablytyped" %%% "estree" % "0.0-unknown-dt-20200108Z-f39507",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20180920Z-6f0a56",
  "org.scalablytyped" %%% "globby" % "10.0.2-b1515d",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180214Z-623092",
  "org.scalablytyped" %%% "node" % "13.7-dt-20200211Z-d6af7e",
  "org.scalablytyped" %%% "rollup" % "1.31.1-26b1ed",
  "org.scalablytyped" %%% "std" % "3.7-1b8369")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
