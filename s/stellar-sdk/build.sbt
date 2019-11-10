organization := "org.scalablytyped"
name := "stellar-sdk"
version := "3.1.2-8252eb"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "axios" % "0.19.0-5acbe1",
  "org.scalablytyped" %%% "node" % "12.12-dt-20191108Z-6cbaae",
  "org.scalablytyped" %%% "std" % "3.7-1c17cf",
  "org.scalablytyped" %%% "stellar-base" % "2.1.2-fd647c",
  "org.scalablytyped" %%% "urijs" % "1.19-dt-20190924Z-e41f25")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        