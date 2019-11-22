organization := "org.scalablytyped"
name := "rollup-plugin-postcss"
version := "2.0-dt-20190808Z-3a699a"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "cssnano" % "4.0-dt-20180802Z-e54f6e",
  "org.scalablytyped" %%% "estree" % "0.0-unknown-dt-20191119Z-189c55",
  "org.scalablytyped" %%% "node" % "12.12-dt-20191119Z-94c257",
  "org.scalablytyped" %%% "postcss" % "7.0.18-98059c",
  "org.scalablytyped" %%% "rollup" % "1.27.3-0ded9e",
  "org.scalablytyped" %%% "source-map" % "0.7.3-00bd51",
  "org.scalablytyped" %%% "std" % "3.7-1c17cf")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        