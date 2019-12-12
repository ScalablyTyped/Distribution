organization := "org.scalablytyped"
name := "rollup-plugin-delete"
version := "1.1.0-f762e3"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "del" % "5.1.0-e3265b",
  "org.scalablytyped" %%% "estree" % "0.0-unknown-dt-20191119Z-069b07",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20180920Z-ffd39a",
  "org.scalablytyped" %%% "globby" % "10.0.1-512e36",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180214Z-bf1299",
  "org.scalablytyped" %%% "node" % "12.12-dt-20191126Z-959704",
  "org.scalablytyped" %%% "rollup" % "1.27.5-18c40e",
  "org.scalablytyped" %%% "std" % "3.7-1d724d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        