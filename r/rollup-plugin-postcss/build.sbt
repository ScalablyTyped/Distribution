organization := "org.scalablytyped"
name := "rollup-plugin-postcss"
version := "2.0-dt-20200515Z-182586"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "cssnano" % "4.0-dt-20180802Z-6f44bb",
  "org.scalablytyped" %%% "estree" % "0.0-unknown-dt-20200623Z-7e9f3c",
  "org.scalablytyped" %%% "node" % "14.0-dt-20200624Z-2fcd45",
  "org.scalablytyped" %%% "postcss" % "7.0.27-3eac82",
  "org.scalablytyped" %%% "rollup" % "1.32.1-8cdd08",
  "org.scalablytyped" %%% "source-map" % "0.7.3-8b5450",
  "org.scalablytyped" %%% "std" % "3.9-c9f1f8")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
