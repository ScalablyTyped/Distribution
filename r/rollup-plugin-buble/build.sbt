organization := "org.scalablytyped"
name := "rollup-plugin-buble"
version := "0.19-dt-20190312Z-9b239c"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "buble" % "0.19-dt-20190312Z-2c8b77",
  "org.scalablytyped" %%% "estree" % "0.0-unknown-dt-20200320Z-7314fa",
  "org.scalablytyped" %%% "magic-string" % "0.25.6-6d7cf4",
  "org.scalablytyped" %%% "node" % "13.13-dt-20200417Z-f3d81d",
  "org.scalablytyped" %%% "rollup" % "1.32.1-9671cc",
  "org.scalablytyped" %%% "std" % "3.8-9b2470")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
