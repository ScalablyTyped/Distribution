organization := "org.scalablytyped"
name := "randoma"
version := "1.3.0-baf42a"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "color" % "3.0-dt-20200515Z-d6323b",
  "org.scalablytyped" %%% "color-convert" % "1.9-dt-20200515Z-263375",
  "org.scalablytyped" %%% "color-name" % "1.1-dt-20200515Z-722201",
  "org.scalablytyped" %%% "std" % "3.9-bafc13")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
