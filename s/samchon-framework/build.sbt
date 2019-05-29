organization := "org.scalablytyped"
name := "samchon-framework"
version := "2.1.4-5b1c95"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "ecol" % "1.0.4-a0594a",
  "org.scalablytyped" %%% "samchon" % "2.1.4-803867",
  "org.scalablytyped" %%% "std" % "3.4-ef47bb",
  "org.scalablytyped" %%% "sxml" % "1.0.3-5c2cda",
  "org.scalablytyped" %%% "tstl" % "2.1.4-0230ab",
  "org.scalablytyped" %%% "url-variables" % "1.0.2-83f845")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        