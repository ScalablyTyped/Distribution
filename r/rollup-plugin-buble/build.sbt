organization := "org.scalablytyped"
name := "rollup-plugin-buble"
version := "0.19-dt-20190312Z-1de261"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "buble" % "0.19-dt-20190312Z-62d290",
  "org.scalablytyped" %%% "estree" % "0.0-unknown-dt-20190322Z-f5e4db",
  "org.scalablytyped" %%% "magic-string" % "0.25.2-9e4ef8",
  "org.scalablytyped" %%% "node" % "12.6-dt-20190708Z-e1e986",
  "org.scalablytyped" %%% "rollup" % "1.16.6-861d53",
  "org.scalablytyped" %%% "std" % "3.5-983486")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        