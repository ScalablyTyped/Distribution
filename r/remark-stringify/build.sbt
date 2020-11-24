organization := "org.scalablytyped"
name := "remark-stringify"
version := "8.1.1-f59488"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "std" % "4.1-c651d0",
  "org.scalablytyped" %%% "unified" % "8.4.2-c1095e",
  "org.scalablytyped" %%% "unist" % "2.0-dt-20190213Z-da75dd",
  "org.scalablytyped" %%% "vfile" % "4.2.0-594d72",
  "org.scalablytyped" %%% "vfile-message" % "2.0.4-13035e")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
