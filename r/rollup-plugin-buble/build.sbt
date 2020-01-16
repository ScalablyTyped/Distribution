organization := "org.scalablytyped"
name := "rollup-plugin-buble"
version := "0.19-dt-20190312Z-6050c3"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "buble" % "0.19-dt-20190312Z-7fad16",
  "org.scalablytyped" %%% "estree" % "0.0-unknown-dt-20200108Z-c5f6cd",
  "org.scalablytyped" %%% "magic-string" % "0.25.4-6fbc45",
  "org.scalablytyped" %%% "node" % "13.1-dt-20200115Z-14f523",
  "org.scalablytyped" %%% "rollup" % "1.29.0-9c0ff7",
  "org.scalablytyped" %%% "std" % "3.7-b6d959")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        