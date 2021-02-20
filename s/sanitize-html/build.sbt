organization := "org.scalablytyped"
name := "sanitize-html"
version := "1.27-dt-20200909Z-dc68c2"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.0",
  "org.scalablytyped" %%% "domhandler" % "2.4-dt-20200515Z-71d01c",
  "org.scalablytyped" %%% "domutils" % "1.7-dt-20200908Z-5f7db5",
  "org.scalablytyped" %%% "htmlparser2" % "v3.10.x-dt-20201002Z-921093",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-50d3d9",
  "org.scalablytyped" %%% "std" % "4.1-40053c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
